package typings.ionicReact

import typings.ionicReact.anon.ComponentCanBeDestroyed
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewLifeCycleManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/ViewLifeCycleManager", "ViewLifeCycleManager")
  @js.native
  class ViewLifeCycleManager protected ()
    extends Component[ViewTransitionManagerProps, ViewTransitionManagerState, js.Any] {
    def this(props: ViewTransitionManagerProps) = this()
    
    var _isMounted: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MViewLifeCycleManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MViewLifeCycleManager(): Unit = js.native
    
    var ionLifeCycleContext: ComponentCanBeDestroyed = js.native
  }
  
  @js.native
  trait ViewTransitionManagerProps extends StObject {
    
    var mount: Boolean = js.native
    
    def removeView(): Unit = js.native
  }
  object ViewTransitionManagerProps {
    
    @scala.inline
    def apply(mount: Boolean, removeView: () => Unit): ViewTransitionManagerProps = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], removeView = js.Any.fromFunction0(removeView))
      __obj.asInstanceOf[ViewTransitionManagerProps]
    }
    
    @scala.inline
    implicit class ViewTransitionManagerPropsMutableBuilder[Self <: ViewTransitionManagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMount(value: Boolean): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveView(value: () => Unit): Self = StObject.set(x, "removeView", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ViewTransitionManagerState extends StObject {
    
    var show: Boolean = js.native
  }
  object ViewTransitionManagerState {
    
    @scala.inline
    def apply(show: Boolean): ViewTransitionManagerState = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewTransitionManagerState]
    }
    
    @scala.inline
    implicit class ViewTransitionManagerStateMutableBuilder[Self <: ViewTransitionManagerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
