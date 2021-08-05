package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAssetsRequest extends StObject {
  
  /**
    * A list of asset types to take a snapshot for. For example: "compute.googleapis.com/Disk". Regular expressions are also supported. For example: * "compute.googleapis.com.*" snapshots
    * resources whose asset type starts with "compute.googleapis.com". * ".*Instance" snapshots resources whose asset type ends with "Instance". * ".*Instance.*" snapshots resources whose
    * asset type contains "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported regular expression syntax. If the regular expression does not match any
    * supported asset type, an INVALID_ARGUMENT error will be returned. If specified, only matching assets will be returned, otherwise, it will snapshot all asset types. See [Introduction
    * to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types.
    */
  var assetTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Asset content type. If not specified, no content but the asset name will be returned. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Required. Output configuration indicating where the results will be output to. */
  var outputConfig: js.UndefOr[OutputConfig] = js.undefined
  
  /**
    * Timestamp to take an asset snapshot. This can only be set to a timestamp between the current time and the current time minus 35 days (inclusive). If not specified, the current time
    * will be used. Due to delays in resource data collection and indexing, there is a volatile window during which running the same query may get different results.
    */
  var readTime: js.UndefOr[String] = js.undefined
}
object ExportAssetsRequest {
  
  inline def apply(): ExportAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportAssetsRequest]
  }
  
  extension [Self <: ExportAssetsRequest](x: Self) {
    
    inline def setAssetTypes(value: js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    inline def setAssetTypesUndefined: Self = StObject.set(x, "assetTypes", js.undefined)
    
    inline def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value :_*))
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
