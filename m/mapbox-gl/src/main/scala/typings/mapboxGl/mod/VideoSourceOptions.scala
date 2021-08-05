package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSourceOptions extends StObject {
  
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}
object VideoSourceOptions {
  
  inline def apply(): VideoSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSourceOptions]
  }
  
  extension [Self <: VideoSourceOptions](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
