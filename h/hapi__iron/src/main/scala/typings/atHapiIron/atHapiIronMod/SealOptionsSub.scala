package typings.atHapiIron.atHapiIronMod

import typings.atHapiIron.atHapiIronStrings.`aes-128-ctr`
import typings.atHapiIron.atHapiIronStrings.`aes-256-cbc`
import typings.atHapiIron.atHapiIronStrings.sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SealOptionsSub extends js.Object {
  /**
    The algorithm used. Defaults to 'aes-256-cbc' for encryption and 'sha256' for integrity.
    */
  var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256
  /**
    The number of iterations used to derive a key from the password. Defaults to 1.
    */
  var iterations: Double
  /**
    Minimum password size. Defaults to 32.
    */
  var minPasswordlength: Double
  /**
    The length of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result). Defaults to 256.
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

