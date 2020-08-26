package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of an individual survey object.
  */
@js.native
trait SchemaSurvey extends js.Object {
  /**
    * Targeting-criteria message containing demographic information
    */
  var audience: js.UndefOr[SchemaSurveyAudience] = js.native
  /**
    * Cost to run the survey and collect the necessary number of responses.
    */
  var cost: js.UndefOr[SchemaSurveyCost] = js.native
  /**
    * Additional information to store on behalf of the API consumer and
    * associate with this question. This binary blob is treated as opaque. This
    * field is limited to 64K bytes.
    */
  var customerData: js.UndefOr[String] = js.native
  /**
    * Text description of the survey.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * List of email addresses for survey owners. Must contain at least the
    * address of the user making the API call.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of questions defining the survey.
    */
  var questions: js.UndefOr[js.Array[SchemaSurveyQuestion]] = js.native
  /**
    * Reason for the survey being rejected. Only present if the survey state is
    * rejected.
    */
  var rejectionReason: js.UndefOr[SchemaSurveyRejection] = js.native
  /**
    * State that the survey is in.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Unique survey ID, that is viewable in the URL of the Survey Creator UI
    */
  var surveyUrlId: js.UndefOr[String] = js.native
  /**
    * Optional name that will be given to the survey.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Number of responses desired for the survey.
    */
  var wantedResponseCount: js.UndefOr[Double] = js.native
}

object SchemaSurvey {
  @scala.inline
  def apply(): SchemaSurvey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurvey]
  }
  @scala.inline
  implicit class SchemaSurveyOps[Self <: SchemaSurvey] (val x: Self) extends AnyVal {
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
    def setAudience(value: SchemaSurveyAudience): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setCost(value: SchemaSurveyCost): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    @scala.inline
    def setCustomerData(value: String): Self = this.set("customerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerData: Self = this.set("customerData", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    @scala.inline
    def setQuestionsVarargs(value: SchemaSurveyQuestion*): Self = this.set("questions", js.Array(value :_*))
    @scala.inline
    def setQuestions(value: js.Array[SchemaSurveyQuestion]): Self = this.set("questions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuestions: Self = this.set("questions", js.undefined)
    @scala.inline
    def setRejectionReason(value: SchemaSurveyRejection): Self = this.set("rejectionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectionReason: Self = this.set("rejectionReason", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSurveyUrlId(value: String): Self = this.set("surveyUrlId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurveyUrlId: Self = this.set("surveyUrlId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWantedResponseCount(value: Double): Self = this.set("wantedResponseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWantedResponseCount: Self = this.set("wantedResponseCount", js.undefined)
  }
  
}

