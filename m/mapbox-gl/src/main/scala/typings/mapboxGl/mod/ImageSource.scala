package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ImageSource")
@js.native
class ImageSource ()
  extends StObject
     with ImageSourceRaw
     with AnySourceImpl {
  def this(options: ImageSourceOptions) = this()
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  var type_ImageSourceRaw: image_ = js.native
  
  def updateImage(options: ImageSourceOptions): this.type = js.native
}
