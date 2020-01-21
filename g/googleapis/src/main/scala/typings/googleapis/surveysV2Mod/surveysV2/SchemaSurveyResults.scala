package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to the current results for a given survey.
  */
@js.native
trait SchemaSurveyResults extends js.Object {
  /**
    * Human readable string describing the status of the request.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * External survey ID as viewable by survey owners in the editor view.
    */
  var surveyUrlId: js.UndefOr[String] = js.native
}

object SchemaSurveyResults {
  @scala.inline
  def apply(status: String = null, surveyUrlId: String = null): SchemaSurveyResults = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (surveyUrlId != null) __obj.updateDynamic("surveyUrlId")(surveyUrlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSurveyResults]
  }
}

