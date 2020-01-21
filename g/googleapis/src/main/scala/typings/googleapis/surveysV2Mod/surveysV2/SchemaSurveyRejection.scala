package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing why the survey was rejected from review, if it was.
  */
@js.native
trait SchemaSurveyRejection extends js.Object {
  /**
    * A human-readable explanation of what was wrong with the survey.
    */
  var explanation: js.UndefOr[String] = js.native
  /**
    * Which category of rejection this was. See the  Google Surveys Help Center
    * for additional details on each category.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaSurveyRejection {
  @scala.inline
  def apply(explanation: String = null, `type`: String = null): SchemaSurveyRejection = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSurveyRejection]
  }
}

