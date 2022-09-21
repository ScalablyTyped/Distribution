package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ImageManager")
@js.native
open class ImageManager () extends Evented {
  
  def _notify(ids: js.Array[String], callback: Callback[StringDictionary[StyleImage]]): scala.Unit = js.native
  
  def _updatePatternAtlas(): scala.Unit = js.native
  
  def _validate(id: String, image: StyleImage): Boolean = js.native
  
  def _validateContent(content: js.Tuple4[Double, Double, Double, Double], image: StyleImage): Boolean = js.native
  
  def _validateStretch(stretch: js.Array[js.Tuple2[Double, Double]], size: Double): Boolean = js.native
  
  def addImage(id: String, image: StyleImage): scala.Unit = js.native
  
  var atlasImage: RGBAImage = js.native
  
  var atlasTexture: Texture = js.native
  
  def beginFrame(): scala.Unit = js.native
  
  def bind(context: Context): scala.Unit = js.native
  
  var callbackDispatchedThisFrame: StringDictionary[Boolean] = js.native
  
  var dirty: Boolean = js.native
  
  def dispatchRenderCallbacks(ids: js.Array[String]): scala.Unit = js.native
  
  def getImage(id: String): StyleImage = js.native
  
  def getImages(ids: js.Array[String], callback: Callback[StringDictionary[StyleImage]]): scala.Unit = js.native
  
  def getPattern(id: String): ImagePosition = js.native
  
  def getPixelSize(): Height = js.native
  
  var images: StringDictionary[StyleImage] = js.native
  
  def isLoaded(): Boolean = js.native
  
  def listImages(): js.Array[String] = js.native
  
  var loaded: Boolean = js.native
  
  var patterns: StringDictionary[Pattern] = js.native
  
  def removeImage(id: String): scala.Unit = js.native
  
  var requestors: js.Array[typings.maplibreGl.anon.Callback] = js.native
  
  def setLoaded(loaded: Boolean): scala.Unit = js.native
  
  def updateImage(id: String, image: StyleImage): scala.Unit = js.native
  
  var updatedImages: StringDictionary[Boolean] = js.native
}
