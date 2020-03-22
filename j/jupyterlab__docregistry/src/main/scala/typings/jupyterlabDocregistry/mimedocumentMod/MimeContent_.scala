package typings.jupyterlabDocregistry.mimedocumentMod

import typings.jupyterlabDocregistry.mimedocumentMod.MimeContent.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeContent")
@js.native
class MimeContent_ protected () extends Widget {
  /**
    * Construct a new widget.
    */
  def this(options: IOptions) = this()
  /**
    * A bound change callback.
    */
  var _changeCallback: js.Any = js.native
  var _context: js.Any = js.native
  var _dataType: js.Any = js.native
  var _fragment: js.Any = js.native
  var _isRendering: js.Any = js.native
  var _monitor: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Render the mime content.
    */
  var _render: js.Any = js.native
  var _renderRequested: js.Any = js.native
  /**
    * The mimetype for this rendered content.
    */
  val mimeType: String = js.native
  val renderer: IRenderer = js.native
  /**
    * A promise that resolves when the widget is ready.
    */
  def ready(): js.Promise[Unit] = js.native
  /**
    * Set URI fragment identifier.
    */
  def setFragment(fragment: String): Unit = js.native
}

