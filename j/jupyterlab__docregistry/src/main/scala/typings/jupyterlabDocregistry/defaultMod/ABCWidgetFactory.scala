package typings.jupyterlabDocregistry.defaultMod

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/default", "ABCWidgetFactory")
@js.native
abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected () extends IWidgetFactory[T, U] {
  /**
    * Construct a new `ABCWidgetFactory`.
    */
  def this(options: IWidgetFactoryOptions[T]) = this()
  var _canStartKernel: js.Any = js.native
  var _defaultFor: js.Any = js.native
  var _defaultRendered: js.Any = js.native
  var _fileTypes: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _modelName: js.Any = js.native
  var _name: js.Any = js.native
  var _preferKernel: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _shutdownOnClose: js.Any = js.native
  var _toolbarFactory: js.Any = js.native
  var _widgetCreated: js.Any = js.native
  /**
    * The file types the widget can view.
    */
  /* CompleteClass */
  override val fileTypes: js.Array[String] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The name of the widget to display in dialogs.
    */
  /* CompleteClass */
  override val name: String = js.native
  /**
    * Whether the widgets can start a kernel when opened.
    */
  @JSName("canStartKernel")
  def canStartKernel_MABCWidgetFactory(): Boolean = js.native
  /**
    * Create a widget for a context.
    */
  /* protected */ def createNewWidget(context: IContext[U]): T = js.native
  /* protected */ def createNewWidget(context: IContext[U], source: T): T = js.native
  /**
    * The file types for which the factory should be the default.
    */
  @JSName("defaultFor")
  def defaultFor_MABCWidgetFactory(): js.Array[String] = js.native
  /**
    * The file types for which the factory should be the default for
    * rendering a document model, if different from editing.
    */
  @JSName("defaultRendered")
  def defaultRendered_MABCWidgetFactory(): js.Array[String] = js.native
  /**
    * Default factory for toolbar items to be added after the widget is created.
    */
  /* protected */ def defaultToolbarFactory(widget: T): js.Array[IToolbarItem] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * The file types the widget can view.
    */
  @JSName("fileTypes")
  def fileTypes_MABCWidgetFactory(): js.Array[String] = js.native
  /**
    * Get whether the model factory has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MABCWidgetFactory(): Boolean = js.native
  /**
    * The registered name of the model type used to create the widgets.
    */
  @JSName("modelName")
  def modelName_MABCWidgetFactory(): String = js.native
  /**
    * The name of the widget to display in dialogs.
    */
  @JSName("name")
  def name_MABCWidgetFactory(): String = js.native
  /**
    * Whether the widgets prefer having a kernel started.
    */
  @JSName("preferKernel")
  def preferKernel_MABCWidgetFactory(): Boolean = js.native
  /**
    * Whether the widget factory is read only.
    */
  @JSName("readOnly")
  def readOnly_MABCWidgetFactory(): Boolean = js.native
  /**
    * Whether the kernel should be shutdown when the widget is closed.
    */
  @JSName("shutdownOnClose")
  def shutdownOnClose_MABCWidgetFactory(): Boolean = js.native
  @JSName("shutdownOnClose")
  def shutdownOnClose_MABCWidgetFactory(value: Boolean): js.Any = js.native
  /**
    * A signal emitted when a widget is created.
    */
  @JSName("widgetCreated")
  def widgetCreated_MABCWidgetFactory(): ISignal[IWidgetFactory[T, U], T] = js.native
}

