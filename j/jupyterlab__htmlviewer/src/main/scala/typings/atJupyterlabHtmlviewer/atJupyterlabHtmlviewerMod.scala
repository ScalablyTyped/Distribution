package typings.atJupyterlabHtmlviewer

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.IFrame
import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryMod.DocumentWidget
import typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptionsOptionalContent
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/htmlviewer", JSImport.Namespace)
@js.native
object atJupyterlabHtmlviewerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
  - typings.atPhosphorMessaging.atPhosphorMessagingMod.IMessageHandler because Already inherited
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable because Already inherited
  - typings.atPhosphorWidgets.libWidgetMod.Widget because Already inherited
  - typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget because Already inherited
  - typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, id, layout, parent. Inlined  */ @js.native
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
  
  @js.native
  class HTMLViewerFactory () extends ABCWidgetFactory[HTMLViewer, IModel]
  
  val IHTMLViewerTracker: Token[typings.atJupyterlabHtmlviewer.atJupyterlabHtmlviewerMod.IHTMLViewerTracker] = js.native
  type IHTMLViewerTracker = IWidgetTracker[HTMLViewer]
}

