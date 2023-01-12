package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedVideoReference extends StObject {
  
  /** Available transcode format. Value is defined in video/storage/proto/content_header.proto */
  var format: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Transcode status */
  var status: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedVideoReference {
  
  inline def apply(): AppsDynamiteSharedVideoReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedVideoReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedVideoReference] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: js.Array[Double]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatVarargs(value: Double*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
