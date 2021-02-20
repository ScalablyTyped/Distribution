package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to the current results for a given survey.
  */
@js.native
trait SchemaSurveyResults extends StObject {
  
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
  def apply(): SchemaSurveyResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyResults]
  }
  
  @scala.inline
  implicit class SchemaSurveyResultsMutableBuilder[Self <: SchemaSurveyResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSurveyUrlId(value: String): Self = StObject.set(x, "surveyUrlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyUrlIdUndefined: Self = StObject.set(x, "surveyUrlId", js.undefined)
  }
}
