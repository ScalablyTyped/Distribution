package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSourceOptions extends StObject {
  
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object VideoSourceOptions {
  
  @scala.inline
  def apply(): VideoSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSourceOptions]
  }
  
  @scala.inline
  implicit class VideoSourceOptionsMutableBuilder[Self <: VideoSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
