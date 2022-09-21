package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1PrepareStepDetails extends StObject {
  
  /** The concurrency mode this database will use when it reaches the `REDIRECT_WRITES` step. */
  var concurrencyMode: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1PrepareStepDetails {
  
  inline def apply(): GoogleDatastoreAdminV1PrepareStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1PrepareStepDetails]
  }
  
  extension [Self <: GoogleDatastoreAdminV1PrepareStepDetails](x: Self) {
    
    inline def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
  }
}
