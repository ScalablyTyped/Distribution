package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3CreateVersionOperationMetadata extends StObject {
  
  /**
    * Name of the created version. Format: `projects//locations//agents//flows//versions/`.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3CreateVersionOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3CreateVersionOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3CreateVersionOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3CreateVersionOperationMetadata](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
