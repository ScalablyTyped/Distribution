package typings.atJupyterlabHtmlviewer.atJupyterlabHtmlviewerMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.IFrame
import typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidgetNs.IOptionsOptionalContent
import typings.atJupyterlabDocregistry.libMod.DocumentWidget
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, id, layout, parent. Inlined  */ @JSImport("@jupyterlab/htmlviewer", "HTMLViewer")
@js.native
class HTMLViewer protected () extends DocumentWidget[IFrame, IModel] {
  /**
    * Create a new widget for rendering HTML.
    */
  def this(options: IOptionsOptionalContent[Widget, IModel]) = this()
  var _monitor: js.Any = js.native
  var _objectUrl: js.Any = js.native
  var _parser: js.Any = js.native
  /**
    * Render HTML in IFrame into this widget's node.
    */
  var _renderModel: js.Any = js.native
  var _renderPending: js.Any = js.native
  /**
    * Set a <base> element in the HTML string so that the iframe
    * can correctly dereference relative links.
    */
  var _setBase: js.Any = js.native
  var _trustedChanged: js.Any = js.native
  /**
    * Whether the HTML document is trusted. If trusted,
    * it can execute Javascript in the iframe sandbox.
    */
  var trusted: Boolean = js.native
  /**
    * Emitted when the trust state of the document changes.
    */
  val trustedChanged: ISignal[this.type, Boolean] = js.native
  /**
    * Handle and update request.
    */
  /* protected */ def onUpdateRequest(): Unit = js.native
}

