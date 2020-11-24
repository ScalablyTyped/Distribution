package typings.materialRadio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/radio.@material/radio/adapter.MDCRadioAdapter> */
@js.native
trait PartialMDCRadioAdapter extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.native
}
object PartialMDCRadioAdapter {
  
  @scala.inline
  def apply(): PartialMDCRadioAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCRadioAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCRadioAdapterOps[Self <: PartialMDCRadioAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetNativeControlDisabled(value: /* disabled */ Boolean => Unit): Self = this.set("setNativeControlDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetNativeControlDisabled: Self = this.set("setNativeControlDisabled", js.undefined)
  }
}
