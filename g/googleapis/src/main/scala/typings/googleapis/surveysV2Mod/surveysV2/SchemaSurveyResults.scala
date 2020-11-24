package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaSurveyResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyResults]
  }
  
  @scala.inline
  implicit class SchemaSurveyResultsOps[Self <: SchemaSurveyResults] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSurveyUrlId(value: String): Self = this.set("surveyUrlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurveyUrlId: Self = this.set("surveyUrlId", js.undefined)
  }
}
