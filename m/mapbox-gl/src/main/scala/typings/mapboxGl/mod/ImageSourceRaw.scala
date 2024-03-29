package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.image_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSourceRaw
  extends StObject
     with Source
     with ImageSourceOptions
     with _AnySourceData {
  
  @JSName("type")
  var type_ImageSourceRaw: image_
}
object ImageSourceRaw {
  
  inline def apply(): ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageSourceRaw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageSourceRaw] (val x: Self) extends AnyVal {
    
    inline def setType(value: image_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
