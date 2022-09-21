package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshStatusDetails extends StObject {
  
  /**
    * A machine-readable code that further describes a broad status.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable explanation of code.
    */
  var details: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceMeshStatusDetails {
  
  inline def apply(): SchemaServiceMeshStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshStatusDetails]
  }
  
  extension [Self <: SchemaServiceMeshStatusDetails](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
