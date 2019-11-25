package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.started
  - typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.completed
  - typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.failed
*/
trait SaveState extends js.Object

object SaveState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.failed = this.cast("failed")
  @scala.inline
  def started: typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.started = this.cast("started")
}

