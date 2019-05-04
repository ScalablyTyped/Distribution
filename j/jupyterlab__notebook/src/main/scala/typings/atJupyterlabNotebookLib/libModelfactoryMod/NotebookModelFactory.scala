package typings
package atJupyterlabNotebookLib.libModelfactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/modelfactory", "NotebookModelFactory")
@js.native
class NotebookModelFactory protected ()
  extends atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModelFactory[atJupyterlabNotebookLib.libModelMod.INotebookModel] {
  /**
    * Construct a new notebook model factory.
    */
  def this(options: atJupyterlabNotebookLib.libModelfactoryMod.NotebookModelFactoryNs.IOptions) = this()
  var _disposed: js.Any = js.native
  /**
    * The content model factory used by the NotebookModelFactory.
    */
  val contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
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
}

