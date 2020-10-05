package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Effects //////////////////////////////////////////////////
@js.native
trait EffectOptions extends js.Object {
  var complete: js.Function = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var effect: String = js.native
}

object EffectOptions {
  @scala.inline
  def apply(complete: js.Function, effect: String): EffectOptions = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectOptions]
  }
  @scala.inline
  implicit class EffectOptionsOps[Self <: EffectOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: js.Function): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
  
}

