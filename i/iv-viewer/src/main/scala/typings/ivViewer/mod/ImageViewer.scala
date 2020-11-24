package typings.ivViewer.mod

import typings.ivViewer.anon.Container
import typings.ivViewer.anon.X
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iv-viewer", "ImageViewer")
@js.native
class ImageViewer () extends js.Object {
  def this(element: Element) = this()
  def this(element: Null, options: Options) = this()
  def this(element: Element, options: Options) = this()
  
  /* protected */ def _calculateDimensions(): Unit = js.native
  
  /* protected */ def _doubleTapToZoom(): Unit = js.native
  
  var _elements: Elements = js.native
  
  var _events: Events = js.native
  
  /* protected */ def _findContainerAndImageSrc(): Container = js.native
  /* protected */ def _findContainerAndImageSrc(element: String): Container = js.native
  /* protected */ def _findContainerAndImageSrc(element: Element): Container = js.native
  
  var _frames: Frames = js.native
  
  /* protected */ def _getImageCurrentDim(): Unit = js.native
  
  var _images: Images = js.native
  
  /* protected */ def _init(): Unit = js.native
  
  /* protected */ def _initDom(): Unit = js.native
  
  /* protected */ def _initEvents(): Unit = js.native
  
  /* protected */ def _initImageSlider(): Unit = js.native
  
  /* protected */ def _initSnapSlider(): Unit = js.native
  
  /* protected */ def _initZoomSlider(): Unit = js.native
  
  /* protected */ def _loadHighResImage(): Unit = js.native
  
  /* protected */ def _loadImages(): Unit = js.native
  
  var _options: Options = js.native
  
  /* protected */ def _pinchAndZoom(): Unit = js.native
  
  /* protected */ def _scrollZoom(): Unit = js.native
  
  var _sliders: Sliders = js.native
  
  /* protected */ def _snapViewEvents(): Unit = js.native
  
  var _state: State = js.native
  
  def destroy(): Unit = js.native
  
  def hideSnapView(): Unit = js.native
  
  def load(imageSrc: String): Unit = js.native
  def load(imageSrc: String, hiResImageSrc: String): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def resetZoom(): Unit = js.native
  def resetZoom(animate: Boolean): Unit = js.native
  
  def showSnapView(): Unit = js.native
  def showSnapView(noTimeout: Boolean): Unit = js.native
  
  def zoom(perc: Double): Unit = js.native
  def zoom(perc: Double, point: X): Unit = js.native
}
/* static members */
@JSImport("iv-viewer", "ImageViewer")
@js.native
object ImageViewer extends js.Object {
  
  var defaults: Options = js.native
}
