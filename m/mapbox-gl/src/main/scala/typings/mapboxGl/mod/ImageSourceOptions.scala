package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSourceOptions extends StObject {
  
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ImageSourceOptions {
  
  inline def apply(): ImageSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSourceOptions]
  }
  
  extension [Self <: ImageSourceOptions](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
