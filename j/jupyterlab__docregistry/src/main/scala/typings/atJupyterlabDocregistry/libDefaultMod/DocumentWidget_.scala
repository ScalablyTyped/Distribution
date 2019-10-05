package typings.atJupyterlabDocregistry.libDefaultMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
- typings.atPhosphorMessaging.atPhosphorMessagingMod.IMessageHandler because Already inherited
- typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable because Already inherited
- typings.atPhosphorWidgets.libWidgetMod.Widget because Already inherited
- typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget because Already inherited
- typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, id, layout, parent. Inlined context, setFragment */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentWidget")
@js.native
class DocumentWidget_[T /* <: Widget */, U /* <: IModel */] protected () extends MainAreaWidget[T] {
  def this(options: IOptions[T, U]) = this()
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
  val context: IContext[U] = js.native
  /**
    * Set URI fragment identifier.
    */
  def setFragment(fragment: String): Unit = js.native
}

