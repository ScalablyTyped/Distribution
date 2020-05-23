package typings.jupyterlabDocregistry.defaultMod

import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.luminoMessaging.mod.IMessageHandler because Already inherited
- typings.luminoDisposable.mod.IObservableDisposable because Already inherited
- typings.luminoWidgets.widgetMod.Widget because Already inherited
- typings.luminoWidgets.mod.Widget because Already inherited
- typings.jupyterlabDocregistry.registryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, content, id, layout, parent, revealed, toolbar. Inlined context, setFragment */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentWidget")
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

