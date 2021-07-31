package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of an individual survey object.
  */
trait SchemaSurvey extends StObject {
  
  /**
    * Targeting-criteria message containing demographic information
    */
  var audience: js.UndefOr[SchemaSurveyAudience] = js.undefined
  
  /**
    * Cost to run the survey and collect the necessary number of responses.
    */
  var cost: js.UndefOr[SchemaSurveyCost] = js.undefined
  
  /**
    * Additional information to store on behalf of the API consumer and
    * associate with this question. This binary blob is treated as opaque. This
    * field is limited to 64K bytes.
    */
  var customerData: js.UndefOr[String] = js.undefined
  
  /**
    * Text description of the survey.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * List of email addresses for survey owners. Must contain at least the
    * address of the user making the API call.
    */
  var owners: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of questions defining the survey.
    */
  var questions: js.UndefOr[js.Array[SchemaSurveyQuestion]] = js.undefined
  
  /**
    * Reason for the survey being rejected. Only present if the survey state is
    * rejected.
    */
  var rejectionReason: js.UndefOr[SchemaSurveyRejection] = js.undefined
  
  /**
    * State that the survey is in.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Unique survey ID, that is viewable in the URL of the Survey Creator UI
    */
  var surveyUrlId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional name that will be given to the survey.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Number of responses desired for the survey.
    */
  var wantedResponseCount: js.UndefOr[Double] = js.undefined
}
object SchemaSurvey {
  
  @scala.inline
  def apply(): SchemaSurvey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurvey]
  }
  
  @scala.inline
  implicit class SchemaSurveyMutableBuilder[Self <: SchemaSurvey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: SchemaSurveyAudience): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setCost(value: SchemaSurveyCost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    @scala.inline
    def setCustomerData(value: String): Self = StObject.set(x, "customerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerDataUndefined: Self = StObject.set(x, "customerData", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    @scala.inline
    def setQuestions(value: js.Array[SchemaSurveyQuestion]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionsUndefined: Self = StObject.set(x, "questions", js.undefined)
    
    @scala.inline
    def setQuestionsVarargs(value: SchemaSurveyQuestion*): Self = StObject.set(x, "questions", js.Array(value :_*))
    
    @scala.inline
    def setRejectionReason(value: SchemaSurveyRejection): Self = StObject.set(x, "rejectionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionReasonUndefined: Self = StObject.set(x, "rejectionReason", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSurveyUrlId(value: String): Self = StObject.set(x, "surveyUrlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyUrlIdUndefined: Self = StObject.set(x, "surveyUrlId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWantedResponseCount(value: Double): Self = StObject.set(x, "wantedResponseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantedResponseCountUndefined: Self = StObject.set(x, "wantedResponseCount", js.undefined)
  }
}
