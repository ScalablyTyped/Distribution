package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssetImportMessage extends StObject {
  
  /**
    * The code associated with this message.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional file path. Only present for those error codes that specify it.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional image error. Only present for INVALID_IMAGE_FILE.
    */
  var imageError: js.UndefOr[SchemaImageError] = js.undefined
  
  /**
    * An optional OBJ parse error. Only present for OBJ_PARSE_ERROR.
    */
  var objParseError: js.UndefOr[SchemaObjParseError] = js.undefined
}
object SchemaAssetImportMessage {
  
  inline def apply(): SchemaAssetImportMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssetImportMessage]
  }
  
  extension [Self <: SchemaAssetImportMessage](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setImageError(value: SchemaImageError): Self = StObject.set(x, "imageError", value.asInstanceOf[js.Any])
    
    inline def setImageErrorUndefined: Self = StObject.set(x, "imageError", js.undefined)
    
    inline def setObjParseError(value: SchemaObjParseError): Self = StObject.set(x, "objParseError", value.asInstanceOf[js.Any])
    
    inline def setObjParseErrorUndefined: Self = StObject.set(x, "objParseError", js.undefined)
  }
}
