package typings.materialUiCore

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalPortalMod {
  
  @JSImport("@material-ui/core/Portal/Portal", JSImport.Default)
  @js.native
  class default ()
    extends Component[PortalProps, js.Object, js.Any]
  
  type Portal = Component[PortalProps, js.Object, js.Any]
  
  trait PortalProps extends StObject {
    
    var children: ReactElement
    
    var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.undefined
    
    var disablePortal: js.UndefOr[Boolean] = js.undefined
    
    var onRendered: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PortalProps {
    
    @scala.inline
    def apply(children: ReactElement): PortalProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerFunction0(value: () => ReactInstance): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      @scala.inline
      def setOnRendered(value: () => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderedUndefined: Self = StObject.set(x, "onRendered", js.undefined)
    }
  }
}
