package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Hover
import typings.materialUiCore.materialUiCoreStrings.tr
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowTableRowMod extends Shortcut {
  
  /**
    * Will automatically set dynamic row height
    * based on the material table element parent (head, body, etc).
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableRow API](https://mui.com/api/table-row/)
    */
  @JSImport("@material-ui/core/TableRow/TableRow", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableRowTypeMap[js.Object, tr]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.selected
    - typings.materialUiCore.materialUiCoreStrings.hover
    - typings.materialUiCore.materialUiCoreStrings.head
    - typings.materialUiCore.materialUiCoreStrings.footer
  */
  trait TableRowClassKey extends StObject
  object TableRowClassKey {
    
    inline def footer: typings.materialUiCore.materialUiCoreStrings.footer = "footer".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.footer]
    
    inline def head: typings.materialUiCore.materialUiCoreStrings.head = "head".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.head]
    
    inline def hover: typings.materialUiCore.materialUiCoreStrings.hover = "hover".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.hover]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def selected: typings.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.selected]
  }
  
  type TableRowProps[D /* <: ElementType[Any] */, P] = OverrideProps[TableRowTypeMap[P, D], D]
  
  trait TableRowTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: TableRowClassKey
    
    var defaultComponent: D
    
    var props: P & Hover
  }
  object TableRowTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: TableRowClassKey, defaultComponent: D, props: P & Hover): TableRowTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (TableRowTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: TableRowClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Hover): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableRowTypeMap[js.Object, tr]]
  
  /* This means you don't have to write `default`, but can instead just say `tableRowTableRowMod.foo` */
  override def _to: OverridableComponent[TableRowTypeMap[js.Object, tr]] = default
}
