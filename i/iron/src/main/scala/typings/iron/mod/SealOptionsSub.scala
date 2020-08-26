package typings.iron.mod

import typings.iron.ironStrings.`aes-128-ctr`
import typings.iron.ironStrings.`aes-256-cbc`
import typings.iron.ironStrings.sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SealOptionsSub extends js.Object {
  /**
    * the algorithm used ('aes-256-cbc' for encryption and 'sha256' for integrity are the only two supported at this time).
    */
  var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256 = js.native
  /**
    * the number of iterations used to derive a key from the password. Set to 1 by default. The number of ideal iterations
    * to use is dependent on your application's performance requirements. More iterations means it takes longer to generate the key.
    */
  var iterations: Double = js.native
  /**
    * minimum password size
    */
  var minPasswordlength: Double = js.native
  /**
    * the size of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result.
    */
  var saltBits: Double = js.native
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
  @scala.inline
  implicit class SealOptionsSubOps[Self <: SealOptionsSub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPasswordlength(value: Double): Self = this.set("minPasswordlength", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaltBits(value: Double): Self = this.set("saltBits", value.asInstanceOf[js.Any])
  }
  
}

