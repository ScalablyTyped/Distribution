package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIResponsePageTokenMeta
  extends StObject
     with APIResponseMeta {
  
  var next_page_token: js.UndefOr[String] = js.undefined
  
  var prev_page_token: js.UndefOr[String] = js.undefined
}
object APIResponsePageTokenMeta {
  
  inline def apply(request_id: String, status: Double, version: String): APIResponsePageTokenMeta = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponsePageTokenMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIResponsePageTokenMeta] (val x: Self) extends AnyVal {
    
    inline def setNext_page_token(value: String): Self = StObject.set(x, "next_page_token", value.asInstanceOf[js.Any])
    
    inline def setNext_page_tokenUndefined: Self = StObject.set(x, "next_page_token", js.undefined)
    
    inline def setPrev_page_token(value: String): Self = StObject.set(x, "prev_page_token", value.asInstanceOf[js.Any])
    
    inline def setPrev_page_tokenUndefined: Self = StObject.set(x, "prev_page_token", js.undefined)
  }
}
