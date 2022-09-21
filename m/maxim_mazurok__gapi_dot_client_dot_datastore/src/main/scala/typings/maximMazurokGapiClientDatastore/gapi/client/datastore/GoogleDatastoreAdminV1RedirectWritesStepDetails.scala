package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1RedirectWritesStepDetails extends StObject {
  
  /** Ths concurrency mode for this database. */
  var concurrencyMode: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1RedirectWritesStepDetails {
  
  inline def apply(): GoogleDatastoreAdminV1RedirectWritesStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1RedirectWritesStepDetails]
  }
  
  extension [Self <: GoogleDatastoreAdminV1RedirectWritesStepDetails](x: Self) {
    
    inline def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
  }
}
