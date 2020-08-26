package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePoolsResize extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The desired number of replicas to resize to. If this number is larger
    * than the existing number of replicas, new replicas will be added. If the
    * number is smaller, then existing replicas will be deleted.
    */
  var numReplicas: js.UndefOr[Double] = js.native
  /**
    * The name of the replica pool for this request.
    */
  var poolName: js.UndefOr[String] = js.native
  /**
    * The project ID for this replica pool.
    */
  var projectName: js.UndefOr[String] = js.native
  /**
    * The zone for this replica pool.
    */
  var zone: js.UndefOr[String] = js.native
}

object ParamsResourcePoolsResize {
  @scala.inline
  def apply(): ParamsResourcePoolsResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoolsResize]
  }
  @scala.inline
  implicit class ParamsResourcePoolsResizeOps[Self <: ParamsResourcePoolsResize] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setNumReplicas(value: Double): Self = this.set("numReplicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumReplicas: Self = this.set("numReplicas", js.undefined)
    @scala.inline
    def setPoolName(value: String): Self = this.set("poolName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolName: Self = this.set("poolName", js.undefined)
    @scala.inline
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectName: Self = this.set("projectName", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

