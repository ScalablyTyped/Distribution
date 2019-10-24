package typings.atJupyterlabHtmlviewer

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabHtmlviewer.atJupyterlabHtmlviewerMod.HTMLViewer
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/htmlviewer", JSImport.Namespace)
@js.native
object atJupyterlabHtmlviewerMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentWidget<IFrame> * / any
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentWidget<IFrame> * / any */ @js.native
  class HTMLViewer protected () extends js.Object {
    /**
      * Create a new widget for rendering HTML.
      */
    def this(options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentWidget.IOptionsOptionalContent */ js.Any) = this()
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
      * Dispose of resources held by the html viewer.
      */
    def dispose(): Unit = js.native
    /**
      * Handle and update request.
      */
    /* protected */ def onUpdateRequest(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ABCWidgetFactory<HTMLViewer> * / any */ @js.native
  class HTMLViewerFactory () extends js.Object {
    /**
      * Create a new widget given a context.
      */
    /* protected */ def createNewWidget(
      context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any
    ): HTMLViewer = js.native
  }
  
  val IHTMLViewerTracker: Token[typings.atJupyterlabHtmlviewer.atJupyterlabHtmlviewerMod.IHTMLViewerTracker] = js.native
  type IHTMLViewerTracker = IWidgetTracker[HTMLViewer]
}

