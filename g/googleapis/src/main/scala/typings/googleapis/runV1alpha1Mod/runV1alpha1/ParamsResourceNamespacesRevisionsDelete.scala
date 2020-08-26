package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceNamespacesRevisionsDelete extends StandardParameters {
  /**
    * Cloud Run currently ignores this parameter.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Cloud Run currently ignores this parameter.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the revision being deleted. If needed, replace {namespace_id}
    * with the project ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. Specifies the cascade behavior on delete. Cloud Run only
    * supports cascading behavior, so this must be false. This attribute is
    * deprecated, and is now replaced with PropagationPolicy See
    * https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    */
  var orphanDependents: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the propagation policy of delete. Cloud Run currently ignores
    * this setting, and deletes in the background. Please see
    * kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for
    * more information.
    */
  var propagationPolicy: js.UndefOr[String] = js.native
}

object ParamsResourceNamespacesRevisionsDelete {
  @scala.inline
  def apply(): ParamsResourceNamespacesRevisionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesRevisionsDelete]
  }
  @scala.inline
  implicit class ParamsResourceNamespacesRevisionsDeleteOps[Self <: ParamsResourceNamespacesRevisionsDelete] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrphanDependents(value: Boolean): Self = this.set("orphanDependents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrphanDependents: Self = this.set("orphanDependents", js.undefined)
    @scala.inline
    def setPropagationPolicy(value: String): Self = this.set("propagationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagationPolicy: Self = this.set("propagationPolicy", js.undefined)
  }
  
}

