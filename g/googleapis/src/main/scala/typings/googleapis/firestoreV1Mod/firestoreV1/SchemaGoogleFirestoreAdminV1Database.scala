package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1Database extends StObject {
  
  /**
    * The App Engine integration mode to use for this database.
    */
  var appEngineIntegrationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The concurrency control mode to use for this database.
    */
  var concurrencyMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The key_prefix for this database. This key_prefix is used, in combination with the project id ("~") to construct the application id that is returned from the Cloud Datastore APIs in Google App Engine first generation runtimes. This value may be empty in which case the appid to use for URL-encoded keys is the project_id (eg: foo instead of v~foo).
    */
  var keyPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location of the database. Available databases are listed at https://cloud.google.com/firestore/docs/locations.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the Database. Format: `projects/{project\}/databases/{database\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the database. See https://cloud.google.com/datastore/docs/firestore-or-datastore for information about how to choose.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1Database {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1Database]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1Database](x: Self) {
    
    inline def setAppEngineIntegrationMode(value: String): Self = StObject.set(x, "appEngineIntegrationMode", value.asInstanceOf[js.Any])
    
    inline def setAppEngineIntegrationModeNull: Self = StObject.set(x, "appEngineIntegrationMode", null)
    
    inline def setAppEngineIntegrationModeUndefined: Self = StObject.set(x, "appEngineIntegrationMode", js.undefined)
    
    inline def setConcurrencyMode(value: String): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModeNull: Self = StObject.set(x, "concurrencyMode", null)
    
    inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixNull: Self = StObject.set(x, "keyPrefix", null)
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
