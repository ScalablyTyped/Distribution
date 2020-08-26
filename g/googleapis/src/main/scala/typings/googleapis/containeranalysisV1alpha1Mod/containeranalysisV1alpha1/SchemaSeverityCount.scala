package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of occurrences created for a specific severity.
  */
@js.native
trait SchemaSeverityCount extends js.Object {
  /**
    * The number of occurrences with the severity.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The severity of the occurrences.
    */
  var severity: js.UndefOr[String] = js.native
}

object SchemaSeverityCount {
  @scala.inline
  def apply(): SchemaSeverityCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeverityCount]
  }
  @scala.inline
  implicit class SchemaSeverityCountOps[Self <: SchemaSeverityCount] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
  }
  
}

