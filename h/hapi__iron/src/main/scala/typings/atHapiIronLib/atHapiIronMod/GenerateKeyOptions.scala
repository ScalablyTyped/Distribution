package typings
package atHapiIronLib.atHapiIronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'algorithm' | 'iterations' | 'minPasswordlength' ]: @hapi/iron.@hapi/iron.SealOptionsSub[P]} */ trait GenerateKeyOptions extends js.Object {
  var iv: js.UndefOr[java.lang.String] = js.undefined
  var salt: js.UndefOr[java.lang.String] = js.undefined
  var saltBits: js.UndefOr[scala.Double] = js.undefined
}

object GenerateKeyOptions {
  @scala.inline
  def apply(
    iv: java.lang.String = null,
    salt: java.lang.String = null,
    saltBits: scala.Int | scala.Double = null
  ): GenerateKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    if (saltBits != null) __obj.updateDynamic("saltBits")(saltBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateKeyOptions]
  }
}

