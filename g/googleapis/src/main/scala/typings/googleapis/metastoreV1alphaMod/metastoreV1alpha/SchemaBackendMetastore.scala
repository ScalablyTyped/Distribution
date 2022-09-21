package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendMetastore extends StObject {
  
  /**
    * The type of the backend metastore.
    */
  var metastoreType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relative resource name of the metastore that is being federated. The formats of the relative resource names for the currently supported metastores are listed below: Dataplex: projects/{project_id\}/locations/{location\}/lakes/{lake_id\} BigQuery: projects/{project_id\} Dataproc Metastore: projects/{project_id\}/locations/{location\}/services/{service_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendMetastore {
  
  inline def apply(): SchemaBackendMetastore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendMetastore]
  }
  
  extension [Self <: SchemaBackendMetastore](x: Self) {
    
    inline def setMetastoreType(value: String): Self = StObject.set(x, "metastoreType", value.asInstanceOf[js.Any])
    
    inline def setMetastoreTypeNull: Self = StObject.set(x, "metastoreType", null)
    
    inline def setMetastoreTypeUndefined: Self = StObject.set(x, "metastoreType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
