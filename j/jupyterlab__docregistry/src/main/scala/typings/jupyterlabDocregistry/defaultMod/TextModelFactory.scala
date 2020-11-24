package typings.jupyterlabDocregistry.defaultMod

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docregistry/lib/default", "TextModelFactory")
@js.native
class TextModelFactory () extends IModelFactory[ICodeModel] {
  
  var _isDisposed: js.Any = js.native
  
  /**
    * The type of the file.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("contentType")
  def contentType_MTextModelFactory: ContentType = js.native
  
  /**
    * The format of the file.
    *
    * This is a read-only property.
    */
  @JSName("fileFormat")
  def fileFormat_MTextModelFactory: FileFormat = js.native
  
  /**
    * Get whether the model factory has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MTextModelFactory: Boolean = js.native
  
  /**
    * The name of the model type.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("name")
  def name_MTextModelFactory: String = js.native
}
