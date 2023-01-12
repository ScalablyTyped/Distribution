package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.table
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [Table API](https://mui.com/api/table/)
    */
  @JSImport("@material-ui/core/Table/Table", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableTypeMap[js.Object, table]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.normal
    - typings.materialUiCore.materialUiCoreStrings.checkbox
    - typings.materialUiCore.materialUiCoreStrings.none
    - typings.materialUiCore.materialUiCoreStrings.default
  */
  trait Padding extends StObject
  object Padding {
    
    inline def default: typings.materialUiCore.materialUiCoreStrings.default = "default".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.default]
    
    inline def checkbox: typings.materialUiCore.materialUiCoreStrings.checkbox = "checkbox".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.checkbox]
    
    inline def none: typings.materialUiCore.materialUiCoreStrings.none = "none".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.none]
    
    inline def normal: typings.materialUiCore.materialUiCoreStrings.normal = "normal".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.small
    - typings.materialUiCore.materialUiCoreStrings.medium
  */
  trait Size extends StObject
  object Size {
    
    inline def medium: typings.materialUiCore.materialUiCoreStrings.medium = "medium".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.medium]
    
    inline def small: typings.materialUiCore.materialUiCoreStrings.small = "small".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.stickyHeader
  */
  trait TableClassKey extends StObject
  object TableClassKey {
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def stickyHeader: typings.materialUiCore.materialUiCoreStrings.stickyHeader = "stickyHeader".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.stickyHeader]
  }
  
  type TableProps[D /* <: ElementType[Any] */, P] = OverrideProps[TableTypeMap[P, D], D]
  
  trait TableTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: TableClassKey
    
    var defaultComponent: D
    
    var props: P & typings.materialUiCore.anon.Padding
  }
  object TableTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: TableClassKey, defaultComponent: D, props: P & typings.materialUiCore.anon.Padding): TableTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (TableTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: TableClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & typings.materialUiCore.anon.Padding): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableTypeMap[js.Object, table]]
  
  /* This means you don't have to write `default`, but can instead just say `tableTableMod.foo` */
  override def _to: OverridableComponent[TableTypeMap[js.Object, table]] = default
}
