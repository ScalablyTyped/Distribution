package typings
package atJupyterlabFileeditorLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorCodeWrapper")
@js.native
class FileEditorCodeWrapper protected () extends js.Object {
  /**
    * Construct a new editor widget.
    */
  def this(options: atJupyterlabFileeditorLib.libWidgetMod.FileEditorNs.IOptions) = this()
  var _context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context = js.native
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
  val context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context = js.native
  /**
    * A promise that resolves when the file editor is ready.
    */
  val ready: js.Promise[scala.Unit] = js.native
}

