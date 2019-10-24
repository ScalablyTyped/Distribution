package typings.atJupyterlabMarkdownviewer.libWidgetMod

import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ABCWidgetFactory<MarkdownDocument> * / any */ @JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewerFactory")
@js.native
class MarkdownViewerFactory_ protected () extends js.Object {
  /**
    * Construct a new mimetype widget factory.
    */
  def this(options: IOptions) = this()
  var _fileType: js.Any = js.native
  var _rendermime: js.Any = js.native
  /**
    * Create a new widget given a context.
    */
  /* protected */ def createNewWidget(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any
  ): MarkdownDocument = js.native
}

