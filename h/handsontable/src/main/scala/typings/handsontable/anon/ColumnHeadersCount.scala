package typings.handsontable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnHeadersCount extends StObject {
  
  var columnHeadersCount: Double
}
object ColumnHeadersCount {
  
  inline def apply(columnHeadersCount: Double): ColumnHeadersCount = {
    val __obj = js.Dynamic.literal(columnHeadersCount = columnHeadersCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnHeadersCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnHeadersCount] (val x: Self) extends AnyVal {
    
    inline def setColumnHeadersCount(value: Double): Self = StObject.set(x, "columnHeadersCount", value.asInstanceOf[js.Any])
  }
}
