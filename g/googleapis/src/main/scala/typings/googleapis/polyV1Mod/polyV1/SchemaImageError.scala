package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageError extends StObject {
  
  /**
    * The type of image error encountered. Optional for older image errors.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file path in the import of the image that was rejected.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaImageError {
  
  inline def apply(): SchemaImageError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageError]
  }
  
  extension [Self <: SchemaImageError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
