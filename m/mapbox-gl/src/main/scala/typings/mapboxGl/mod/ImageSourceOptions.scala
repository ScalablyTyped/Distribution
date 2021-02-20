package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSourceOptions extends StObject {
  
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ImageSourceOptions {
  
  @scala.inline
  def apply(): ImageSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSourceOptions]
  }
  
  @scala.inline
  implicit class ImageSourceOptionsMutableBuilder[Self <: ImageSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
