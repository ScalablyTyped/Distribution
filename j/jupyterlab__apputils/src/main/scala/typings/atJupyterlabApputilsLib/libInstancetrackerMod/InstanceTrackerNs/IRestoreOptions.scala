package typings
package atJupyterlabApputilsLib.libInstancetrackerMod.InstanceTrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  */
trait IRestoreOptions[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] extends js.Object {
  /**
    * The command to execute when restoring instances.
    */
  var command: java.lang.String
  /**
    * The command registry which holds the restore command.
    */
  var registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
  /**
    * The state database instance.
    */
  var state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB
  /**
    * The point after which it is safe to restore state.
    *
    * #### Notes
    * By definition, this promise or promises will happen after the application
    * has `started`.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.undefined
  /**
    * A function that returns the args needed to restore an instance.
    */
  def args(widget: T): atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
  /**
    * A function that returns a unique persistent name for this instance.
    */
  def name(widget: T): java.lang.String
}

object IRestoreOptions {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    args: T => atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    command: java.lang.String,
    name: T => java.lang.String,
    registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry,
    state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IRestoreOptions[T] = {
    val __obj = js.Dynamic.literal(args = js.Any.fromFunction1(args), command = command, name = js.Any.fromFunction1(name), registry = registry, state = state)
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestoreOptions[T]]
  }
}

