package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.root
import typings.materialUiCore.materialUiCoreStrings.tfoot
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverridableTypeMap
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterTableFooterMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableFooter API](https://mui.com/api/table-footer/)
    */
  @JSImport("@material-ui/core/TableFooter/TableFooter", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableFooterTypeMap[js.Object, tfoot]] = js.native
  
  type TableFooterClassKey = root
  
  type TableFooterProps[D /* <: ElementType[Any] */, P /* <: js.Object */] = OverrideProps[TableFooterTypeMap[P, D], D]
  
  trait TableFooterTypeMap[P /* <: js.Object */, D /* <: ElementType[Any] */]
    extends StObject
       with OverridableTypeMap {
    
    @JSName("classKey")
    var classKey_TableFooterTypeMap: TableFooterClassKey
    
    @JSName("defaultComponent")
    var defaultComponent_TableFooterTypeMap: D
    
    var props: P
  }
  object TableFooterTypeMap {
    
    inline def apply[P /* <: js.Object */, D /* <: ElementType[Any] */](classKey: TableFooterClassKey, defaultComponent: D, props: P): TableFooterTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableFooterTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableFooterTypeMap[?, ?], P /* <: js.Object */, D /* <: ElementType[Any] */] (val x: Self & (TableFooterTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: TableFooterClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableFooterTypeMap[js.Object, tfoot]]
  
  /* This means you don't have to write `default`, but can instead just say `tableFooterTableFooterMod.foo` */
  override def _to: OverridableComponent[TableFooterTypeMap[js.Object, tfoot]] = default
}
