package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Placement
import typings.popperJs.mod.ReferenceObject
import typings.react.mod.ComponentType
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperPopperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Popper/Popper", JSImport.Default)
  @js.native
  val default: ComponentType[PopperProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.`bottom-end`
    - typings.materialUiCore.materialUiCoreStrings.`bottom-start`
    - typings.materialUiCore.materialUiCoreStrings.bottom
    - typings.materialUiCore.materialUiCoreStrings.`left-end`
    - typings.materialUiCore.materialUiCoreStrings.`left-start`
    - typings.materialUiCore.materialUiCoreStrings.left
    - typings.materialUiCore.materialUiCoreStrings.`right-end`
    - typings.materialUiCore.materialUiCoreStrings.`right-start`
    - typings.materialUiCore.materialUiCoreStrings.right
    - typings.materialUiCore.materialUiCoreStrings.`top-end`
    - typings.materialUiCore.materialUiCoreStrings.`top-start`
    - typings.materialUiCore.materialUiCoreStrings.top
  */
  trait PopperPlacementType extends StObject
  object PopperPlacementType {
    
    inline def bottom: typings.materialUiCore.materialUiCoreStrings.bottom = "bottom".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.bottom]
    
    inline def `bottom-end`: typings.materialUiCore.materialUiCoreStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`bottom-end`]
    
    inline def `bottom-start`: typings.materialUiCore.materialUiCoreStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`bottom-start`]
    
    inline def left: typings.materialUiCore.materialUiCoreStrings.left = "left".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.left]
    
    inline def `left-end`: typings.materialUiCore.materialUiCoreStrings.`left-end` = "left-end".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`left-end`]
    
    inline def `left-start`: typings.materialUiCore.materialUiCoreStrings.`left-start` = "left-start".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`left-start`]
    
    inline def right: typings.materialUiCore.materialUiCoreStrings.right = "right".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.right]
    
    inline def `right-end`: typings.materialUiCore.materialUiCoreStrings.`right-end` = "right-end".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`right-end`]
    
    inline def `right-start`: typings.materialUiCore.materialUiCoreStrings.`right-start` = "right-start".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`right-start`]
    
    inline def top: typings.materialUiCore.materialUiCoreStrings.top = "top".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.top]
    
    inline def `top-end`: typings.materialUiCore.materialUiCoreStrings.`top-end` = "top-end".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`top-end`]
    
    inline def `top-start`: typings.materialUiCore.materialUiCoreStrings.`top-start` = "top-start".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.`top-start`]
  }
  
  trait PopperProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var anchorEl: js.UndefOr[
        Null | HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])
      ] = js.undefined
    
    @JSName("children")
    var children_PopperProps: ReactNode | (js.Function1[/* props */ Placement, ReactNode])
    
    var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.undefined
    
    var disablePortal: js.UndefOr[Boolean] = js.undefined
    
    var keepMounted: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[js.Object] = js.undefined
    
    var open: Boolean
    
    var placement: js.UndefOr[PopperPlacementType] = js.undefined
    
    var popperOptions: js.UndefOr[js.Object] = js.undefined
    
    var transition: js.UndefOr[Boolean] = js.undefined
  }
  object PopperProps {
    
    inline def apply(open: Boolean): PopperProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperProps]
    }
    
    extension [Self <: PopperProps](x: Self) {
      
      inline def setAnchorEl(value: HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElFunction1(value: /* element */ HTMLElement => HTMLElement): Self = StObject.set(x, "anchorEl", js.Any.fromFunction1(value))
      
      inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setChildren(value: ReactNode | (js.Function1[/* props */ Placement, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ Placement => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerFunction0(value: () => ReactInstance): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
      
      inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
      
      inline def setModifiers(value: js.Object): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperOptions(value: js.Object): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type _To = ComponentType[PopperProps]
  
  /* This means you don't have to write `default`, but can instead just say `popperPopperMod.foo` */
  override def _to: ComponentType[PopperProps] = default
}
