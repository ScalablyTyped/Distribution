package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileNote extends StObject {
  
  /**
    * Provide a unique identifier to match analysis information on each specific file in a package
    */
  var checksum: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This field provides information about the type of file identified
    */
  var fileType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identify the full path and filename that corresponds to the file information in this section
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaFileNote {
  
  inline def apply(): SchemaFileNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileNote]
  }
  
  extension [Self <: SchemaFileNote](x: Self) {
    
    inline def setChecksum(value: js.Array[String]): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumNull: Self = StObject.set(x, "checksum", null)
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setChecksumVarargs(value: String*): Self = StObject.set(x, "checksum", js.Array(value*))
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeNull: Self = StObject.set(x, "fileType", null)
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
