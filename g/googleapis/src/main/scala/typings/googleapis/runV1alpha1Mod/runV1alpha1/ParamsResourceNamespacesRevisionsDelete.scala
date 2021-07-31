package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNamespacesRevisionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Cloud Run currently ignores this parameter.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Cloud Run currently ignores this parameter.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the revision being deleted. If needed, replace {namespace_id}
    * with the project ID.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Specifies the cascade behavior on delete. Cloud Run only
    * supports cascading behavior, so this must be false. This attribute is
    * deprecated, and is now replaced with PropagationPolicy See
    * https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    */
  var orphanDependents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the propagation policy of delete. Cloud Run currently ignores
    * this setting, and deletes in the background. Please see
    * kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for
    * more information.
    */
  var propagationPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceNamespacesRevisionsDelete {
  
  @scala.inline
  def apply(): ParamsResourceNamespacesRevisionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesRevisionsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceNamespacesRevisionsDeleteMutableBuilder[Self <: ParamsResourceNamespacesRevisionsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrphanDependents(value: Boolean): Self = StObject.set(x, "orphanDependents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrphanDependentsUndefined: Self = StObject.set(x, "orphanDependents", js.undefined)
    
    @scala.inline
    def setPropagationPolicy(value: String): Self = StObject.set(x, "propagationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagationPolicyUndefined: Self = StObject.set(x, "propagationPolicy", js.undefined)
  }
}
