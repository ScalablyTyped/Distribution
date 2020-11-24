package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAssetsRequest extends js.Object {
  
  /**
    * A list of asset types to take a snapshot for. For example: "compute.googleapis.com/Disk". Regular expressions are also supported. For example: * "compute.googleapis.com.*" snapshots
    * resources whose asset type starts with "compute.googleapis.com". * ".*Instance" snapshots resources whose asset type ends with "Instance". * ".*Instance.*" snapshots resources whose
    * asset type contains "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported regular expression syntax. If the regular expression does not match any
    * supported asset type, an INVALID_ARGUMENT error will be returned. If specified, only matching assets will be returned, otherwise, it will snapshot all asset types. See [Introduction
    * to Cloud Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types.
    */
  var assetTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Asset content type. If not specified, no content but the asset name will be returned. */
  var contentType: js.UndefOr[String] = js.native
  
  /** Required. Output configuration indicating where the results will be output to. */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
  
  /**
    * Timestamp to take an asset snapshot. This can only be set to a timestamp between the current time and the current time minus 35 days (inclusive). If not specified, the current time
    * will be used. Due to delays in resource data collection and indexing, there is a volatile window during which running the same query may get different results.
    */
  var readTime: js.UndefOr[String] = js.native
}
object ExportAssetsRequest {
  
  @scala.inline
  def apply(): ExportAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportAssetsRequest]
  }
  
  @scala.inline
  implicit class ExportAssetsRequestOps[Self <: ExportAssetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetTypesVarargs(value: String*): Self = this.set("assetTypes", js.Array(value :_*))
    
    @scala.inline
    def setAssetTypes(value: js.Array[String]): Self = this.set("assetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetTypes: Self = this.set("assetTypes", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
  }
}
