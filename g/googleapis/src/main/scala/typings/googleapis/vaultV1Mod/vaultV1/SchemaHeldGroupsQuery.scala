package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query options for group holds.
  */
@js.native
trait SchemaHeldGroupsQuery extends js.Object {
  /**
    * The end time range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The start time range for the search query. These timestamps are in GMT
    * and rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The search terms for the hold.
    */
  var terms: js.UndefOr[String] = js.native
}

object SchemaHeldGroupsQuery {
  @scala.inline
  def apply(): SchemaHeldGroupsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldGroupsQuery]
  }
  @scala.inline
  implicit class SchemaHeldGroupsQueryOps[Self <: SchemaHeldGroupsQuery] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTerms(value: String): Self = this.set("terms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
  }
  
}

