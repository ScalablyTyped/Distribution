package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceValueElement[T /* <: CellValue */] extends StObject {
  
  var id: T
  
  var name: CellValue
}
object SourceValueElement {
  
  inline def apply[T /* <: CellValue */](id: T, name: CellValue): SourceValueElement[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceValueElement[T]]
  }
  
  extension [Self <: SourceValueElement[?], T /* <: CellValue */](x: Self & SourceValueElement[T]) {
    
    inline def setId(value: T): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: CellValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
