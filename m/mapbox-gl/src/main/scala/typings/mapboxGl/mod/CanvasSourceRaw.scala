package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.canvas
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasSourceRaw
  extends Source
     with CanvasSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_CanvasSourceRaw: canvas = js.native
}
object CanvasSourceRaw {
  
  @scala.inline
  def apply(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]], `type`: canvas): CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasSourceRaw]
  }
  
  @scala.inline
  implicit class CanvasSourceRawMutableBuilder[Self <: CanvasSourceRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
