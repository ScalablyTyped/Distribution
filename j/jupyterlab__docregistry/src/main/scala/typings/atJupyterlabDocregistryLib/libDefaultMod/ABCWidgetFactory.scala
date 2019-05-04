package typings
package atJupyterlabDocregistryLib.libDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/docregistry/lib/default", "ABCWidgetFactory")
@js.native
abstract class ABCWidgetFactory[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentWidget */ js.Any */, U /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any */] protected () extends js.Object {
  /**
    * Construct a new `ABCWidgetFactory`.
    */
  def this(options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IWidgetFactoryOptions<T> */ js.Any) = this()
  var _canStartKernel: js.Any = js.native
  var _defaultFor: js.Any = js.native
  var _defaultRendered: js.Any = js.native
  var _fileTypes: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _modelName: js.Any = js.native
  var _name: js.Any = js.native
  var _preferKernel: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _toolbarFactory: js.Any = js.native
  var _widgetCreated: js.Any = js.native
  /**
    * Whether the widgets can start a kernel when opened.
    */
  val canStartKernel: scala.Boolean = js.native
  /**
    * The file types for which the factory should be the default.
    */
  val defaultFor: js.Array[java.lang.String] = js.native
  /**
    * The file types for which the factory should be the default for
    * rendering a document model, if different from editing.
    */
  val defaultRendered: js.Array[java.lang.String] = js.native
  /**
    * The file types the widget can view.
    */
  val fileTypes: js.Array[java.lang.String] = js.native
  /**
    * Get whether the model factory has been disposed.
    */
  val isDisposed: scala.Boolean = js.native
  /**
    * The registered name of the model type used to create the widgets.
    */
  val modelName: java.lang.String = js.native
  /**
    * The name of the widget to display in dialogs.
    */
  val name: java.lang.String = js.native
  /**
    * Whether the widgets prefer having a kernel started.
    */
  val preferKernel: scala.Boolean = js.native
  /**
    * Whether the widget factory is read only.
    */
  val readOnly: scala.Boolean = js.native
  /**
    * A signal emitted when a widget is created.
    */
  val widgetCreated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IWidgetFactory<T, U> */ _, 
    T
  ] = js.native
  /**
    * Create a new widget given a document model and a context.
    *
    * #### Notes
    * It should emit the [widgetCreated] signal with the new widget.
    */
  def createNew(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any
  ): T = js.native
  /**
    * Create a widget for a context.
    */
  /* protected */ def createNewWidget(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any
  ): T = js.native
  /**
    * Default factory for toolbar items to be added after the widget is created.
    */
  /* protected */ def defaultToolbarFactory(widget: T): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IToolbarItem */ _
  ] = js.native
  /**
    * Dispose of the resources held by the document manager.
    */
  def dispose(): scala.Unit = js.native
}

