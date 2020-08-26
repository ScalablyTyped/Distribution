package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile-friendly test response, including mobile-friendly issues and
  * resource issues.
  */
@js.native
trait SchemaRunMobileFriendlyTestResponse extends js.Object {
  /**
    * Test verdict, whether the page is mobile friendly or not.
    */
  var mobileFriendliness: js.UndefOr[String] = js.native
  /**
    * List of mobile-usability issues.
    */
  var mobileFriendlyIssues: js.UndefOr[js.Array[SchemaMobileFriendlyIssue]] = js.native
  /**
    * Information about embedded resources issues.
    */
  var resourceIssues: js.UndefOr[js.Array[SchemaResourceIssue]] = js.native
  /**
    * Screenshot of the requested URL.
    */
  var screenshot: js.UndefOr[SchemaImage] = js.native
  /**
    * Final state of the test, can be either complete or an error.
    */
  var testStatus: js.UndefOr[SchemaTestStatus] = js.native
}

object SchemaRunMobileFriendlyTestResponse {
  @scala.inline
  def apply(): SchemaRunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunMobileFriendlyTestResponse]
  }
  @scala.inline
  implicit class SchemaRunMobileFriendlyTestResponseOps[Self <: SchemaRunMobileFriendlyTestResponse] (val x: Self) extends AnyVal {
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
    def setMobileFriendliness(value: String): Self = this.set("mobileFriendliness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileFriendliness: Self = this.set("mobileFriendliness", js.undefined)
    @scala.inline
    def setMobileFriendlyIssuesVarargs(value: SchemaMobileFriendlyIssue*): Self = this.set("mobileFriendlyIssues", js.Array(value :_*))
    @scala.inline
    def setMobileFriendlyIssues(value: js.Array[SchemaMobileFriendlyIssue]): Self = this.set("mobileFriendlyIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileFriendlyIssues: Self = this.set("mobileFriendlyIssues", js.undefined)
    @scala.inline
    def setResourceIssuesVarargs(value: SchemaResourceIssue*): Self = this.set("resourceIssues", js.Array(value :_*))
    @scala.inline
    def setResourceIssues(value: js.Array[SchemaResourceIssue]): Self = this.set("resourceIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIssues: Self = this.set("resourceIssues", js.undefined)
    @scala.inline
    def setScreenshot(value: SchemaImage): Self = this.set("screenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshot: Self = this.set("screenshot", js.undefined)
    @scala.inline
    def setTestStatus(value: SchemaTestStatus): Self = this.set("testStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestStatus: Self = this.set("testStatus", js.undefined)
  }
  
}

