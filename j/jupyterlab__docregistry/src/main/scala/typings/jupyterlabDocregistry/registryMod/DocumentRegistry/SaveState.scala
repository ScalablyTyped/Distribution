package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.started
  - typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed
  - typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed
*/
trait SaveState extends js.Object

object SaveState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed = this.cast("failed")
  @scala.inline
  def started: typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.started = this.cast("started")
}

