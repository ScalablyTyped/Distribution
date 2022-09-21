package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ImageAtlas")
@js.native
open class ImageAtlas protected () extends StObject {
  def this(icons: StringDictionary[StyleImage], patterns: StringDictionary[StyleImage]) = this()
  
  def addImages(
    images: StringDictionary[StyleImage],
    positions: StringDictionary[ImagePosition],
    bins: js.Array[Rect]
  ): scala.Unit = js.native
  
  var haveRenderCallbacks: js.Array[String] = js.native
  
  var iconPositions: StringDictionary[ImagePosition] = js.native
  
  var image: RGBAImage = js.native
  
  def patchUpdatedImage(position: ImagePosition, image: StyleImage, texture: Texture): scala.Unit = js.native
  
  def patchUpdatedImages(imageManager: ImageManager, texture: Texture): scala.Unit = js.native
  
  var patternPositions: StringDictionary[ImagePosition] = js.native
  
  var uploaded: Boolean = js.native
}
