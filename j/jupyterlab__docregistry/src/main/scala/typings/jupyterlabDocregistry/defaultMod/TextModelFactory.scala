package typings.jupyterlabDocregistry.defaultMod

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/default", "TextModelFactory")
@js.native
class TextModelFactory () extends IModelFactory[ICodeModel] {
  var _isDisposed: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The type of the file.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("contentType")
  def contentType_MTextModelFactory(): ContentType = js.native
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
    * The format of the file.
    *
    * This is a read-only property.
    */
  @JSName("fileFormat")
  def fileFormat_MTextModelFactory(): FileFormat = js.native
  /**
    * Get whether the model factory has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MTextModelFactory(): Boolean = js.native
  /**
    * The name of the model type.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("name")
  def name_MTextModelFactory(): String = js.native
}

