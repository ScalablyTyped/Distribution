package typings.ionicCore.navInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionInstruction extends js.Object {
  
  var done: js.UndefOr[TransitionDoneFn] = js.native
  
  var enteringRequiresTransition: js.UndefOr[Boolean] = js.native
  
  var insertStart: js.UndefOr[Double] = js.native
  
  var insertViews: js.UndefOr[js.Array[_]] = js.native
  
  var leavingRequiresTransition: js.UndefOr[Boolean] = js.native
  
  var opts: js.UndefOr[NavOptions | Null] = js.native
  
  var reject: js.UndefOr[js.Function1[/* rejectReason */ String, Unit]] = js.native
  
  var removeCount: js.UndefOr[Double] = js.native
  
  var removeStart: js.UndefOr[Double] = js.native
  
  var removeView: js.UndefOr[typings.ionicCore.viewControllerMod.ViewController] = js.native
  
  var resolve: js.UndefOr[js.Function1[/* hasCompleted */ Boolean, Unit]] = js.native
}
object TransitionInstruction {
  
  @scala.inline
  def apply(): TransitionInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionInstruction]
  }
  
  @scala.inline
  implicit class TransitionInstructionOps[Self <: TransitionInstruction] (val x: Self) extends AnyVal {
    
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
    def setDone(
      value: (/* hasCompleted */ Boolean, /* requiresTransition */ Boolean, /* enteringView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], /* leavingView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], /* direction */ js.UndefOr[String]) => Unit
    ): Self = this.set("done", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setEnteringRequiresTransition(value: Boolean): Self = this.set("enteringRequiresTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnteringRequiresTransition: Self = this.set("enteringRequiresTransition", js.undefined)
    
    @scala.inline
    def setInsertStart(value: Double): Self = this.set("insertStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertStart: Self = this.set("insertStart", js.undefined)
    
    @scala.inline
    def setInsertViewsVarargs(value: js.Any*): Self = this.set("insertViews", js.Array(value :_*))
    
    @scala.inline
    def setInsertViews(value: js.Array[_]): Self = this.set("insertViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertViews: Self = this.set("insertViews", js.undefined)
    
    @scala.inline
    def setLeavingRequiresTransition(value: Boolean): Self = this.set("leavingRequiresTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeavingRequiresTransition: Self = this.set("leavingRequiresTransition", js.undefined)
    
    @scala.inline
    def setOpts(value: NavOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
    
    @scala.inline
    def setOptsNull: Self = this.set("opts", null)
    
    @scala.inline
    def setReject(value: /* rejectReason */ String => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReject: Self = this.set("reject", js.undefined)
    
    @scala.inline
    def setRemoveCount(value: Double): Self = this.set("removeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveCount: Self = this.set("removeCount", js.undefined)
    
    @scala.inline
    def setRemoveStart(value: Double): Self = this.set("removeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveStart: Self = this.set("removeStart", js.undefined)
    
    @scala.inline
    def setRemoveView(value: typings.ionicCore.viewControllerMod.ViewController): Self = this.set("removeView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveView: Self = this.set("removeView", js.undefined)
    
    @scala.inline
    def setResolve(value: /* hasCompleted */ Boolean => Unit): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
}
