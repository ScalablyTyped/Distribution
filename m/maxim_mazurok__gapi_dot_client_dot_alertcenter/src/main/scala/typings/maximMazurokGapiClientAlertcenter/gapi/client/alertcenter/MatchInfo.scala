package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchInfo extends js.Object {
  
  /** For matched detector predefined by Google. */
  var predefinedDetector: js.UndefOr[PredefinedDetectorInfo] = js.native
  
  /** For matched detector defined by administrators. */
  var userDefinedDetector: js.UndefOr[UserDefinedDetectorInfo] = js.native
}
object MatchInfo {
  
  @scala.inline
  def apply(): MatchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchInfo]
  }
  
  @scala.inline
  implicit class MatchInfoOps[Self <: MatchInfo] (val x: Self) extends AnyVal {
    
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
    def setPredefinedDetector(value: PredefinedDetectorInfo): Self = this.set("predefinedDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedDetector: Self = this.set("predefinedDetector", js.undefined)
    
    @scala.inline
    def setUserDefinedDetector(value: UserDefinedDetectorInfo): Self = this.set("userDefinedDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedDetector: Self = this.set("userDefinedDetector", js.undefined)
  }
}
