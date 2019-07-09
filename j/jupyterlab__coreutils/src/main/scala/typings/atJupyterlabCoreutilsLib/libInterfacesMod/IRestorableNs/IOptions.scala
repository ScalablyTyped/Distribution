package typings
package atJupyterlabCoreutilsLib.libInterfacesMod.IRestorableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
trait IOptions[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */]
  extends atJupyterlabCoreutilsLib.libInterfacesMod.IRestorerNs.IOptions[T] {
  /**
    * The data connector to fetch restore data.
    */
  var connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
    atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue, 
    atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue, 
    java.lang.String
  ]
  /**
    * The command registry which holds the restore command.
    */
  var registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */](
    command: java.lang.String,
    connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
      atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue, 
      atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue, 
      java.lang.String
    ],
    name: T => java.lang.String,
    registry: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry,
    args: T => atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command, connector = connector, name = js.Any.fromFunction1(name), registry = registry)
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1(args))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

