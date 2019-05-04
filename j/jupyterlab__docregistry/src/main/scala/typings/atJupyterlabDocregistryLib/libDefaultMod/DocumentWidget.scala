package typings
package atJupyterlabDocregistryLib.libDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentWidget")
@js.native
class DocumentWidget[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any */] protected ()
  extends atJupyterlabApputilsLib.atJupyterlabApputilsMod.MainAreaWidget[T] {
  def this(options: atJupyterlabDocregistryLib.libDefaultMod.DocumentWidgetNs.IOptions[T, U]) = this()
  /**
    * Handle the dirty state of the context model.
    */
  var _handleDirtyState: js.Any = js.native
  /**
    * Handle a change to the context model state.
    */
  var _onModelStateChanged: js.Any = js.native
  /**
    * Handle a path change.
    */
  var _onPathChanged: js.Any = js.native
  val context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any = js.native
}

