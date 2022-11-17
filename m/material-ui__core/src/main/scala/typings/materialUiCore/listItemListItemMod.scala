package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.AlignItems
import typings.materialUiCore.anon.Button
import typings.materialUiCore.anon.`4`
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemMod extends Shortcut {
  
  /**
    * Uses an additional container component if `ListItemSecondaryAction` is the last child.
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [ListItem API](https://mui.com/api/list-item/)
    */
  @JSImport("@material-ui/core/ListItem/ListItem", JSImport.Default)
  @js.native
  val default: (OverridableComponent[ListItemTypeMap[Button, "li"]]) & (ExtendButtonBase[ListItemTypeMap[`4`, "div"]]) = js.native
  
  object ListItemClassKey {
    
    inline def default: "default" = "default".asInstanceOf["default"]
    
    inline def button: "button" = "button".asInstanceOf["button"]
    
    inline def container: "container" = "container".asInstanceOf["container"]
    
    inline def dense: "dense" = "dense".asInstanceOf["dense"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def divider: "divider" = "divider".asInstanceOf["divider"]
    
    inline def focusVisible: "focusVisible" = "focusVisible".asInstanceOf["focusVisible"]
    
    inline def gutters: "gutters" = "gutters".asInstanceOf["gutters"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def secondaryAction: "secondaryAction" = "secondaryAction".asInstanceOf["secondaryAction"]
    
    inline def selected: "selected" = "selected".asInstanceOf["selected"]
  }
  type ListItemClassKey = "root" | "container" | "focusVisible" | "default" | "dense" | "disabled" | "divider" | "gutters" | "button" | "secondaryAction" | "selected"
  
  type ListItemProps[D /* <: ElementType[Any] */, P] = OverrideProps[ListItemTypeMap[P, D], D]
  
  trait ListItemTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ListItemClassKey
    
    var defaultComponent: D
    
    var props: P & AlignItems
  }
  object ListItemTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ListItemClassKey, defaultComponent: D, props: P & AlignItems): ListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemTypeMap[P, D]]
    }
    
    extension [Self <: ListItemTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ListItemTypeMap[P, D])) {
      
      inline def setClassKey(value: ListItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AlignItems): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (OverridableComponent[ListItemTypeMap[Button, "li"]]) & (ExtendButtonBase[ListItemTypeMap[`4`, "div"]])
  
  /* This means you don't have to write `default`, but can instead just say `listItemListItemMod.foo` */
  override def _to: (OverridableComponent[ListItemTypeMap[Button, "li"]]) & (ExtendButtonBase[ListItemTypeMap[`4`, "div"]]) = default
}
