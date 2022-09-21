package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1PrepareStepDetails extends StObject {
  
  /**
    * The concurrency mode this database will use when it reaches the `REDIRECT_WRITES` step.
    */
  var concurrencyMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1PrepareStepDetails {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1PrepareStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1PrepareStepDetails]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1PrepareStepDetails](x: Self) {
    
    inline def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModeNull: Self = StObject.set(x, "concurrencyMode", null)
    
    inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
  }
}
