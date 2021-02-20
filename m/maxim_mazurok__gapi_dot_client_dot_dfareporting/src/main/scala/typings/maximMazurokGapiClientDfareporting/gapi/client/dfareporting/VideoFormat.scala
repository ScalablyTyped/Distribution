package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFormat extends StObject {
  
  /** File type of the video format. */
  var fileType: js.UndefOr[String] = js.native
  
  /** ID of the video format. */
  var id: js.UndefOr[Double] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormat". */
  var kind: js.UndefOr[String] = js.native
  
  /** The resolution of this video format. */
  var resolution: js.UndefOr[Size] = js.native
  
  /** The target bit rate of this video format. */
  var targetBitRate: js.UndefOr[Double] = js.native
}
object VideoFormat {
  
  @scala.inline
  def apply(): VideoFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFormat]
  }
  
  @scala.inline
  implicit class VideoFormatMutableBuilder[Self <: VideoFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResolution(value: Size): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setTargetBitRate(value: Double): Self = StObject.set(x, "targetBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBitRateUndefined: Self = StObject.set(x, "targetBitRate", js.undefined)
  }
}
