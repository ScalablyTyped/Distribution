package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1AssetResourceSpec extends StObject {
  
  /**
    * Immutable. Relative name of the cloud resource that contains the data that is being managed within a lake. For example: projects/{project_number\}/buckets/{bucket_id\} projects/{project_number\}/datasets/{dataset_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. Type of resource.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1AssetResourceSpec {
  
  inline def apply(): SchemaGoogleCloudDataplexV1AssetResourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1AssetResourceSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1AssetResourceSpec](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
