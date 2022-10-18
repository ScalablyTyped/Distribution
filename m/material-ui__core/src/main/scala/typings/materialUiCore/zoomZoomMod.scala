package typings.materialUiCore

import typings.materialUiCore.transitionsTransitionMod.TransitionProps
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomZoomMod {
  
  @JSImport("@material-ui/core/Zoom/Zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ZoomProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ZoomProps
    extends StObject
       with TransitionProps {
    
    /**
      * A single child content element.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Enable this prop if you encounter 'Function components cannot be given refs',
      * use `unstable_createStrictModeTheme`,
      * and can't forward the ref in the child component.
      */
    var disableStrictModeCompat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the component will transition in.
      */
    @JSName("in")
    var in_ZoomProps: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ZoomProps {
    
    inline def apply(): ZoomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomProps]
    }
    
    extension [Self <: ZoomProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableStrictModeCompat(value: Boolean): Self = StObject.set(x, "disableStrictModeCompat", value.asInstanceOf[js.Any])
      
      inline def setDisableStrictModeCompatUndefined: Self = StObject.set(x, "disableStrictModeCompat", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
