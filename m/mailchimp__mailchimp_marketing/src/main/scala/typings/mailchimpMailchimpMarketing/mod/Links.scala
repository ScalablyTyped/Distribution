package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  var href: String
  
  var method: HttpMethod
  
  var rel: String
  
  var schema: String
  
  var targetSchema: String
}
object Links {
  
  inline def apply(href: String, method: HttpMethod, rel: String, schema: String, targetSchema: String): Links = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], targetSchema = targetSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTargetSchema(value: String): Self = StObject.set(x, "targetSchema", value.asInstanceOf[js.Any])
  }
}
