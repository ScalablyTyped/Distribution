package typings.hlsJs.mod

import typings.hlsJs.anon.Message
import typings.hlsJs.hlsJsStrings.demuxerWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorData extends StObject {
  
  var buffer: js.UndefOr[Double] = js.undefined
  
  var bytes: js.UndefOr[Double] = js.undefined
  
  var context: js.UndefOr[PlaylistLoaderContext] = js.undefined
  
  var details: ErrorDetails
  
  var err: js.UndefOr[Message] = js.undefined
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var event: js.UndefOr[(/* keyof hls.js.hls.js.HlsListeners */ String) | demuxerWorker] = js.undefined
  
  var fatal: Boolean
  
  var frag: js.UndefOr[Fragment] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var levelRetry: js.UndefOr[Boolean] = js.undefined
  
  var loader: js.UndefOr[Loader[LoaderContext]] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var networkDetails: js.UndefOr[Any] = js.undefined
  
  var parent: js.UndefOr[PlaylistLevelType] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var response: js.UndefOr[LoaderResponse] = js.undefined
  
  var `type`: ErrorTypes
  
  var url: js.UndefOr[String] = js.undefined
}
object ErrorData {
  
  inline def apply(details: ErrorDetails, fatal: Boolean, `type`: ErrorTypes): ErrorData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorData]
  }
  
  extension [Self <: ErrorData](x: Self) {
    
    inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setContext(value: PlaylistLoaderContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDetails(value: ErrorDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setErr(value: Message): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEvent(value: (/* keyof hls.js.hls.js.HlsListeners */ String) | demuxerWorker): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setFragUndefined: Self = StObject.set(x, "frag", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelRetry(value: Boolean): Self = StObject.set(x, "levelRetry", value.asInstanceOf[js.Any])
    
    inline def setLevelRetryUndefined: Self = StObject.set(x, "levelRetry", js.undefined)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLoader(value: Loader[LoaderContext]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setNetworkDetails(value: Any): Self = StObject.set(x, "networkDetails", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetailsUndefined: Self = StObject.set(x, "networkDetails", js.undefined)
    
    inline def setParent(value: PlaylistLevelType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setResponse(value: LoaderResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setType(value: ErrorTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
