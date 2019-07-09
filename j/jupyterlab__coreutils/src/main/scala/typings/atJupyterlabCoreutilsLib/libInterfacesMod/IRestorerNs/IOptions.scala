package typings
package atJupyterlabCoreutilsLib.libInterfacesMod.IRestorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
trait IOptions[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */] extends js.Object {
  /**
    * A function that returns the args needed to restore an instance.
    */
  var args: js.UndefOr[js.Function1[/* obj */ T, atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject]] = js.undefined
  /**
    * The command to execute when restoring instances.
    */
  var command: java.lang.String
  /**
    * The point after which it is safe to restore state.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.undefined
  /**
    * A function that returns a unique persistent name for this instance.
    */
  def name(obj: T): java.lang.String
}

object IOptions {
  @scala.inline
  def apply[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */](
    command: java.lang.String,
    name: T => java.lang.String,
    args: /* obj */ T => atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command, name = js.Any.fromFunction1(name))
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1(args))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

