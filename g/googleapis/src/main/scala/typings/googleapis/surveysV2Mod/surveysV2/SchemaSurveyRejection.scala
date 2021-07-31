package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing why the survey was rejected from review, if it was.
  */
trait SchemaSurveyRejection extends StObject {
  
  /**
    * A human-readable explanation of what was wrong with the survey.
    */
  var explanation: js.UndefOr[String] = js.undefined
  
  /**
    * Which category of rejection this was. See the  Google Surveys Help Center
    * for additional details on each category.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaSurveyRejection {
  
  @scala.inline
  def apply(): SchemaSurveyRejection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyRejection]
  }
  
  @scala.inline
  implicit class SchemaSurveyRejectionMutableBuilder[Self <: SchemaSurveyRejection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
