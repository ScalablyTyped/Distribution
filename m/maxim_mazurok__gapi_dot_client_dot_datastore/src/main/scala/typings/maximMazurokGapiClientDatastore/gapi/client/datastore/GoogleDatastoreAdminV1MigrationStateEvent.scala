package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1MigrationStateEvent extends StObject {
  
  /** The new state of the migration. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1MigrationStateEvent {
  
  inline def apply(): GoogleDatastoreAdminV1MigrationStateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1MigrationStateEvent]
  }
  
  extension [Self <: GoogleDatastoreAdminV1MigrationStateEvent](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
