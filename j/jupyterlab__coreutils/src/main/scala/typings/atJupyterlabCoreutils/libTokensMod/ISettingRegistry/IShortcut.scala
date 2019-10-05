package typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface describing a JupyterLab keyboard shortcut.
  */
trait IShortcut extends JSONObject {
  /**
    * The optional arguments passed into the shortcut's command.
    */
  var args: js.UndefOr[JSONObject] = js.undefined
  /**
    * The command invoked by the shortcut.
    */
  var command: String
  /**
    * Whether a keyboard shortcut is disabled. `False` by default.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The key combination of the shortcut.
    */
  var keys: js.Array[String]
  /**
    * The CSS selector applicable to the shortcut.
    */
  var selector: String
}

object IShortcut {
  @scala.inline
  def apply(
    command: String,
    keys: js.Array[String],
    selector: String,
    args: JSONObject = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): IShortcut = {
    val __obj = js.Dynamic.literal(command = command, keys = keys, selector = selector)
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[IShortcut]
  }
}

