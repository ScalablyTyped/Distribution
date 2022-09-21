package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagBody extends StObject {
  
  var name: String
  
  var status: StatusTag
}
object TagBody {
  
  inline def apply(name: String, status: StatusTag): TagBody = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagBody]
  }
  
  extension [Self <: TagBody](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StatusTag): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
