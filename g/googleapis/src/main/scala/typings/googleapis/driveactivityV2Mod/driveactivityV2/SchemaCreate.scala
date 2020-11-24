package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object was created.
  */
@js.native
trait SchemaCreate extends js.Object {
  
  /**
    * If present, indicates the object was created by copying an existing Drive
    * object.
    */
  var copy: js.UndefOr[SchemaCopy] = js.native
  
  /**
    * If present, indicates the object was newly created (e.g. as a blank
    * document), not derived from a Drive object or external object.
    */
  var `new`: js.UndefOr[SchemaNew] = js.native
  
  /**
    * If present, indicates the object originated externally and was uploaded
    * to Drive.
    */
  var upload: js.UndefOr[SchemaUpload] = js.native
}
object SchemaCreate {
  
  @scala.inline
  def apply(): SchemaCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreate]
  }
  
  @scala.inline
  implicit class SchemaCreateOps[Self <: SchemaCreate] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: SchemaCopy): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setNew(value: SchemaNew): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
    
    @scala.inline
    def setUpload(value: SchemaUpload): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
}
