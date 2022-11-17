package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
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
  val default: OverridableComponent[TableTypeMap[js.Object, "table"]] = js.native
  
  object Padding {
    
    inline def default: "default" = "default".asInstanceOf["default"]
    
    inline def checkbox: "checkbox" = "checkbox".asInstanceOf["checkbox"]
    
    inline def none: "none" = "none".asInstanceOf["none"]
    
    inline def normal: "normal" = "normal".asInstanceOf["normal"]
  }
  type Padding = "normal" | "checkbox" | "none" | "default"
  
  object Size {
    
    inline def medium: "medium" = "medium".asInstanceOf["medium"]
    
    inline def small: "small" = "small".asInstanceOf["small"]
  }
  type Size = "small" | "medium"
  
  object TableClassKey {
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def stickyHeader: "stickyHeader" = "stickyHeader".asInstanceOf["stickyHeader"]
  }
  type TableClassKey = "root" | "stickyHeader"
  
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
    
    extension [Self <: TableTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (TableTypeMap[P, D])) {
      
      inline def setClassKey(value: TableClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & typings.materialUiCore.anon.Padding): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableTypeMap[js.Object, "table"]]
  
  /* This means you don't have to write `default`, but can instead just say `tableTableMod.foo` */
  override def _to: OverridableComponent[TableTypeMap[js.Object, "table"]] = default
}
