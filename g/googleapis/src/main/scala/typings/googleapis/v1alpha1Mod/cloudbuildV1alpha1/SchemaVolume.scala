package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Volume describes a Docker container volume which is mounted into build
  * steps in order to persist files across build step execution.
  */
@js.native
trait SchemaVolume extends js.Object {
  
  /**
    * Name of the volume to mount.  Volume names must be unique per build step
    * and must be valid names for Docker volumes. Each named volume must be
    * used by at least two build steps.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Path at which to mount the volume.  Paths must be absolute and cannot
    * conflict with other volume paths on the same build step or with certain
    * reserved volume paths.
    */
  var path: js.UndefOr[String] = js.native
}
object SchemaVolume {
  
  @scala.inline
  def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  
  @scala.inline
  implicit class SchemaVolumeOps[Self <: SchemaVolume] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
