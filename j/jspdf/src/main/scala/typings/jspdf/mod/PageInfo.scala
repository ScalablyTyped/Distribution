package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInfo extends StObject {
  
  var objId: Double
  
  var pageContext: Any
  
  var pageNumber: Double
}
object PageInfo {
  
  inline def apply(objId: Double, pageContext: Any, pageNumber: Double): PageInfo = {
    val __obj = js.Dynamic.literal(objId = objId.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
    
    inline def setObjId(value: Double): Self = StObject.set(x, "objId", value.asInstanceOf[js.Any])
    
    inline def setPageContext(value: Any): Self = StObject.set(x, "pageContext", value.asInstanceOf[js.Any])
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
  }
}
