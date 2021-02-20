package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ImageSource")
@js.native
class ImageSource ()
  extends ImageSourceRaw
     with AnySourceImpl {
  def this(options: ImageSourceOptions) = this()
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  
  def updateImage(options: ImageSourceOptions): this.type = js.native
}
