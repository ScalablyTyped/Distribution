package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the Finding and its StateChange.
  */
@js.native
trait SchemaListFindingsResult extends js.Object {
  /**
    * Finding matching the search request.
    */
  var finding: js.UndefOr[SchemaFinding] = js.native
  /**
    * State change of the finding between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.native
}

object SchemaListFindingsResult {
  @scala.inline
  def apply(): SchemaListFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResult]
  }
  @scala.inline
  implicit class SchemaListFindingsResultOps[Self <: SchemaListFindingsResult] (val x: Self) extends AnyVal {
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
    def setFinding(value: SchemaFinding): Self = this.set("finding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinding: Self = this.set("finding", js.undefined)
    @scala.inline
    def setStateChange(value: String): Self = this.set("stateChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateChange: Self = this.set("stateChange", js.undefined)
  }
  
}

