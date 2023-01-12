package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineOptions extends StObject {
  
  var pageNumber: Double
}
object OutlineOptions {
  
  inline def apply(pageNumber: Double): OutlineOptions = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlineOptions] (val x: Self) extends AnyVal {
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
  }
}
