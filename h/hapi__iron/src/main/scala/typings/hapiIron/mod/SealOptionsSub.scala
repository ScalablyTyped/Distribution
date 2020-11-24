package typings.hapiIron.mod

import typings.hapiIron.hapiIronStrings.`aes-128-ctr`
import typings.hapiIron.hapiIronStrings.`aes-256-cbc`
import typings.hapiIron.hapiIronStrings.sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SealOptionsSub extends js.Object {
  
  /**
    The algorithm used. Defaults to 'aes-256-cbc' for encryption and 'sha256' for integrity.
    */
  var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256 = js.native
  
  /**
    The number of iterations used to derive a key from the password. Defaults to 1.
    */
  var iterations: Double = js.native
  
  /**
    Minimum password size. Defaults to 32.
    */
  var minPasswordlength: Double = js.native
  
  /**
    The length of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result). Defaults to 256.
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
