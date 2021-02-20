package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object was created.
  */
@js.native
trait SchemaCreate extends StObject {
  
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
  implicit class SchemaCreateMutableBuilder[Self <: SchemaCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: SchemaCopy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setNew(value: SchemaNew): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    @scala.inline
    def setUpload(value: SchemaUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
