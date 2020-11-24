package typings.immer.anon

import typings.immer.mod.ImmerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFreeze extends js.Object {
  
  var autoFreeze: js.UndefOr[Boolean] = js.native
  
  var onAssign: js.UndefOr[
    js.Function3[/* state */ ImmerState[_], /* keyof any */ /* prop */ String, /* value */ js.Any, Unit]
  ] = js.native
  
  var onCopy: js.UndefOr[js.Function1[/* state */ ImmerState[_], Unit]] = js.native
  
  var onDelete: js.UndefOr[js.Function2[/* state */ ImmerState[_], /* keyof any */ /* prop */ String, Unit]] = js.native
  
  var useProxies: js.UndefOr[Boolean] = js.native
}
object AutoFreeze {
  
  @scala.inline
  def apply(): AutoFreeze = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFreeze]
  }
  
  @scala.inline
  implicit class AutoFreezeOps[Self <: AutoFreeze] (val x: Self) extends AnyVal {
    
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
    def setAutoFreeze(value: Boolean): Self = this.set("autoFreeze", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFreeze: Self = this.set("autoFreeze", js.undefined)
    
    @scala.inline
    def setOnAssign(value: (/* state */ ImmerState[_], /* keyof any */ /* prop */ String, /* value */ js.Any) => Unit): Self = this.set("onAssign", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAssign: Self = this.set("onAssign", js.undefined)
    
    @scala.inline
    def setOnCopy(value: /* state */ ImmerState[_] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnDelete(value: (/* state */ ImmerState[_], /* keyof any */ /* prop */ String) => Unit): Self = this.set("onDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    
    @scala.inline
    def setUseProxies(value: Boolean): Self = this.set("useProxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseProxies: Self = this.set("useProxies", js.undefined)
  }
}
