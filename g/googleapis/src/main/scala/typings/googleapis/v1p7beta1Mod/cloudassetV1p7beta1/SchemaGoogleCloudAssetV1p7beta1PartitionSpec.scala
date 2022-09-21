package typings.googleapis.v1p7beta1Mod.cloudassetV1p7beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1p7beta1PartitionSpec extends StObject {
  
  /**
    * The partition key for BigQuery partitioned table.
    */
  var partitionKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1p7beta1PartitionSpec {
  
  inline def apply(): SchemaGoogleCloudAssetV1p7beta1PartitionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1p7beta1PartitionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1p7beta1PartitionSpec](x: Self) {
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyNull: Self = StObject.set(x, "partitionKey", null)
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
  }
}
