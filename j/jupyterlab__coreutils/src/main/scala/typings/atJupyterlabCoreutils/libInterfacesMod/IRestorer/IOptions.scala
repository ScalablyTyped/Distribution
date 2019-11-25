package typings.atJupyterlabCoreutils.libInterfacesMod.IRestorer

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
trait IOptions[T /* <: IObservableDisposable */] extends js.Object {
  /**
    * A function that returns the args needed to restore an instance.
    */
  var args: js.UndefOr[js.Function1[/* obj */ T, ReadonlyJSONObject]] = js.undefined
  /**
    * The command to execute when restoring instances.
    */
  var command: String
  /**
    * The point after which it is safe to restore state.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.undefined
  /**
    * A function that returns a unique persistent name for this instance.
    */
  def name(obj: T): String
}

object IOptions {
  @scala.inline
  def apply[T /* <: IObservableDisposable */](
    command: String,
    name: T => String,
    args: /* obj */ T => ReadonlyJSONObject = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = js.Any.fromFunction1(name))
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1(args))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

