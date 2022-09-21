package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadata extends StObject {
  
  /**
    * Services that this ruleset has declarations for (e.g., "cloud.firestore"). There may be 0+ of these.
    */
  var services: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaMetadata {
  
  inline def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  extension [Self <: SchemaMetadata](x: Self) {
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
