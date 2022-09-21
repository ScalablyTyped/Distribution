package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.root
import typings.materialUiCore.materialUiCoreStrings.thead
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverridableTypeMap
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadTableHeadMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableHead API](https://mui.com/api/table-head/)
    */
  @JSImport("@material-ui/core/TableHead/TableHead", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableHeadTypeMap[js.Object, thead]] = js.native
  
  type TableHeadClassKey = root
  
  type TableHeadProps[D /* <: ElementType[Any] */, P /* <: js.Object */] = OverrideProps[TableHeadTypeMap[P, D], D]
  
  trait TableHeadTypeMap[P /* <: js.Object */, D /* <: ElementType[Any] */]
    extends StObject
       with OverridableTypeMap {
    
    @JSName("classKey")
    var classKey_TableHeadTypeMap: TableHeadClassKey
    
    @JSName("defaultComponent")
    var defaultComponent_TableHeadTypeMap: D
    
    var props: P
  }
  object TableHeadTypeMap {
    
    inline def apply[P /* <: js.Object */, D /* <: ElementType[Any] */](classKey: TableHeadClassKey, defaultComponent: D, props: P): TableHeadTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableHeadTypeMap[P, D]]
    }
    
    extension [Self <: TableHeadTypeMap[?, ?], P /* <: js.Object */, D /* <: ElementType[Any] */](x: Self & (TableHeadTypeMap[P, D])) {
      
      inline def setClassKey(value: TableHeadClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableHeadTypeMap[js.Object, thead]]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeadTableHeadMod.foo` */
  override def _to: OverridableComponent[TableHeadTypeMap[js.Object, thead]] = default
}
