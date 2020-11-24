package typings.jupyterlabNotebook.modelfactoryMod

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory.IOptions
import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook/lib/modelfactory", "NotebookModelFactory")
@js.native
class NotebookModelFactory_ protected () extends IModelFactory[INotebookModel] {
  /**
    * Construct a new notebook model factory.
    */
  def this(options: IOptions) = this()
  
  var _disposed: js.Any = js.native
  
  /**
    * The content model factory used by the NotebookModelFactory.
    */
  val contentFactory: IContentFactory = js.native
  
  /**
    * The content type of the file.
    */
  @JSName("contentType")
  def contentType_MNotebookModelFactory_ : ContentType = js.native
  
  /**
    * The format of the file.
    */
  @JSName("fileFormat")
  def fileFormat_MNotebookModelFactory_ : FileFormat = js.native
  
  /**
    * Get whether the model factory has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MNotebookModelFactory_ : Boolean = js.native
  
  /**
    * The name of the model.
    */
  @JSName("name")
  def name_MNotebookModelFactory_ : String = js.native
}
