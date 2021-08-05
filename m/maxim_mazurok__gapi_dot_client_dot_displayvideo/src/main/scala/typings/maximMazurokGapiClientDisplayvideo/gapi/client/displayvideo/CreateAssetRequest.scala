package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssetRequest extends StObject {
  
  /** Required. The filename of the asset, including the file extension. The filename must be UTF-8 encoded with a maximum size of 240 bytes. */
  var filename: js.UndefOr[String] = js.undefined
}
object CreateAssetRequest {
  
  inline def apply(): CreateAssetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssetRequest]
  }
  
  extension [Self <: CreateAssetRequest](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
