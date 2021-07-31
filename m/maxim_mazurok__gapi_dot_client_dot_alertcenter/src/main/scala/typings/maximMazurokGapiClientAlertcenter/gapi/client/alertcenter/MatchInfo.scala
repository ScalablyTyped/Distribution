package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchInfo extends StObject {
  
  /** For matched detector predefined by Google. */
  var predefinedDetector: js.UndefOr[PredefinedDetectorInfo] = js.undefined
  
  /** For matched detector defined by administrators. */
  var userDefinedDetector: js.UndefOr[UserDefinedDetectorInfo] = js.undefined
}
object MatchInfo {
  
  @scala.inline
  def apply(): MatchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchInfo]
  }
  
  @scala.inline
  implicit class MatchInfoMutableBuilder[Self <: MatchInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredefinedDetector(value: PredefinedDetectorInfo): Self = StObject.set(x, "predefinedDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedDetectorUndefined: Self = StObject.set(x, "predefinedDetector", js.undefined)
    
    @scala.inline
    def setUserDefinedDetector(value: UserDefinedDetectorInfo): Self = StObject.set(x, "userDefinedDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedDetectorUndefined: Self = StObject.set(x, "userDefinedDetector", js.undefined)
  }
}
