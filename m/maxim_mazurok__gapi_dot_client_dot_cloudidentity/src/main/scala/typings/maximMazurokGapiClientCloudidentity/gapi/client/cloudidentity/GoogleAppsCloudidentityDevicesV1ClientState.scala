package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1ClientState extends js.Object {
  
  /** The caller can specify asset tags for this resource */
  var assetTags: js.UndefOr[js.Array[String]] = js.native
  
  /** The compliance state of the resource as specified by the API client. */
  var complianceState: js.UndefOr[String] = js.native
  
  /** Output only. The time the client state data was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** This field may be used to store a unique identifier for the API resource within which these CustomAttributes are a field. */
  var customId: js.UndefOr[String] = js.native
  
  /** The token that needs to be passed back for concurrency control in updates. Token needs to be passed back in UpdateRequest */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The Health score of the resource. The Health score is the callers specification of the condition of the device from a usability point of view. For example, a third-party device
    * management provider may specify a health score based on its compliance with organizational policies.
    */
  var healthScore: js.UndefOr[String] = js.native
  
  /**
    * The map of key-value attributes stored by callers specific to a device. The total serialized length of this map may not exceed 10KB. No limit is placed on the number of attributes
    * in a map.
    */
  var keyValuePairs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.cloudidentity.gapi.client.cloudidentity.GoogleAppsCloudidentityDevicesV1CustomAttributeValue}
    */ typings.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.GoogleAppsCloudidentityDevicesV1ClientState with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The time the client state data was last updated. */
  var lastUpdateTime: js.UndefOr[String] = js.native
  
  /** The management state of the resource as specified by the API client. */
  var managed: js.UndefOr[String] = js.native
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the ClientState in format:
    * `devices/{device_id}/deviceUsers/{device_user_id}/clientState/{partner_id}`, where partner_id corresponds to the partner storing the data. For partners belonging to the "BeyondCorp
    * Alliance", this is the partner ID specified to you by Google. For all other callers, this is a string of the form: `{customer_id}-suffix`, where `customer_id` is your customer ID.
    * The *suffix* is any string the caller specifies. This string will be displayed verbatim in the administration console. This suffix is used in setting up Custom Access Levels in
    * Context-Aware Access. Your organization's customer ID can be obtained from the URL: `GET https://www.googleapis.com/admin/directory/v1/customers/my_customer` The `id` field in the
    * response contains the customer ID starting with the letter 'C'. The customer ID to be used in this API is the string after the letter 'C' (not including 'C')
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The owner of the ClientState */
  var ownerType: js.UndefOr[String] = js.native
  
  /** A descriptive cause of the health score. */
  var scoreReason: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1ClientState {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1ClientState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ClientState]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1ClientStateOps[Self <: GoogleAppsCloudidentityDevicesV1ClientState] (val x: Self) extends AnyVal {
    
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
    def setAssetTagsVarargs(value: String*): Self = this.set("assetTags", js.Array(value :_*))
    
    @scala.inline
    def setAssetTags(value: js.Array[String]): Self = this.set("assetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetTags: Self = this.set("assetTags", js.undefined)
    
    @scala.inline
    def setComplianceState(value: String): Self = this.set("complianceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceState: Self = this.set("complianceState", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCustomId(value: String): Self = this.set("customId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomId: Self = this.set("customId", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setHealthScore(value: String): Self = this.set("healthScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthScore: Self = this.set("healthScore", js.undefined)
    
    @scala.inline
    def setKeyValuePairs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.cloudidentity.gapi.client.cloudidentity.GoogleAppsCloudidentityDevicesV1CustomAttributeValue}
      */ typings.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.GoogleAppsCloudidentityDevicesV1ClientState with TopLevel[js.Any]
    ): Self = this.set("keyValuePairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValuePairs: Self = this.set("keyValuePairs", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setManaged(value: String): Self = this.set("managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManaged: Self = this.set("managed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerType(value: String): Self = this.set("ownerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerType: Self = this.set("ownerType", js.undefined)
    
    @scala.inline
    def setScoreReason(value: String): Self = this.set("scoreReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreReason: Self = this.set("scoreReason", js.undefined)
  }
}
