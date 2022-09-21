package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2VolumeMount extends StObject {
  
  /**
    * Required. Path within the container at which the volume should be mounted. Must not contain ':'. For Cloud SQL volumes, it can be left empty, or must otherwise be `/cloudsql`. All instances defined in the Volume will be available as `/cloudsql/[instance]`. For more information on Cloud SQL volumes, visit https://cloud.google.com/sql/docs/mysql/connect-run
    */
  var mountPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. This must match the Name of a Volume.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2VolumeMount {
  
  inline def apply(): SchemaGoogleCloudRunV2VolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2VolumeMount]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2VolumeMount](x: Self) {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathNull: Self = StObject.set(x, "mountPath", null)
    
    inline def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
