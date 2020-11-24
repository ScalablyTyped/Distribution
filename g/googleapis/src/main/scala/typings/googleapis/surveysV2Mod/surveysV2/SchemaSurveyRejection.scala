package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaSurveyRejection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyRejection]
  }
  
  @scala.inline
  implicit class SchemaSurveyRejectionOps[Self <: SchemaSurveyRejection] (val x: Self) extends AnyVal {
    
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
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanation: Self = this.set("explanation", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
