package typings.hapiIron.mod

import typings.hapiIron.hapiIronStrings.`aes-128-ctr`
import typings.hapiIron.hapiIronStrings.`aes-256-cbc`
import typings.hapiIron.hapiIronStrings.sha256
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@hapi/iron.@hapi/iron.SealOptionsSub, 'algorithm' | 'iterations' | 'minPasswordlength'> */
@js.native
trait GenerateKeyOptions extends js.Object {
  var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256 = js.native
  var iterations: Double = js.native
  var iv: js.UndefOr[Buffer] = js.native
  var minPasswordlength: Double = js.native
  var salt: js.UndefOr[String] = js.native
  var saltBits: js.UndefOr[Double] = js.native
}

object GenerateKeyOptions {
  @scala.inline
  def apply(algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256, iterations: Double, minPasswordlength: Double): GenerateKeyOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateKeyOptions]
  }
  @scala.inline
  implicit class GenerateKeyOptionsOps[Self <: GenerateKeyOptions] (val x: Self) extends AnyVal {
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
    def setIv(value: Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    @scala.inline
    def setSaltBits(value: Double): Self = this.set("saltBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaltBits: Self = this.set("saltBits", js.undefined)
  }
  
}

