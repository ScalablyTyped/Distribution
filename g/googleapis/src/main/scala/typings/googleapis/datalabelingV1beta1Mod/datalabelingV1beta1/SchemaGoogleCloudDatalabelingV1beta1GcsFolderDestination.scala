package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1GcsFolderDestination extends StObject {
  
  /**
    * Required. Cloud Storage directory to export data to.
    */
  var outputFolderUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1GcsFolderDestination {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1GcsFolderDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1GcsFolderDestination]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1GcsFolderDestination](x: Self) {
    
    inline def setOutputFolderUri(value: String): Self = StObject.set(x, "outputFolderUri", value.asInstanceOf[js.Any])
    
    inline def setOutputFolderUriNull: Self = StObject.set(x, "outputFolderUri", null)
    
    inline def setOutputFolderUriUndefined: Self = StObject.set(x, "outputFolderUri", js.undefined)
  }
}
