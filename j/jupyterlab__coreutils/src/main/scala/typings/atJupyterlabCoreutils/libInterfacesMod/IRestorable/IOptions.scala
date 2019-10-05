package typings.atJupyterlabCoreutils.libInterfacesMod.IRestorable

import typings.atJupyterlabCoreutils.libInterfacesMod.IDataConnector
import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
trait IOptions[T /* <: IObservableDisposable */]
  extends typings.atJupyterlabCoreutils.libInterfacesMod.IRestorer.IOptions[T] {
  /**
    * The data connector to fetch restore data.
    */
  var connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String]
  /**
    * The command registry which holds the restore command.
    */
  var registry: CommandRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: IObservableDisposable */](
    command: String,
    connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String],
    name: T => String,
    registry: CommandRegistry,
    args: T => ReadonlyJSONObject = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command, connector = connector, name = js.Any.fromFunction1(name), registry = registry)
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1(args))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

