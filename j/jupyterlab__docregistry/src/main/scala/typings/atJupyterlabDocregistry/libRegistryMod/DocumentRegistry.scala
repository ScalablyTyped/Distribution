package typings.atJupyterlabDocregistry.libRegistryMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSessionNs.IKernelPreference
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IChangedArgs
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IFileType
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.ModelFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.WidgetExtension
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.WidgetFactory
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/registry", "DocumentRegistry")
@js.native
/**
  * Construct a new document registry.
  */
class DocumentRegistry () extends IDisposable {
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _defaultRenderedWidgetFactories: js.Any = js.native
  var _defaultWidgetFactories: js.Any = js.native
  var _defaultWidgetFactory: js.Any = js.native
  var _defaultWidgetFactoryOverrides: js.Any = js.native
  var _extenders: js.Any = js.native
  var _fileTypes: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _modelFactories: js.Any = js.native
  var _widgetFactories: js.Any = js.native
  var _widgetFactoriesForFileType: js.Any = js.native
  /**
    * A signal emitted when the registry has changed.
    */
  val changed: ISignal[this.type, IChangedArgs] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
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
  def addFileType(fileType: Partial[IFileType]): IDisposable = js.native
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
  def addModelFactory(factory: ModelFactory): IDisposable = js.native
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
  def addWidgetExtension(widgetName: String, extension: WidgetExtension): IDisposable = js.native
  /**
    * Add a widget factory to the registry.
    *
    * @param factory - The factory instance to register.
    *
    * @returns A disposable which will unregister the factory.
    *
    * #### Notes
    * If a factory with the given `'name'` is already registered,
    * a warning will be logged, and this will be a no-op.
    * If `'*'` is given as a default extension, the factory will be registered
    * as the global default.
    * If an extension or global default is already registered, this factory
    * will override the existing default.
    * The factory cannot be named an empty string or the string `'default'`.
    */
  def addWidgetFactory(factory: WidgetFactory): IDisposable = js.native
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
  def defaultRenderedWidgetFactory(path: String): WidgetFactory = js.native
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
  def defaultWidgetFactory(): WidgetFactory = js.native
  def defaultWidgetFactory(path: String): WidgetFactory = js.native
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
    * Create an iterator over the file types that have been registered.
    *
    * @returns A new iterator of file types.
    */
  def fileTypes(): IIterator[IFileType] = js.native
  /**
    * Get a file type by name.
    */
  def getFileType(name: String): js.UndefOr[IFileType] = js.native
  /**
    * Get the best file type given a contents model.
    *
    * @param model - The contents model of interest.
    *
    * @returns The best matching file type.
    */
  def getFileTypeForModel(model: Partial[IModel]): IFileType = js.native
  /**
    * Get the file types that match a file name.
    *
    * @param path - The path of the file.
    *
    * @returns An ordered list of matching file types.
    */
  def getFileTypesForPath(path: String): js.Array[IFileType] = js.native
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
  def getKernelPreference(path: String, widgetName: String): js.UndefOr[IKernelPreference] = js.native
  def getKernelPreference(
    path: String,
    widgetName: String,
    kernel: Partial[typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IModel]
  ): js.UndefOr[IKernelPreference] = js.native
  /**
    * Get a model factory by name.
    *
    * @param name - The name of the model factory.
    *
    * @returns A model factory instance.
    */
  def getModelFactory(name: String): js.UndefOr[ModelFactory] = js.native
  /**
    * Get a widget factory by name.
    *
    * @param widgetName - The name of the widget factory.
    *
    * @returns A widget factory instance.
    */
  def getWidgetFactory(widgetName: String): js.UndefOr[WidgetFactory] = js.native
  /**
    * Create an iterator over the model factories that have been registered.
    *
    * @returns A new iterator of model factories.
    */
  def modelFactories(): IIterator[ModelFactory] = js.native
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
  def preferredWidgetFactories(path: String): js.Array[WidgetFactory] = js.native
  def setDefaultWidgetFactory(fileType: String): Unit = js.native
  /**
    * Set overrides for the default widget factory for a file type.
    *
    * Normally, a widget factory informs the document registry which file types
    * it should be the default for using the `defaultFor` option in the
    * IWidgetFactoryOptions. This function can be used to override that after
    * the fact.
    *
    * @param fileType: The name of the file type.
    *
    * @param factory: The name of the factory.
    *
    * #### Notes
    * If `factory` is undefined, then any override will be unset, and the
    * default factory will revert to the original value.
    *
    * If `factory` or `fileType` are not known to the docregistry, or
    * if `factory` cannot open files of type `fileType`, this will throw
    * an error.
    */
  def setDefaultWidgetFactory(fileType: String, factory: String): Unit = js.native
  /**
    * Create an iterator over the registered extensions for a given widget.
    *
    * @param widgetName - The name of the widget factory.
    *
    * @returns A new iterator over the widget extensions.
    */
  def widgetExtensions(widgetName: String): IIterator[WidgetExtension] = js.native
  /**
    * Create an iterator over the widget factories that have been registered.
    *
    * @returns A new iterator of widget factories.
    */
  def widgetFactories(): IIterator[WidgetFactory] = js.native
}

