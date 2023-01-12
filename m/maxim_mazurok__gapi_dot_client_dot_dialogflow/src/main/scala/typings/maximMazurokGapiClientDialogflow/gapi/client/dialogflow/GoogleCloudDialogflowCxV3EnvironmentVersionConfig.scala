package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3EnvironmentVersionConfig extends StObject {
  
  /** Required. Format: projects//locations//agents//flows//versions/. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3EnvironmentVersionConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3EnvironmentVersionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3EnvironmentVersionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3EnvironmentVersionConfig] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
