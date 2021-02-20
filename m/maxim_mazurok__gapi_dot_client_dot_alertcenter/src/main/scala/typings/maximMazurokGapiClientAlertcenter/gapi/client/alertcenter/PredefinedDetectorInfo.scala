package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredefinedDetectorInfo extends StObject {
  
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
  implicit class PredefinedDetectorInfoMutableBuilder[Self <: PredefinedDetectorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorName(value: String): Self = StObject.set(x, "detectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorNameUndefined: Self = StObject.set(x, "detectorName", js.undefined)
  }
}
