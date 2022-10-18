package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Authorization extends StObject {
    
    var Authorization: String
  }
  object Authorization {
    
    inline def apply(Authorization: String): Authorization = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorization]
    }
    
    extension [Self <: Authorization](x: Self) {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    }
  }
}
