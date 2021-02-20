package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1ClientState extends StObject {
  
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
  implicit class GoogleAppsCloudidentityDevicesV1ClientStateMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1ClientState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetTags(value: js.Array[String]): Self = StObject.set(x, "assetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTagsUndefined: Self = StObject.set(x, "assetTags", js.undefined)
    
    @scala.inline
    def setAssetTagsVarargs(value: String*): Self = StObject.set(x, "assetTags", js.Array(value :_*))
    
    @scala.inline
    def setComplianceState(value: String): Self = StObject.set(x, "complianceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceStateUndefined: Self = StObject.set(x, "complianceState", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCustomId(value: String): Self = StObject.set(x, "customId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomIdUndefined: Self = StObject.set(x, "customId", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setHealthScore(value: String): Self = StObject.set(x, "healthScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthScoreUndefined: Self = StObject.set(x, "healthScore", js.undefined)
    
    @scala.inline
    def setKeyValuePairs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.cloudidentity.gapi.client.cloudidentity.GoogleAppsCloudidentityDevicesV1CustomAttributeValue}
      */ typings.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.GoogleAppsCloudidentityDevicesV1ClientState with TopLevel[js.Any]
    ): Self = StObject.set(x, "keyValuePairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValuePairsUndefined: Self = StObject.set(x, "keyValuePairs", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setManaged(value: String): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwnerType(value: String): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerTypeUndefined: Self = StObject.set(x, "ownerType", js.undefined)
    
    @scala.inline
    def setScoreReason(value: String): Self = StObject.set(x, "scoreReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreReasonUndefined: Self = StObject.set(x, "scoreReason", js.undefined)
  }
}
