package typings.jupyterlabStatedb.interfacesMod.IRestorable

import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCommands.mod.CommandRegistry
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
@js.native
trait IOptions[T /* <: IObservableDisposable */]
  extends typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T] {
  /**
    * The data connector to fetch restore data.
    */
  var connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String] = js.native
  /**
    * The command registry which holds the restore command.
    */
  var registry: CommandRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply[/* <: typings.luminoDisposable.mod.IObservableDisposable */ T](
    command: String,
    connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String],
    name: T => String,
    registry: CommandRegistry
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], name = js.Any.fromFunction1(name), registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], /* <: typings.luminoDisposable.mod.IObservableDisposable */ T] (val x: Self with IOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnector(value: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]): Self = this.set("connector", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistry(value: CommandRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
  }
  
}

