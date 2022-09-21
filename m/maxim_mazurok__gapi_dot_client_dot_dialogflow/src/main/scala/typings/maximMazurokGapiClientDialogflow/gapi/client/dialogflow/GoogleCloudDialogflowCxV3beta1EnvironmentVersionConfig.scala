package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig extends StObject {
  
  /** Required. Format: projects//locations//agents//flows//versions/. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
