package typings.jake.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("namespace")
@js.native
object namespace extends js.Object {
  /**
    * Creates a namespace which allows logical grouping of tasks, and prevents name-collisions with task-names. Namespaces can be nested inside of other namespaces.
    * @param name The name of the namespace
    * @param scope The enclosing scope for the namespaced tasks
    */
  def apply(name: String, scope: js.Function0[Unit]): Unit = js.native
}

