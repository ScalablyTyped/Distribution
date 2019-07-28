package typings.atJupyterlabFileeditor.libWidgetMod

import typings.atJupyterlabFileeditor.libWidgetMod.FileEditorFactoryNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorFactory")
@js.native
class FileEditorFactory protected () extends js.Object {
  /**
    * Construct a new editor widget factory.
    */
  def this(options: IOptions) = this()
  var _services: js.Any = js.native
  /**
    * Create a new widget given a context.
    */
  /* protected */ def createNewWidget(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.CodeContext */ js.Any
  ): js.Any = js.native
}

