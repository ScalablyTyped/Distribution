package typings.imapflow.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResponse extends StObject {
  
  var delimiter: String
  
  var flags: Set[String]
  
  var listed: Boolean
  
  var name: String
  
  var path: String
  
  var specialUse: String
  
  var subscribed: Boolean
}
object ListResponse {
  
  inline def apply(
    delimiter: String,
    flags: Set[String],
    listed: Boolean,
    name: String,
    path: String,
    specialUse: String,
    subscribed: Boolean
  ): ListResponse = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], listed = listed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], specialUse = specialUse.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
  
  extension [Self <: ListResponse](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Set[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setListed(value: Boolean): Self = StObject.set(x, "listed", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSpecialUse(value: String): Self = StObject.set(x, "specialUse", value.asInstanceOf[js.Any])
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
  }
}
