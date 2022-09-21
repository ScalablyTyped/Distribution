package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3CreateVersionOperationMetadata extends StObject {
  
  /** Name of the created version. Format: `projects//locations//agents//flows//versions/`. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3CreateVersionOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3CreateVersionOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3CreateVersionOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3CreateVersionOperationMetadata](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
