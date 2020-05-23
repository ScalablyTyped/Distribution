package typings.jupyterlabStatedb.interfacesMod.IRestorable

import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
trait IOptions[T /* <: IObservableDisposable */]
  extends typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T] {
  /**
    * The data connector to fetch restore data.
    */
  var connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]
  /**
    * The command registry which holds the restore command.
    */
  var registry: CommandRegistry
}

object IOptions {
  @scala.inline
  def apply[T](
    command: String,
    connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String],
    name: T => String,
    registry: CommandRegistry,
    args: T => ReadonlyPartialJSONObject = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], name = js.Any.fromFunction1(name), registry = registry.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1(args))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

