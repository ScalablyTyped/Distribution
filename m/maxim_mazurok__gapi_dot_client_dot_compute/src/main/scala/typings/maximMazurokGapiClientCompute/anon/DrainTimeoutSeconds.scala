package typings.maximMazurokGapiClientCompute.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrainTimeoutSeconds extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * The drain timeout specifies the upper bound in seconds on the amount of time allowed to drain connections from the current ACTIVE subnetwork to the current BACKUP subnetwork.
    * The drain timeout is only applicable when the following conditions are true: - the subnetwork being patched has purpose = INTERNAL_HTTPS_LOAD_BALANCER - the subnetwork being
    * patched has role = BACKUP - the patch request is setting the role to ACTIVE. Note that after this patch operation the roles of the ACTIVE and BACKUP subnetworks will be swapped.
    */
  var drainTimeoutSeconds: js.UndefOr[Double] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Project ID for this request. */
  var project: String
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Name of the region scoping this request. */
  var region: String
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already
    * been completed.
    *
    * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if
    * original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
    *
    * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /** Request body */
  var resource: typings.maximMazurokGapiClientCompute.gapi.client.compute.Subnetwork
  
  /** Name of the Subnetwork resource to patch. */
  var subnetwork: String
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}
object DrainTimeoutSeconds {
  
  inline def apply(
    project: String,
    region: String,
    resource: typings.maximMazurokGapiClientCompute.gapi.client.compute.Subnetwork,
    subnetwork: String
  ): DrainTimeoutSeconds = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], subnetwork = subnetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrainTimeoutSeconds]
  }
  
  extension [Self <: DrainTimeoutSeconds](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setDrainTimeoutSeconds(value: Double): Self = StObject.set(x, "drainTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setDrainTimeoutSecondsUndefined: Self = StObject.set(x, "drainTimeoutSeconds", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setResource(value: typings.maximMazurokGapiClientCompute.gapi.client.compute.Subnetwork): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
