package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudOrgpolicyV1Policy extends StObject {
  
  /** For boolean `Constraints`, whether to enforce the `Constraint` or not. */
  var booleanPolicy: js.UndefOr[GoogleCloudOrgpolicyV1BooleanPolicy] = js.undefined
  
  /**
    * The name of the `Constraint` the `Policy` is configuring, for example, `constraints/serviceuser.services`. A [list of available
    * constraints](/resource-manager/docs/organization-policy/org-policy-constraints) is available. Immutable after creation.
    */
  var constraint: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque tag indicating the current version of the `Policy`, used for concurrency control. When the `Policy` is returned from either a `GetPolicy` or a `ListOrgPolicy` request,
    * this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the
    * `etag` will be unset. When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value that was returned from a `GetOrgPolicy` request as part of a read-modify-write loop
    * for concurrency control. Not setting the `etag`in a `SetOrgPolicy` request will result in an unconditional write of the `Policy`.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** List of values either allowed or disallowed. */
  var listPolicy: js.UndefOr[GoogleCloudOrgpolicyV1ListPolicy] = js.undefined
  
  /** Restores the default behavior of the constraint; independent of `Constraint` type. */
  var restoreDefault: js.UndefOr[Any] = js.undefined
  
  /**
    * The time stamp the `Policy` was previously updated. This is set by the server, not specified by the caller, and represents the last time a call to `SetOrgPolicy` was made for that
    * `Policy`. Any value set by the client will be ignored.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Version of the `Policy`. Default version is 0; */
  var version: js.UndefOr[Double] = js.undefined
}
object GoogleCloudOrgpolicyV1Policy {
  
  inline def apply(): GoogleCloudOrgpolicyV1Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudOrgpolicyV1Policy]
  }
  
  extension [Self <: GoogleCloudOrgpolicyV1Policy](x: Self) {
    
    inline def setBooleanPolicy(value: GoogleCloudOrgpolicyV1BooleanPolicy): Self = StObject.set(x, "booleanPolicy", value.asInstanceOf[js.Any])
    
    inline def setBooleanPolicyUndefined: Self = StObject.set(x, "booleanPolicy", js.undefined)
    
    inline def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setListPolicy(value: GoogleCloudOrgpolicyV1ListPolicy): Self = StObject.set(x, "listPolicy", value.asInstanceOf[js.Any])
    
    inline def setListPolicyUndefined: Self = StObject.set(x, "listPolicy", js.undefined)
    
    inline def setRestoreDefault(value: Any): Self = StObject.set(x, "restoreDefault", value.asInstanceOf[js.Any])
    
    inline def setRestoreDefaultUndefined: Self = StObject.set(x, "restoreDefault", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
