package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedDetectorInfo extends StObject {
  
  /** Display name of the detector. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Resource name that uniquely identifies the detector. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object UserDefinedDetectorInfo {
  
  @scala.inline
  def apply(): UserDefinedDetectorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedDetectorInfo]
  }
  
  @scala.inline
  implicit class UserDefinedDetectorInfoMutableBuilder[Self <: UserDefinedDetectorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
