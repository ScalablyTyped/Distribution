package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFormat extends StObject {
  
  /** File type of the video format. */
  var fileType: js.UndefOr[String] = js.undefined
  
  /** ID of the video format. */
  var id: js.UndefOr[Double] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormat". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The resolution of this video format. */
  var resolution: js.UndefOr[Size] = js.undefined
  
  /** The target bit rate of this video format. */
  var targetBitRate: js.UndefOr[Double] = js.undefined
}
object VideoFormat {
  
  inline def apply(): VideoFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFormat]
  }
  
  extension [Self <: VideoFormat](x: Self) {
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResolution(value: Size): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setTargetBitRate(value: Double): Self = StObject.set(x, "targetBitRate", value.asInstanceOf[js.Any])
    
    inline def setTargetBitRateUndefined: Self = StObject.set(x, "targetBitRate", js.undefined)
  }
}
