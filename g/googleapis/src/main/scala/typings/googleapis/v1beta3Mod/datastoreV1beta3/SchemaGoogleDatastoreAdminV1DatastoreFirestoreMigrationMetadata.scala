package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata extends StObject {
  
  /**
    * The current state of migration from Cloud Datastore to Cloud Firestore in Datastore mode.
    */
  var migrationState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current step of migration from Cloud Datastore to Cloud Firestore in Datastore mode.
    */
  var migrationStep: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1DatastoreFirestoreMigrationMetadata](x: Self) {
    
    inline def setMigrationState(value: String): Self = StObject.set(x, "migrationState", value.asInstanceOf[js.Any])
    
    inline def setMigrationStateNull: Self = StObject.set(x, "migrationState", null)
    
    inline def setMigrationStateUndefined: Self = StObject.set(x, "migrationState", js.undefined)
    
    inline def setMigrationStep(value: String): Self = StObject.set(x, "migrationStep", value.asInstanceOf[js.Any])
    
    inline def setMigrationStepNull: Self = StObject.set(x, "migrationStep", null)
    
    inline def setMigrationStepUndefined: Self = StObject.set(x, "migrationStep", js.undefined)
  }
}
