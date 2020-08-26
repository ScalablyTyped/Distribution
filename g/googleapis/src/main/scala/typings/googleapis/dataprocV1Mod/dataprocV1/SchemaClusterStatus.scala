package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a cluster and its instances.
  */
@js.native
trait SchemaClusterStatus extends js.Object {
  /**
    * Output only. Optional details of cluster&#39;s state.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * Output only. The cluster&#39;s state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Time when this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.native
  /**
    * Output only. Additional state information that includes status reported
    * by the agent.
    */
  var substate: js.UndefOr[String] = js.native
}

object SchemaClusterStatus {
  @scala.inline
  def apply(): SchemaClusterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterStatus]
  }
  @scala.inline
  implicit class SchemaClusterStatusOps[Self <: SchemaClusterStatus] (val x: Self) extends AnyVal {
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateStartTime(value: String): Self = this.set("stateStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateStartTime: Self = this.set("stateStartTime", js.undefined)
    @scala.inline
    def setSubstate(value: String): Self = this.set("substate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstate: Self = this.set("substate", js.undefined)
  }
  
}

