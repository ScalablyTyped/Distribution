package typings.jupyterlabNotebook.modelfactoryMod

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
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
}

