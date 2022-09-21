package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInfo extends StObject {
  
  /** Contains additional video information only if document_type is VIDEO. */
  var videoInfo: js.UndefOr[VideoInfo] = js.undefined
}
object TypeInfo {
  
  inline def apply(): TypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeInfo]
  }
  
  extension [Self <: TypeInfo](x: Self) {
    
    inline def setVideoInfo(value: VideoInfo): Self = StObject.set(x, "videoInfo", value.asInstanceOf[js.Any])
    
    inline def setVideoInfoUndefined: Self = StObject.set(x, "videoInfo", js.undefined)
  }
}
