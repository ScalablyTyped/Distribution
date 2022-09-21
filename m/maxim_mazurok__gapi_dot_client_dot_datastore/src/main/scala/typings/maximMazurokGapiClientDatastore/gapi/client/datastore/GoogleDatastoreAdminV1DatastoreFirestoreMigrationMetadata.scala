package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata extends StObject {
  
  /** The current state of migration from Cloud Datastore to Cloud Firestore in Datastore mode. */
  var migrationState: js.UndefOr[String] = js.undefined
  
  /** The current step of migration from Cloud Datastore to Cloud Firestore in Datastore mode. */
  var migrationStep: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata {
  
  inline def apply(): GoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata]
  }
  
  extension [Self <: GoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata](x: Self) {
    
    inline def setMigrationState(value: String): Self = StObject.set(x, "migrationState", value.asInstanceOf[js.Any])
    
    inline def setMigrationStateUndefined: Self = StObject.set(x, "migrationState", js.undefined)
    
    inline def setMigrationStep(value: String): Self = StObject.set(x, "migrationStep", value.asInstanceOf[js.Any])
    
    inline def setMigrationStepUndefined: Self = StObject.set(x, "migrationStep", js.undefined)
  }
}
