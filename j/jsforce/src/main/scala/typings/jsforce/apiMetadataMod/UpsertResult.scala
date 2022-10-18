package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertResult extends StObject {
  
  var created: Boolean
  
  var fullName: String
  
  var success: Boolean
}
object UpsertResult {
  
  inline def apply(created: Boolean, fullName: String, success: Boolean): UpsertResult = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertResult]
  }
  
  extension [Self <: UpsertResult](x: Self) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
