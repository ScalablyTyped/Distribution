package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.image_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSourceRaw
  extends Source
     with ImageSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_ImageSourceRaw: image_ = js.native
}
object ImageSourceRaw {
  
  @scala.inline
  def apply(`type`: image_): ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSourceRaw]
  }
  
  @scala.inline
  implicit class ImageSourceRawMutableBuilder[Self <: ImageSourceRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: image_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
