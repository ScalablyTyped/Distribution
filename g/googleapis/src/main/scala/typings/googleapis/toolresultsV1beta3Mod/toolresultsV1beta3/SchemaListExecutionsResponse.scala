package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListExecutionsResponse extends js.Object {
  /**
    * Executions.  Always set.
    */
  var executions: js.UndefOr[js.Array[SchemaExecution]] = js.native
  /**
    * A continuation token to resume the query at the next item.  Will only be
    * set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListExecutionsResponse {
  @scala.inline
  def apply(): SchemaListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExecutionsResponse]
  }
  @scala.inline
  implicit class SchemaListExecutionsResponseOps[Self <: SchemaListExecutionsResponse] (val x: Self) extends AnyVal {
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
    def setExecutionsVarargs(value: SchemaExecution*): Self = this.set("executions", js.Array(value :_*))
    @scala.inline
    def setExecutions(value: js.Array[SchemaExecution]): Self = this.set("executions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutions: Self = this.set("executions", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

