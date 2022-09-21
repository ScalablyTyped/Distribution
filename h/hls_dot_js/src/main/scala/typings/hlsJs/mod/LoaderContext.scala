package typings.hlsJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderContext extends StObject {
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var progressData: js.UndefOr[Boolean] = js.undefined
  
  var rangeEnd: js.UndefOr[Double] = js.undefined
  
  var rangeStart: js.UndefOr[Double] = js.undefined
  
  var responseType: String
  
  var url: String
}
object LoaderContext {
  
  inline def apply(responseType: String, url: String): LoaderContext = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderContext]
  }
  
  extension [Self <: LoaderContext](x: Self) {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setProgressData(value: Boolean): Self = StObject.set(x, "progressData", value.asInstanceOf[js.Any])
    
    inline def setProgressDataUndefined: Self = StObject.set(x, "progressData", js.undefined)
    
    inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
