package typings.jupyterlabCoreutils.interfacesMod.IRestorable

import typings.jupyterlabCoreutils.interfacesMod.IDataConnector
import typings.phosphorCommands.mod.CommandRegistry
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import typings.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
trait IOptions[T /* <: IObservableDisposable */]
  extends typings.jupyterlabCoreutils.interfacesMod.IRestorer.IOptions[T] {
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
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], name = js.Any.fromFunction1(name), registry = registry.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1(args))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

