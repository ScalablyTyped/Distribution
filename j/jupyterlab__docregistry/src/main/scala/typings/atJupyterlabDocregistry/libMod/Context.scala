package typings.atJupyterlabDocregistry.libMod

import typings.atJupyterlabDocregistry.libContextMod.ContextNs.IOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib", "Context")
@js.native
class Context[T /* <: IModel */] protected ()
  extends typings.atJupyterlabDocregistry.libContextMod.Context[T] {
  /**
    * Construct a new document context.
    */
  def this(options: IOptions[T]) = this()
}

