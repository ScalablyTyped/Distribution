package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `commandExecuted` signal.
  */
@js.native
trait ICommandExecutedArgs extends js.Object {
  /**
    * The arguments object passed to the command.
    */
  val args: ReadonlyPartialJSONObject = js.native
  /**
    * The id of the associated command.
    */
  val id: String = js.native
  /**
    * The promise which resolves with the result of the command.
    */
  val result: js.Promise[_] = js.native
}

object ICommandExecutedArgs {
  @scala.inline
  def apply(args: ReadonlyPartialJSONObject, id: String, result: js.Promise[_]): ICommandExecutedArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandExecutedArgs]
  }
  @scala.inline
  implicit class ICommandExecutedArgsOps[Self <: ICommandExecutedArgs] (val x: Self) extends AnyVal {
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
    def setArgs(value: ReadonlyPartialJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Promise[_]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

