package typings.hapiIron.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'algorithm' | 'iterations' | 'minPasswordlength' ]: @hapi/iron.@hapi/iron.SealOptionsSub[P]} */ trait GenerateKeyOptions extends js.Object {
  var iv: js.UndefOr[Buffer] = js.undefined
  var salt: js.UndefOr[String] = js.undefined
  var saltBits: js.UndefOr[Double] = js.undefined
}

object GenerateKeyOptions {
  @scala.inline
  def apply(iv: Buffer = null, salt: String = null, saltBits: Int | Double = null): GenerateKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (saltBits != null) __obj.updateDynamic("saltBits")(saltBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateKeyOptions]
  }
}

