package typings.jupyterlabHtmlviewer

import typings.jupyterlabApputils.mod.IFrame
import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptionsOptionalContent
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/htmlviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoMessaging.mod.IMessageHandler because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.luminoWidgets.widgetMod.Widget because Already inherited
  - typings.luminoWidgets.mod.Widget because Already inherited
  - typings.jupyterlabDocregistry.registryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, content, id, layout, parent, revealed, toolbar. Inlined  */ @js.native
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
      * Handle and update request.
      */
    /* protected */ def onUpdateRequest(): Unit = js.native
    /**
      * Whether the HTML document is trusted. If trusted,
      * it can execute Javascript in the iframe sandbox.
      */
    def trusted(): Boolean = js.native
    def trusted(value: Boolean): js.Any = js.native
    /**
      * Emitted when the trust state of the document changes.
      */
    def trustedChanged(): ISignal[this.type, Boolean] = js.native
  }
  
  @js.native
  class HTMLViewerFactory () extends ABCWidgetFactory[HTMLViewer, IModel]
  
  val IHTMLViewerTracker: Token[typings.jupyterlabHtmlviewer.mod.IHTMLViewerTracker] = js.native
  type IHTMLViewerTracker = IWidgetTracker[HTMLViewer]
}

