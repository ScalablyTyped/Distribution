package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  /** Output only. Timestamp when the Organization was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Timestamp when the Organization was requested for deletion. */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /** Immutable. The G Suite / Workspace customer id used in the Directory API. */
  var directoryCustomerId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A human-readable string that refers to the organization in the Google Cloud Console. This string is set by the server and cannot be changed. The string will be set to
    * the primary domain (for example, "google.com") of the Google Workspace customer that owns the organization.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A checksum computed by the server based on the current value of the Organization resource. This may be sent on update and delete requests to ensure the client has an
    * up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name of the organization. This is the organization's relative path in the API. Its format is "organizations/[organization_id]". For example,
    * "organizations/1234".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The organization's current lifecycle state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Timestamp when the Organization was last modified. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDirectoryCustomerId(value: String): Self = StObject.set(x, "directoryCustomerId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryCustomerIdUndefined: Self = StObject.set(x, "directoryCustomerId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
