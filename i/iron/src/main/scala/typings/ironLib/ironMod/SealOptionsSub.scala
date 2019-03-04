package typings
package ironLib.ironMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SealOptionsSub extends js.Object {
  /**
    * the algorithm used ('aes-256-cbc' for encryption and 'sha256' for integrity are the only two supported at this time).
    */
  var algorithm: ironLib.ironLibStrings.`aes-128-ctr` | ironLib.ironLibStrings.`aes-256-cbc` | ironLib.ironLibStrings.sha256
  /**
    * the number of iterations used to derive a key from the password. Set to 1 by default. The number of ideal iterations
    * to use is dependent on your application's performance requirements. More iterations means it takes longer to generate the key.
    */
  var iterations: scala.Double
  /**
    * minimum password size
    */
  var minPasswordlength: scala.Double
  /**
    * the size of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result.
    */
  var saltBits: scala.Double
}

object SealOptionsSub {
  @scala.inline
  def apply(
    algorithm: ironLib.ironLibStrings.`aes-128-ctr` | ironLib.ironLibStrings.`aes-256-cbc` | ironLib.ironLibStrings.sha256,
    iterations: scala.Double,
    minPasswordlength: scala.Double,
    saltBits: scala.Double
  ): SealOptionsSub = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations, minPasswordlength = minPasswordlength, saltBits = saltBits)
  
    __obj.asInstanceOf[SealOptionsSub]
  }
}

