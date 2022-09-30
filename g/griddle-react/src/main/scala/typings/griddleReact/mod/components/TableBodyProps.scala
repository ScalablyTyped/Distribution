package typings.griddleReact.mod.components

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBodyProps extends StObject {
  
  var Row: js.UndefOr[Any] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var rowIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object TableBodyProps {
  
  inline def apply(): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBodyProps]
  }
  
  extension [Self <: TableBodyProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRow(value: Any): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    inline def setRowIds(value: js.Array[Double]): Self = StObject.set(x, "rowIds", value.asInstanceOf[js.Any])
    
    inline def setRowIdsUndefined: Self = StObject.set(x, "rowIds", js.undefined)
    
    inline def setRowIdsVarargs(value: Double*): Self = StObject.set(x, "rowIds", js.Array(value*))
    
    inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
