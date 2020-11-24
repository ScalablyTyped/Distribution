package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
@js.native
trait SchemaVolumeMount extends js.Object {
  
  /**
    * Path within the container at which the volume should be mounted.  Must
    * not contain &#39;:&#39;.
    */
  var mountPath: js.UndefOr[String] = js.native
  
  /**
    * mountPropagation determines how mounts are propagated from the host to
    * container and the other way around. When not set,
    * MountPropagationHostToContainer is used. This field is beta in 1.10.
    * +optional
    */
  var mountPropagation: js.UndefOr[String] = js.native
  
  /**
    * This must match the Name of a Volume.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified).
    * Defaults to false. +optional
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Path within the volume from which the container&#39;s volume should be
    * mounted. Defaults to &quot;&quot; (volume&#39;s root). +optional
    */
  var subPath: js.UndefOr[String] = js.native
}
object SchemaVolumeMount {
  
  @scala.inline
  def apply(): SchemaVolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeMount]
  }
  
  @scala.inline
  implicit class SchemaVolumeMountOps[Self <: SchemaVolumeMount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMountPath(value: String): Self = this.set("mountPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPath: Self = this.set("mountPath", js.undefined)
    
    @scala.inline
    def setMountPropagation(value: String): Self = this.set("mountPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPropagation: Self = this.set("mountPropagation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSubPath(value: String): Self = this.set("subPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubPath: Self = this.set("subPath", js.undefined)
  }
}
