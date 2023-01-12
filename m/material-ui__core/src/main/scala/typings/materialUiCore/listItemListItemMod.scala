package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.AlignItems
import typings.materialUiCore.anon.Button
import typings.materialUiCore.anon.`4`
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.materialUiCoreStrings.li
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
  val default: (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]]) = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.container
    - typings.materialUiCore.materialUiCoreStrings.focusVisible
    - typings.materialUiCore.materialUiCoreStrings.default
    - typings.materialUiCore.materialUiCoreStrings.dense
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.divider
    - typings.materialUiCore.materialUiCoreStrings.gutters
    - typings.materialUiCore.materialUiCoreStrings.button
    - typings.materialUiCore.materialUiCoreStrings.secondaryAction
    - typings.materialUiCore.materialUiCoreStrings.selected
  */
  trait ListItemClassKey extends StObject
  object ListItemClassKey {
    
    inline def default: typings.materialUiCore.materialUiCoreStrings.default = "default".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.default]
    
    inline def button: typings.materialUiCore.materialUiCoreStrings.button = "button".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.button]
    
    inline def container: typings.materialUiCore.materialUiCoreStrings.container = "container".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.container]
    
    inline def dense: typings.materialUiCore.materialUiCoreStrings.dense = "dense".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.dense]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def divider: typings.materialUiCore.materialUiCoreStrings.divider = "divider".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.divider]
    
    inline def focusVisible: typings.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def gutters: typings.materialUiCore.materialUiCoreStrings.gutters = "gutters".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.gutters]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def secondaryAction: typings.materialUiCore.materialUiCoreStrings.secondaryAction = "secondaryAction".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.secondaryAction]
    
    inline def selected: typings.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.selected]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (ListItemTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: ListItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AlignItems): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]])
  
  /* This means you don't have to write `default`, but can instead just say `listItemListItemMod.foo` */
  override def _to: (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]]) = default
}
