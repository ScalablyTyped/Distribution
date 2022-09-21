package typings.materialUiCore.anon

import typings.materialUiCore.tableSortLabelTableSortLabelMod.TableSortLabelClassKey
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKeyTableSortLabelClassKey[P, D /* <: ElementType[Any] */] extends StObject {
  
  var classKey: TableSortLabelClassKey
  
  var defaultComponent: D
  
  var props: P & Direction
}
object ClassKeyTableSortLabelClassKey {
  
  inline def apply[P, D /* <: ElementType[Any] */](classKey: TableSortLabelClassKey, defaultComponent: D, props: P & Direction): ClassKeyTableSortLabelClassKey[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassKeyTableSortLabelClassKey[P, D]]
  }
  
  extension [Self <: ClassKeyTableSortLabelClassKey[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ClassKeyTableSortLabelClassKey[P, D])) {
    
    inline def setClassKey(value: TableSortLabelClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & Direction): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
