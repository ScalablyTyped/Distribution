package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iv-viewer", "FullScreenViewer")
@js.native
class FullScreenViewer () extends ImageViewer {
  def this(options: Options) = this()
  @JSName("_elements")
  var _elements_FullScreenViewer: FullScreenElements = js.native
  @JSName("_events")
  var _events_FullScreenViewer: FullScreenEvents = js.native
  /* protected */ def _initFullScreenEvents(): Unit = js.native
  def hide(): Unit = js.native
  def show(imageSrc: String): Unit = js.native
  def show(imageSrc: String, hiResImageSrc: String): Unit = js.native
}

