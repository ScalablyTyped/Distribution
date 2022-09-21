package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateAssetRequest extends StObject {
  
  /**
    * Required. The filename of the asset, including the file extension. The filename must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var filename: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateAssetRequest {
  
  inline def apply(): SchemaCreateAssetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateAssetRequest]
  }
  
  extension [Self <: SchemaCreateAssetRequest](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
