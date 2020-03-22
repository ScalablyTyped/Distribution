package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `commandExecuted` signal.
  */
trait ICommandExecutedArgs extends js.Object {
  /**
    * The arguments object passed to the command.
    */
  val args: ReadonlyPartialJSONObject
  /**
    * The id of the associated command.
    */
  val id: String
  /**
    * The promise which resolves with the result of the command.
    */
  val result: js.Promise[_]
}

object ICommandExecutedArgs {
  @scala.inline
  def apply(args: ReadonlyPartialJSONObject, id: String, result: js.Promise[_]): ICommandExecutedArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICommandExecutedArgs]
  }
}

