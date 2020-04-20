package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a key binding.
  *
  * #### Notes
  * A key binding is an immutable object created by a registry.
  */
trait IKeyBinding extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyPartialJSONObject
  /**
    * The command executed when the binding is matched.
    */
  val command: String
  /**
    * The key sequence for the binding.
    */
  val keys: js.Array[String]
  /**
    * The CSS selector for the binding.
    */
  val selector: String
}

object IKeyBinding {
  @scala.inline
  def apply(args: ReadonlyPartialJSONObject, command: String, keys: js.Array[String], selector: String): IKeyBinding = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBinding]
  }
}

