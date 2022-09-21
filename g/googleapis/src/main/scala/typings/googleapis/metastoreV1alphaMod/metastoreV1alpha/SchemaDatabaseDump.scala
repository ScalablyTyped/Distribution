package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatabaseDump extends StObject {
  
  /**
    * The type of the database.
    */
  var databaseType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Cloud Storage object or folder URI that specifies the source from which to import metadata. It must begin with gs://.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the source database.
    */
  var sourceDatabase: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The type of the database dump. If unspecified, defaults to MYSQL.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatabaseDump {
  
  inline def apply(): SchemaDatabaseDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseDump]
  }
  
  extension [Self <: SchemaDatabaseDump](x: Self) {
    
    inline def setDatabaseType(value: String): Self = StObject.set(x, "databaseType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTypeNull: Self = StObject.set(x, "databaseType", null)
    
    inline def setDatabaseTypeUndefined: Self = StObject.set(x, "databaseType", js.undefined)
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
    
    inline def setSourceDatabase(value: String): Self = StObject.set(x, "sourceDatabase", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseNull: Self = StObject.set(x, "sourceDatabase", null)
    
    inline def setSourceDatabaseUndefined: Self = StObject.set(x, "sourceDatabase", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
