package typings.materialLinearProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/linear-progress.@material/linear-progress/adapter.MDCLinearProgressAdapter> */
@js.native
trait PartialMDCLinearProgressA extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var attachResizeObserver: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ /* callback */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ _) | Null
    ]
  ] = js.native
  
  var forceLayout: js.UndefOr[js.Function0[Unit]] = js.native
  
  var getWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var removeAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setAttribute: js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]] = js.native
  
  var setBufferBarStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.native
  
  var setPrimaryBarStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.native
  
  var setStyle: js.UndefOr[js.Function2[/* styleProperty */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCLinearProgressA {
  
  @scala.inline
  def apply(): PartialMDCLinearProgressA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCLinearProgressA]
  }
  
  @scala.inline
  implicit class PartialMDCLinearProgressAOps[Self <: PartialMDCLinearProgressA] (val x: Self) extends AnyVal {
    
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
    def setAttachResizeObserver(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserverCallback */ /* callback */ js.Any => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeObserver */ _) | Null
    ): Self = this.set("attachResizeObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAttachResizeObserver: Self = this.set("attachResizeObserver", js.undefined)
    
    @scala.inline
    def setForceLayout(value: () => Unit): Self = this.set("forceLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteForceLayout: Self = this.set("forceLayout", js.undefined)
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setRemoveAttribute(value: /* name */ String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveAttribute: Self = this.set("removeAttribute", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetAttribute(value: (/* name */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
    
    @scala.inline
    def setSetBufferBarStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = this.set("setBufferBarStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetBufferBarStyle: Self = this.set("setBufferBarStyle", js.undefined)
    
    @scala.inline
    def setSetPrimaryBarStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = this.set("setPrimaryBarStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetPrimaryBarStyle: Self = this.set("setPrimaryBarStyle", js.undefined)
    
    @scala.inline
    def setSetStyle(value: (/* styleProperty */ String, /* value */ String) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
  }
}
