package typings.materialUiCore.transitionMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-transition-group.react-transition-group/Transition.TransitionActions */
/* Inlined parent std.Partial<std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps<undefined>, @material-ui/core.@material-ui/core/transitions/transition.TransitionKeys>> */
@js.native
trait TransitionProps extends js.Object {
  
  var addEndListener: js.UndefOr[js.Any] = js.native
  
  /**
    * Normally a component is not transitioned if it is shown when the
    * `<Transition>` component mounts. If you want to transition on the first
    * mount set  appear to true, and the component will transition in as soon
    * as the `<Transition>` mounts. Note: there are no specific "appear" states.
    * appear only adds an additional enter transition.
    */
  var appear: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.native
  
  var in: js.UndefOr[js.Any] = js.native
  
  var mountOnEnter: js.UndefOr[js.Any] = js.native
  
  var onEnter: js.UndefOr[js.Any] = js.native
  
  var onEntered: js.UndefOr[js.Any] = js.native
  
  var onEntering: js.UndefOr[js.Any] = js.native
  
  var onExit: js.UndefOr[js.Any] = js.native
  
  var onExited: js.UndefOr[js.Any] = js.native
  
  var onExiting: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var timeout: js.UndefOr[js.Any] = js.native
  
  var unmountOnExit: js.UndefOr[js.Any] = js.native
}
object TransitionProps {
  
  @scala.inline
  def apply(): TransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps]
  }
  
  @scala.inline
  implicit class TransitionPropsOps[Self <: TransitionProps] (val x: Self) extends AnyVal {
    
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
    def setAddEndListener(value: js.Any): Self = this.set("addEndListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddEndListener: Self = this.set("addEndListener", js.undefined)
    
    @scala.inline
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setEnter(value: Boolean): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: Boolean): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setIn(value: js.Any): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setMountOnEnter(value: js.Any): Self = this.set("mountOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOnEnter: Self = this.set("mountOnEnter", js.undefined)
    
    @scala.inline
    def setOnEnter(value: js.Any): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: js.Any): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: js.Any): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    
    @scala.inline
    def setOnExit(value: js.Any): Self = this.set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: js.Any): Self = this.set("onExited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: js.Any): Self = this.set("onExiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTimeout(value: js.Any): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUnmountOnExit(value: js.Any): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
}
