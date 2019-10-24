package typings.atJupyterlabFileeditor.libWidgetMod

import typings.atJupyterlabFileeditor.libWidgetMod.FileEditor.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditorWrapper * / any */ @JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorCodeWrapper")
@js.native
class FileEditorCodeWrapper protected () extends js.Object {
  /**
    * Construct a new editor widget.
    */
  def this(options: IOptions) = this()
  var _context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any = js.native
  /**
    * Handle a change to the collaborators on the model
    * by updating UI elements associated with them.
    */
  var _onCollaboratorsChanged: js.Any = js.native
  /**
    * Handle a change in context model content.
    */
  var _onContentChanged: js.Any = js.native
  /**
    * Handle actions that should be taken when the context is ready.
    */
  var _onContextReady: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Get the context for the editor widget.
    */
  val context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any = js.native
  /**
    * A promise that resolves when the file editor is ready.
    */
  val ready: js.Promise[Unit] = js.native
}

