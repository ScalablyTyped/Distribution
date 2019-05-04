package typings
package atJupyterlabDocregistryLib.libMimedocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeContent")
@js.native
class MimeContent protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new widget.
    */
  def this(options: atJupyterlabDocregistryLib.libMimedocumentMod.MimeContentNs.IOptions) = this()
  /**
    * A bound change callback.
    */
  var _changeCallback: js.Any = js.native
  var _context: js.Any = js.native
  var _dataType: js.Any = js.native
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
  val mimeType: java.lang.String = js.native
  /**
    * A promise that resolves when the widget is ready.
    */
  val ready: js.Promise[scala.Unit] = js.native
  val renderer: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer = js.native
}

