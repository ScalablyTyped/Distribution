package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
trait SchemaVolumeMount extends StObject {
  
  /**
    * Path within the container at which the volume should be mounted.  Must
    * not contain &#39;:&#39;.
    */
  var mountPath: js.UndefOr[String] = js.undefined
  
  /**
    * mountPropagation determines how mounts are propagated from the host to
    * container and the other way around. When not set,
    * MountPropagationHostToContainer is used. This field is beta in 1.10.
    * +optional
    */
  var mountPropagation: js.UndefOr[String] = js.undefined
  
  /**
    * This must match the Name of a Volume.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified).
    * Defaults to false. +optional
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path within the volume from which the container&#39;s volume should be
    * mounted. Defaults to &quot;&quot; (volume&#39;s root). +optional
    */
  var subPath: js.UndefOr[String] = js.undefined
}
object SchemaVolumeMount {
  
  inline def apply(): SchemaVolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeMount]
  }
  
  extension [Self <: SchemaVolumeMount](x: Self) {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    inline def setMountPropagation(value: String): Self = StObject.set(x, "mountPropagation", value.asInstanceOf[js.Any])
    
    inline def setMountPropagationUndefined: Self = StObject.set(x, "mountPropagation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSubPath(value: String): Self = StObject.set(x, "subPath", value.asInstanceOf[js.Any])
    
    inline def setSubPathUndefined: Self = StObject.set(x, "subPath", js.undefined)
  }
}
