package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredefinedDetectorInfo extends js.Object {
  
  /** Name that uniquely identifies the detector. */
  var detectorName: js.UndefOr[String] = js.native
}
object PredefinedDetectorInfo {
  
  @scala.inline
  def apply(): PredefinedDetectorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredefinedDetectorInfo]
  }
  
  @scala.inline
  implicit class PredefinedDetectorInfoOps[Self <: PredefinedDetectorInfo] (val x: Self) extends AnyVal {
    
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
    def setDetectorName(value: String): Self = this.set("detectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorName: Self = this.set("detectorName", js.undefined)
  }
}
