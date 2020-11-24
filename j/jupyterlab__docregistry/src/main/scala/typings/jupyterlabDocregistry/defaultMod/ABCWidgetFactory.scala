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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Whether the widgets can start a kernel when opened.
    */
  @JSName("canStartKernel")
  def canStartKernel_MABCWidgetFactory: Boolean = js.native
  
  /**
    * Create a widget for a context.
    */
  /* protected */ def createNewWidget(context: IContext[U]): T = js.native
  /* protected */ def createNewWidget(context: IContext[U], source: T): T = js.native
  
  /**
    * The file types for which the factory should be the default.
    */
  @JSName("defaultFor")
  def defaultFor_MABCWidgetFactory: js.Array[String] = js.native
  
  /**
    * The file types for which the factory should be the default for
    * rendering a document model, if different from editing.
    */
  @JSName("defaultRendered")
  def defaultRendered_MABCWidgetFactory: js.Array[String] = js.native
  
  /**
    * Default factory for toolbar items to be added after the widget is created.
    */
  /* protected */ def defaultToolbarFactory(widget: T): js.Array[IToolbarItem] = js.native
  
  /**
    * The file types the widget can view.
    */
  @JSName("fileTypes")
  def fileTypes_MABCWidgetFactory: js.Array[String] = js.native
  
  /**
    * Get whether the model factory has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MABCWidgetFactory: Boolean = js.native
  
  /**
    * The registered name of the model type used to create the widgets.
    */
  @JSName("modelName")
  def modelName_MABCWidgetFactory: String = js.native
  
  /**
    * The name of the widget to display in dialogs.
    */
  @JSName("name")
  def name_MABCWidgetFactory: String = js.native
  
  /**
    * Whether the widgets prefer having a kernel started.
    */
  @JSName("preferKernel")
  def preferKernel_MABCWidgetFactory: Boolean = js.native
  
  /**
    * Whether the widget factory is read only.
    */
  @JSName("readOnly")
  def readOnly_MABCWidgetFactory: Boolean = js.native
  
  def shutdownOnClose_=(value: Boolean): Unit = js.native
  /**
    * Whether the kernel should be shutdown when the widget is closed.
    */
  @JSName("shutdownOnClose")
  def shutdownOnClose_MABCWidgetFactory: Boolean = js.native
  
  /**
    * A signal emitted when a widget is created.
    */
  @JSName("widgetCreated")
  def widgetCreated_MABCWidgetFactory: ISignal[IWidgetFactory[T, U], T] = js.native
}
