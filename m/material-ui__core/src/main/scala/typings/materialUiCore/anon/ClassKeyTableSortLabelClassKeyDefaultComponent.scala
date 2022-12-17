package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.span
import typings.materialUiCore.tableSortLabelTableSortLabelMod.TableSortLabelClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyTableSortLabelClassKeyDefaultComponent extends StObject {
  
  var classKey: TableSortLabelClassKey
  
  var defaultComponent: span
  
  var props: Direction
}
object ClassKeyTableSortLabelClassKeyDefaultComponent {
  
  inline def apply(classKey: TableSortLabelClassKey, props: Direction): ClassKeyTableSortLabelClassKeyDefaultComponent = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "span", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyTableSortLabelClassKeyDefaultComponent]
  }
  
  extension [Self <: ClassKeyTableSortLabelClassKeyDefaultComponent](x: Self) {
    
    inline def setClassKey(value: TableSortLabelClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: span): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Direction): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
