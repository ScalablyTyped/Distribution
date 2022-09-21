package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ImageSource")
@js.native
open class ImageSource protected ()
  extends Evented
     with Source {
  def this(id: String, options: CanvasSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  /**
  	 * @private
  	 */
  def this(id: String, options: ImageSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  def this(id: String, options: VideoSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  
  var _boundsArray: RasterBoundsArray = js.native
  
  def _finishLoading(): scala.Unit = js.native
  
  var _loaded: Boolean = js.native
  
  var boundsBuffer: VertexBuffer = js.native
  
  var boundsSegments: SegmentVector = js.native
  
  var coordinates: Coordinates = js.native
  
  var dispatcher: Dispatcher = js.native
  
  /* InferMemberOverrides */
  override def fire(event: Event): this.type & Any = js.native
  
  /* CompleteClass */
  override def hasTransition(): Boolean = js.native
  
  /* CompleteClass */
  var id: String = js.native
  
  var image: HTMLImageElement | ImageBitmap = js.native
  
  def load(): scala.Unit = js.native
  def load(newCoordinates: scala.Unit, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def load(newCoordinates: Coordinates): scala.Unit = js.native
  def load(newCoordinates: Coordinates, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  
  /* CompleteClass */
  override def loadTile(tile: Tile, callback: Callback[scala.Unit]): scala.Unit = js.native
  
  /* CompleteClass */
  override def loaded(): Boolean = js.native
  
  var map: Map = js.native
  
  /* CompleteClass */
  var maxzoom: Double = js.native
  
  /* CompleteClass */
  var minzoom: Double = js.native
  
  @JSName("onAdd")
  def onAdd_MImageSource(map: Map): scala.Unit = js.native
  
  var options: Any = js.native
  
  @JSName("prepare")
  def prepare_MImageSource(): scala.Unit = js.native
  
  /**
  	 * @returns A plain (stringifiable) JS object representing the current state of the source.
  	 * Creating a source using the returned object as the `options` should result in a Source that is
  	 * equivalent to this one.
  	 * @private
  	 */
  /* CompleteClass */
  override def serialize(): Any = js.native
  
  /**
  	 * Sets the image's coordinates and re-renders the map.
  	 *
  	 * @param {Array<Array<number>>} coordinates Four geographical coordinates,
  	 *   represented as arrays of longitude and latitude numbers, which define the corners of the image.
  	 *   The coordinates start at the top left corner of the image and proceed in clockwise order.
  	 *   They do not have to represent a rectangle.
  	 * @returns {ImageSource} this
  	 */
  def setCoordinates(coordinates: Coordinates): this.type = js.native
  
  var texture: Texture | Null = js.native
  
  @JSName("tileID")
  var tileID_ImageSource: CanonicalTileID = js.native
  
  /* CompleteClass */
  var tileSize: Double = js.native
  
  var tiles: StringDictionary[Tile] = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
  
  /**
  	 * Updates the image URL and, optionally, the coordinates. To avoid having the image flash after changing,
  	 * set the `raster-fade-duration` paint property on the raster layer to 0.
  	 *
  	 * @param {Object} options Options object.
  	 * @param {string} [options.url] Required image URL.
  	 * @param {Array<Array<number>>} [options.coordinates] Four geographical coordinates,
  	 *   represented as arrays of longitude and latitude numbers, which define the corners of the image.
  	 *   The coordinates start at the top left corner of the image and proceed in clockwise order.
  	 *   They do not have to represent a rectangle.
  	 * @returns {ImageSource} this
  	 */
  def updateImage(options: typings.maplibreGl.anon.Coordinates): this.type = js.native
  
  var url: String = js.native
}
