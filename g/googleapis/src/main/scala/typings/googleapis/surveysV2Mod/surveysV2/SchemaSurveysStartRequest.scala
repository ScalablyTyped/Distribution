package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSurveysStartRequest extends js.Object {
  
  /**
    * *Deprecated* Threshold to start a survey automatically if the quoted
    * prices is less than or equal to this value. See Survey.Cost for more
    * details. This will no longer be available after June 2018.
    */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
}
object SchemaSurveysStartRequest {
  
  @scala.inline
  def apply(): SchemaSurveysStartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveysStartRequest]
  }
  
  @scala.inline
  implicit class SchemaSurveysStartRequestOps[Self <: SchemaSurveysStartRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxCostPerResponseNanos(value: String): Self = this.set("maxCostPerResponseNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCostPerResponseNanos: Self = this.set("maxCostPerResponseNanos", js.undefined)
  }
}
