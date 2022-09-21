package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2InputConfig extends StObject {
  
  /**
    * The Cloud Storage URI has the form gs:////agent*.json. Wildcards are allowed and will be expanded into all matched JSON files, which will be read as one conversation per file.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudDialogflowV2GcsSources] = js.undefined
}
object SchemaGoogleCloudDialogflowV2InputConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2InputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2InputConfig](x: Self) {
    
    inline def setGcsSource(value: SchemaGoogleCloudDialogflowV2GcsSources): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
