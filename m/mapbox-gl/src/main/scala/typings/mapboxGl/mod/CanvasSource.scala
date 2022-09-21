package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.custom
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "CanvasSource")
@js.native
open class CanvasSource ()
  extends StObject
     with CanvasSourceRaw
     with _AnySourceImpl {
  
  /* CompleteClass */
  var canvas: String | HTMLCanvasElement = js.native
  
  /* CompleteClass */
  var coordinates: js.Array[js.Array[Double]] = js.native
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas | custom = js.native
  /* CompleteClass */
  @JSName("type")
  var type_CanvasSourceRaw: canvas = js.native
}
