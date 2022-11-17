package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Arialabelledby
import typings.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/core/Tabs/Tabs", JSImport.Default)
  @js.native
  val default: OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, "button"]]]] = js.native
  
  trait TabsActions extends StObject {
    
    def updateIndicator(): Unit
    
    def updateScrollButtons(): Unit
  }
  object TabsActions {
    
    inline def apply(updateIndicator: () => Unit, updateScrollButtons: () => Unit): TabsActions = {
      val __obj = js.Dynamic.literal(updateIndicator = js.Any.fromFunction0(updateIndicator), updateScrollButtons = js.Any.fromFunction0(updateScrollButtons))
      __obj.asInstanceOf[TabsActions]
    }
    
    extension [Self <: TabsActions](x: Self) {
      
      inline def setUpdateIndicator(value: () => Unit): Self = StObject.set(x, "updateIndicator", js.Any.fromFunction0(value))
      
      inline def setUpdateScrollButtons(value: () => Unit): Self = StObject.set(x, "updateScrollButtons", js.Any.fromFunction0(value))
    }
  }
  
  object TabsClassKey {
    
    inline def centered: "centered" = "centered".asInstanceOf["centered"]
    
    inline def fixed: "fixed" = "fixed".asInstanceOf["fixed"]
    
    inline def flexContainer: "flexContainer" = "flexContainer".asInstanceOf["flexContainer"]
    
    inline def indicator: "indicator" = "indicator".asInstanceOf["indicator"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def scrollButtons: "scrollButtons" = "scrollButtons".asInstanceOf["scrollButtons"]
    
    inline def scrollButtonsDesktop: "scrollButtonsDesktop" = "scrollButtonsDesktop".asInstanceOf["scrollButtonsDesktop"]
    
    inline def scrollable: "scrollable" = "scrollable".asInstanceOf["scrollable"]
    
    inline def scroller: "scroller" = "scroller".asInstanceOf["scroller"]
  }
  type TabsClassKey = "root" | "flexContainer" | "scroller" | "fixed" | "scrollable" | "centered" | "scrollButtons" | "scrollButtonsDesktop" | "indicator"
  
  type TabsProps[D /* <: ElementType[Any] */, P] = OverrideProps[TabsTypeMap[P, D], D]
  
  trait TabsTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: TabsClassKey
    
    var defaultComponent: D
    
    var props: P & Arialabelledby
  }
  object TabsTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: TabsClassKey, defaultComponent: D, props: P & Arialabelledby): TabsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsTypeMap[P, D]]
    }
    
    extension [Self <: TabsTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (TabsTypeMap[P, D])) {
      
      inline def setClassKey(value: TabsClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Arialabelledby): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, "button"]]]]
  
  /* This means you don't have to write `default`, but can instead just say `tabsTabsMod.foo` */
  override def _to: OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, "button"]]]] = default
}
