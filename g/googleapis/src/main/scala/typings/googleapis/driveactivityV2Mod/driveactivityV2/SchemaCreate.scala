package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object was created.
  */
trait SchemaCreate extends StObject {
  
  /**
    * If present, indicates the object was created by copying an existing Drive
    * object.
    */
  var copy: js.UndefOr[SchemaCopy] = js.undefined
  
  /**
    * If present, indicates the object was newly created (e.g. as a blank
    * document), not derived from a Drive object or external object.
    */
  var `new`: js.UndefOr[SchemaNew] = js.undefined
  
  /**
    * If present, indicates the object originated externally and was uploaded
    * to Drive.
    */
  var upload: js.UndefOr[SchemaUpload] = js.undefined
}
object SchemaCreate {
  
  inline def apply(): SchemaCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreate]
  }
  
  extension [Self <: SchemaCreate](x: Self) {
    
    inline def setCopy(value: SchemaCopy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setNew(value: SchemaNew): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    inline def setUpload(value: SchemaUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
