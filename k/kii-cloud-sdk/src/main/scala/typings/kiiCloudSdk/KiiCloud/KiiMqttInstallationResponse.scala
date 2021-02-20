package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KiiMqttInstallationResponse extends StObject {
  
  var installationID: String = js.native
  
  var installationRegistrationID: String = js.native
}
object KiiMqttInstallationResponse {
  
  @scala.inline
  def apply(installationID: String, installationRegistrationID: String): KiiMqttInstallationResponse = {
    val __obj = js.Dynamic.literal(installationID = installationID.asInstanceOf[js.Any], installationRegistrationID = installationRegistrationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiMqttInstallationResponse]
  }
  
  @scala.inline
  implicit class KiiMqttInstallationResponseMutableBuilder[Self <: KiiMqttInstallationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallationID(value: String): Self = StObject.set(x, "installationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationRegistrationID(value: String): Self = StObject.set(x, "installationRegistrationID", value.asInstanceOf[js.Any])
  }
}
