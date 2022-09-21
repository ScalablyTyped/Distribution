package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1RedirectWritesStepDetails extends StObject {
  
  /**
    * Ths concurrency mode for this database.
    */
  var concurrencyMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1RedirectWritesStepDetails {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1RedirectWritesStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1RedirectWritesStepDetails]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1RedirectWritesStepDetails](x: Self) {
    
    inline def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModeNull: Self = StObject.set(x, "concurrencyMode", null)
    
    inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
  }
}
