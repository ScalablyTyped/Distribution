package typings.googleapis.v1p7beta1Mod.cloudassetV1p7beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1p7beta1ExportAssetsRequest extends StObject {
  
  /**
    * A list of asset types to take a snapshot for. For example: "compute.googleapis.com/Disk". Regular expressions are also supported. For example: * "compute.googleapis.com.*" snapshots resources whose asset type starts with "compute.googleapis.com". * ".*Instance" snapshots resources whose asset type ends with "Instance". * ".*Instance.*" snapshots resources whose asset type contains "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported regular expression syntax. If the regular expression does not match any supported asset type, an INVALID_ARGUMENT error will be returned. If specified, only matching assets will be returned, otherwise, it will snapshot all asset types. See [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types.
    */
  var assetTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Asset content type. If not specified, no content but the asset name will be returned.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Output configuration indicating where the results will be output to.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudAssetV1p7beta1OutputConfig] = js.undefined
  
  /**
    * Timestamp to take an asset snapshot. This can only be set to a timestamp between the current time and the current time minus 35 days (inclusive). If not specified, the current time will be used. Due to delays in resource data collection and indexing, there is a volatile window during which running the same query may get different results.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of relationship types to export, for example: `INSTANCE_TO_INSTANCEGROUP`. This field should only be specified if content_type=RELATIONSHIP. If specified, it will snapshot [asset_types]' specified relationships, or give errors if any relationship_types' supported types are not in [asset_types]. If not specified, it will snapshot all [asset_types]' supported relationships. An unspecified [asset_types] field means all supported asset_types. See [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types and relationship types.
    */
  var relationshipTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1p7beta1ExportAssetsRequest {
  
  inline def apply(): SchemaGoogleCloudAssetV1p7beta1ExportAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1p7beta1ExportAssetsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1p7beta1ExportAssetsRequest](x: Self) {
    
    inline def setAssetTypes(value: js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    inline def setAssetTypesNull: Self = StObject.set(x, "assetTypes", null)
    
    inline def setAssetTypesUndefined: Self = StObject.set(x, "assetTypes", js.undefined)
    
    inline def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value*))
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setOutputConfig(value: SchemaGoogleCloudAssetV1p7beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setRelationshipTypes(value: js.Array[String]): Self = StObject.set(x, "relationshipTypes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypesNull: Self = StObject.set(x, "relationshipTypes", null)
    
    inline def setRelationshipTypesUndefined: Self = StObject.set(x, "relationshipTypes", js.undefined)
    
    inline def setRelationshipTypesVarargs(value: String*): Self = StObject.set(x, "relationshipTypes", js.Array(value*))
  }
}
