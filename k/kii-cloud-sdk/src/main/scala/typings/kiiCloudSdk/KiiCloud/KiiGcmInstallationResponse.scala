package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KiiGcmInstallationResponse extends StObject {
  
  var installationID: String
}
object KiiGcmInstallationResponse {
  
  @scala.inline
  def apply(installationID: String): KiiGcmInstallationResponse = {
    val __obj = js.Dynamic.literal(installationID = installationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiGcmInstallationResponse]
  }
  
  @scala.inline
  implicit class KiiGcmInstallationResponseMutableBuilder[Self <: KiiGcmInstallationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallationID(value: String): Self = StObject.set(x, "installationID", value.asInstanceOf[js.Any])
  }
}
