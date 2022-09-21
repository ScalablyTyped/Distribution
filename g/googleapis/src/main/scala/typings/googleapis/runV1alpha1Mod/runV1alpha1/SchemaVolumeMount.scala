package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolumeMount extends StObject {
  
  /**
    * Path within the container at which the volume should be mounted. Must not contain ':'.
    */
  var mountPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the volume. There must be a corresponding Volume with the same name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Only true is accepted. Defaults to true.
    */
  var readOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * (Optional) Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
    */
  var subPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaVolumeMount {
  
  inline def apply(): SchemaVolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeMount]
  }
  
  extension [Self <: SchemaVolumeMount](x: Self) {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathNull: Self = StObject.set(x, "mountPath", null)
    
    inline def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSubPath(value: String): Self = StObject.set(x, "subPath", value.asInstanceOf[js.Any])
    
    inline def setSubPathNull: Self = StObject.set(x, "subPath", null)
    
    inline def setSubPathUndefined: Self = StObject.set(x, "subPath", js.undefined)
  }
}
