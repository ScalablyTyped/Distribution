package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderResponse extends StObject {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[String | js.typedarray.ArrayBuffer | js.Object] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var url: String
}
object LoaderResponse {
  
  inline def apply(url: String): LoaderResponse = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoaderResponse] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setData(value: String | js.typedarray.ArrayBuffer | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
