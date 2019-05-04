package typings
package atJupyterlabDocregistryLib.libRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/registry", "DocumentRegistry")
@js.native
/**
  * Construct a new document registry.
  */
class DocumentRegistry ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  def this(options: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IOptions) = this()
  var _changed: js.Any = js.native
  var _defaultRenderedWidgetFactories: js.Any = js.native
  var _defaultWidgetFactories: js.Any = js.native
  var _defaultWidgetFactory: js.Any = js.native
  var _extenders: js.Any = js.native
  var _fileTypes: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _modelFactories: js.Any = js.native
  var _widgetFactories: js.Any = js.native
  var _widgetFactoryExtensions: js.Any = js.native
  /**
    * A signal emitted when the registry has changed.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IChangedArgs
  ] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Add a file type to the document registry.
    *
    * @params fileType - The file type object to register.
    *
    * @returns A disposable which will unregister the command.
    *
    * #### Notes
    * These are used to populate the "Create New" dialog.
    */
  def addFileType(fileType: stdLib.Partial[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IFileType]): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Add a model factory to the registry.
    *
    * @param factory - The factory instance.
    *
    * @returns A disposable which will unregister the factory.
    *
    * #### Notes
    * If a factory with the given `name` is already registered, or
    * the given factory is already registered, a warning will be logged
    * and this will be a no-op.
    */
  def addModelFactory(factory: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.ModelFactory): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Add a widget extension to the registry.
    *
    * @param widgetName - The name of the widget factory.
    *
    * @param extension - A widget extension.
    *
    * @returns A disposable which will unregister the extension.
    *
    * #### Notes
    * If the extension is already registered for the given
    * widget name, a warning will be logged and this will be a no-op.
    */
  def addWidgetExtension(
    widgetName: java.lang.String,
    extension: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetExtension
  ): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Add a widget factory to the registry.
    *
    * @param factory - The factory instance to register.
    *
    * @returns A disposable which will unregister the factory.
    *
    * #### Notes
    * If a factory with the given `'displayName'` is already registered,
    * a warning will be logged, and this will be a no-op.
    * If `'*'` is given as a default extension, the factory will be registered
    * as the global default.
    * If an extension or global default is already registered, this factory
    * will override the existing default.
    */
  def addWidgetFactory(factory: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Get the default rendered widget factory for a path.
    *
    * @param path - The path to for which to find a widget factory.
    *
    * @returns The default rendered widget factory for the path.
    *
    * ### Notes
    * If the widget factory has registered a separate set of `defaultRendered`
    * file types and there is a match in that set, this returns that.
    * Otherwise, this returns the same widget factory as
    * [[defaultWidgetFactory]].
    */
  def defaultRenderedWidgetFactory(path: java.lang.String): atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory = js.native
  /**
    * Get the default widget factory for a path.
    *
    * @param path - An optional file path to filter the results.
    *
    * @returns The default widget factory for an path.
    *
    * #### Notes
    * This is equivalent to the first value in [[preferredWidgetFactories]].
    */
  def defaultWidgetFactory(): atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory = js.native
  def defaultWidgetFactory(path: java.lang.String): atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Create an iterator over the file types that have been registered.
    *
    * @returns A new iterator of file types.
    */
  def fileTypes(): atPhosphorAlgorithmLib.libIterMod.IIterator[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IFileType] = js.native
  /**
    * Get a file type by name.
    */
  def getFileType(name: java.lang.String): js.UndefOr[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IFileType] = js.native
  /**
    * Get the best file type given a contents model.
    *
    * @param model - The contents model of interest.
    *
    * @returns The best matching file type.
    */
  def getFileTypeForModel(model: stdLib.Partial[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel]): atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IFileType = js.native
  /**
    * Get the file types that match a file name.
    *
    * @param path - The path of the file.
    *
    * @returns An ordered list of matching file types.
    */
  def getFileTypesForPath(path: java.lang.String): js.Array[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IFileType] = js.native
  /**
    * Get a kernel preference.
    *
    * @param path - The file path.
    *
    * @param widgetName - The name of the widget factory.
    *
    * @param kernel - An optional existing kernel model.
    *
    * @returns A kernel preference.
    */
  def getKernelPreference(path: java.lang.String, widgetName: java.lang.String): js.UndefOr[atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference] = js.native
  def getKernelPreference(
    path: java.lang.String,
    widgetName: java.lang.String,
    kernel: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel]
  ): js.UndefOr[atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference] = js.native
  /**
    * Get a model factory by name.
    *
    * @param name - The name of the model factory.
    *
    * @returns A model factory instance.
    */
  def getModelFactory(name: java.lang.String): js.UndefOr[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.ModelFactory] = js.native
  /**
    * Get a widget factory by name.
    *
    * @param widgetName - The name of the widget factory.
    *
    * @returns A widget factory instance.
    */
  def getWidgetFactory(widgetName: java.lang.String): js.UndefOr[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory] = js.native
  /**
    * Create an iterator over the model factories that have been registered.
    *
    * @returns A new iterator of model factories.
    */
  def modelFactories(): atPhosphorAlgorithmLib.libIterMod.IIterator[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.ModelFactory] = js.native
  /**
    * Get a list of the preferred widget factories.
    *
    * @param path - The file path to filter the results.
    *
    * @returns A new array of widget factories.
    *
    * #### Notes
    * Only the widget factories whose associated model factory have
    * been registered will be returned.
    * The first item is considered the default. The returned array
    * has widget factories in the following order:
    * - path-specific default factory
    * - path-specific default rendered factory
    * - global default factory
    * - all other path-specific factories
    * - all other global factories
    */
  def preferredWidgetFactories(path: java.lang.String): js.Array[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory] = js.native
  /**
    * Create an iterator over the registered extensions for a given widget.
    *
    * @param widgetName - The name of the widget factory.
    *
    * @returns A new iterator over the widget extensions.
    */
  def widgetExtensions(widgetName: java.lang.String): atPhosphorAlgorithmLib.libIterMod.IIterator[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetExtension] = js.native
  /**
    * Create an iterator over the widget factories that have been registered.
    *
    * @returns A new iterator of widget factories.
    */
  def widgetFactories(): atPhosphorAlgorithmLib.libIterMod.IIterator[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory] = js.native
}

