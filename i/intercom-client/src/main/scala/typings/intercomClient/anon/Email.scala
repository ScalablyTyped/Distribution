package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var segment_id: js.UndefOr[String] = js.undefined
  
  var tag_id: js.UndefOr[String] = js.undefined
}
object Email {
  
  inline def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setSegment_id(value: String): Self = StObject.set(x, "segment_id", value.asInstanceOf[js.Any])
    
    inline def setSegment_idUndefined: Self = StObject.set(x, "segment_id", js.undefined)
    
    inline def setTag_id(value: String): Self = StObject.set(x, "tag_id", value.asInstanceOf[js.Any])
    
    inline def setTag_idUndefined: Self = StObject.set(x, "tag_id", js.undefined)
  }
}
