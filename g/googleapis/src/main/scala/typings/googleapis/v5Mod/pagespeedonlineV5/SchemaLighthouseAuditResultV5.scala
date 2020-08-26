package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLighthouseAuditResultV5 extends js.Object {
  /**
    * The description of the audit.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Freeform details section of the audit.
    */
  var details: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The value that should be displayed on the UI for this audit.
    */
  var displayValue: js.UndefOr[String] = js.native
  /**
    * An error message from a thrown error inside the audit.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * An explanation of the errors in the audit.
    */
  var explanation: js.UndefOr[String] = js.native
  /**
    * The audit&#39;s id.
    */
  var id: js.UndefOr[String] = js.native
  var score: js.UndefOr[js.Any] = js.native
  /**
    * The enumerated score display mode.
    */
  var scoreDisplayMode: js.UndefOr[String] = js.native
  /**
    * The human readable title.
    */
  var title: js.UndefOr[String] = js.native
  var warnings: js.UndefOr[js.Any] = js.native
}

object SchemaLighthouseAuditResultV5 {
  @scala.inline
  def apply(): SchemaLighthouseAuditResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLighthouseAuditResultV5]
  }
  @scala.inline
  implicit class SchemaLighthouseAuditResultV5Ops[Self <: SchemaLighthouseAuditResultV5] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDetails(value: StringDictionary[js.Any]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayValue: Self = this.set("displayValue", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplanation: Self = this.set("explanation", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setScore(value: js.Any): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    @scala.inline
    def setScoreDisplayMode(value: String): Self = this.set("scoreDisplayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreDisplayMode: Self = this.set("scoreDisplayMode", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWarnings(value: js.Any): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

