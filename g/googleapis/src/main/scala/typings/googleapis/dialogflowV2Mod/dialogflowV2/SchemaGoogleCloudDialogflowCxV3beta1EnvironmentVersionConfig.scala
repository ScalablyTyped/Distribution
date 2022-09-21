package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig extends StObject {
  
  /**
    * Required. Format: projects//locations//agents//flows//versions/.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1EnvironmentVersionConfig](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
