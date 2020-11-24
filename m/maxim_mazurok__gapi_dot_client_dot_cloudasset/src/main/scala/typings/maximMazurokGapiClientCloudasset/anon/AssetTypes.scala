package typings.maximMazurokGapiClientCloudasset.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetTypes extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * Optional. A list of asset types that this request searches for. If empty, it will search all the [searchable asset
    * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
    */
  var assetTypes: js.UndefOr[String | js.Array[String]] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * Optional. A comma separated list of fields specifying the sorting order of the results. The default order is ascending. Add " DESC" after the field name to indicate descending
    * order. Redundant space characters are ignored. Example: "location DESC, name". Only string fields in the response are sortable, including `name`, `displayName`, `description`,
    * `location`. All the other fields such as repeated fields (e.g., `networkTags`), map fields (e.g., `labels`) and struct fields (e.g., `additionalAttributes`) are not supported.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Optional. The page size for search result pagination. Page size is capped at 500 even if a larger value is given. If set to zero, server will pick an appropriate default.
    * Returned results may be fewer than requested. When this happens, there could be more results as long as `next_page_token` is returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. If present, then retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous
    * response. The values of all other method parameters, must be identical to those in the previous call.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The query statement. See [how to construct a query](http://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query) for more information. If
    * not specified or empty, it will search all the resources within the specified `scope`. Note that the query string is compared against each Cloud IAM policy binding, including
    * its members, roles, and Cloud IAM conditions. The returned Cloud IAM policies will only contain the bindings that match your query. To learn more about the IAM policy structure,
    * see [IAM policy doc](https://cloud.google.com/iam/docs/policies#structure). Examples: * `name:Important` to find Cloud resources whose name contains "Important" as a word. *
    * `displayName:Impor*` to find Cloud resources whose display name contains "Impor" as a prefix. * `description:*por*` to find Cloud resources whose description contains "por" as a
    * substring. * `location:us-west*` to find Cloud resources whose location is prefixed with "us-west". * `labels:prod` to find Cloud resources whose labels contain "prod" as a key
    * or value. * `labels.env:prod` to find Cloud resources that have a label "env" and its value is "prod". * `labels.env:*` to find Cloud resources that have a label "env". *
    * `Important` to find Cloud resources that contain "Important" as a word in any of the searchable fields. * `Impor*` to find Cloud resources that contain "Impor" as a prefix in
    * any of the searchable fields. * `*por*` to find Cloud resources that contain "por" as a substring in any of the searchable fields. * `Important location:(us-west1 OR global)` to
    * find Cloud resources that contain "Important" as a word in any of the searchable fields and are also located in the "us-west1" region or the "global" location.
    */
  var query: js.UndefOr[String] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Required. A scope can be a project, a folder, or an organization. The search is limited to the resources within the `scope`. The caller must be granted the
    * [`cloudasset.assets.searchAllResources`](http://cloud.google.com/asset-inventory/docs/access-control#required_permissions) permission on the desired scope. The allowed values
    * are: * projects/{PROJECT_ID} (e.g., "projects/foo-bar") * projects/{PROJECT_NUMBER} (e.g., "projects/12345678") * folders/{FOLDER_NUMBER} (e.g., "folders/1234567") *
    * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
    */
  var scope: String = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object AssetTypes {
  
  @scala.inline
  def apply(scope: String): AssetTypes = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetTypes]
  }
  
  @scala.inline
  implicit class AssetTypesOps[Self <: AssetTypes] (val x: Self) extends AnyVal {
    
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
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setAssetTypesVarargs(value: String*): Self = this.set("assetTypes", js.Array(value :_*))
    
    @scala.inline
    def setAssetTypes(value: String | js.Array[String]): Self = this.set("assetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetTypes: Self = this.set("assetTypes", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
