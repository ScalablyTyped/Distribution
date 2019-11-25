package typings.atHapiIron.atHapiIronMod

import typings.atHapiIron.atHapiIronStrings.`aes-128-ctr`
import typings.atHapiIron.atHapiIronStrings.`aes-256-cbc`
import typings.atHapiIron.atHapiIronStrings.sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SealOptionsSub extends js.Object {
  /**
    * the algorithm used ('aes-256-cbc' for encryption and 'sha256' for integrity are the only two supported at this time).
    */
  var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256
  /**
    * the number of iterations used to derive a key from the password. Set to 1 by default. The number of ideal iterations
    * to use is dependent on your application's performance requirements. More iterations means it takes longer to generate the key.
    */
  var iterations: Double
  /**
    * minimum password size
    */
  var minPasswordlength: Double
  /**
    * the size of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result.
    */
  var saltBits: Double
}

object SealOptionsSub {
  @scala.inline
  def apply(
    algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256,
    iterations: Double,
    minPasswordlength: Double,
    saltBits: Double
  ): SealOptionsSub = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any], saltBits = saltBits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SealOptionsSub]
  }
}

