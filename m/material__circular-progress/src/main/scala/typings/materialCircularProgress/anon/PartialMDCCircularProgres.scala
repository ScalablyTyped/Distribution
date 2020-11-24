package typings.materialCircularProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/circular-progress.@material/circular-progress/adapter.MDCCircularProgressAdapter> */
@js.native
trait PartialMDCCircularProgres extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var getDeterminateCircleAttribute: js.UndefOr[js.Function1[/* attributeName */ String, String | Null]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var removeAttribute: js.UndefOr[js.Function1[/* attributeName */ String, Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setAttribute: js.UndefOr[js.Function2[/* attributeName */ String, /* value */ String, Unit]] = js.native
  
  var setDeterminateCircleAttribute: js.UndefOr[js.Function2[/* attributeName */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCCircularProgres {
  
  @scala.inline
  def apply(): PartialMDCCircularProgres = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCCircularProgres]
  }
  
  @scala.inline
  implicit class PartialMDCCircularProgresOps[Self <: PartialMDCCircularProgres] (val x: Self) extends AnyVal {
    
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
    def setGetDeterminateCircleAttribute(value: /* attributeName */ String => String | Null): Self = this.set("getDeterminateCircleAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDeterminateCircleAttribute: Self = this.set("getDeterminateCircleAttribute", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setRemoveAttribute(value: /* attributeName */ String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveAttribute: Self = this.set("removeAttribute", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetAttribute(value: (/* attributeName */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
    
    @scala.inline
    def setSetDeterminateCircleAttribute(value: (/* attributeName */ String, /* value */ String) => Unit): Self = this.set("setDeterminateCircleAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetDeterminateCircleAttribute: Self = this.set("setDeterminateCircleAttribute", js.undefined)
  }
}
