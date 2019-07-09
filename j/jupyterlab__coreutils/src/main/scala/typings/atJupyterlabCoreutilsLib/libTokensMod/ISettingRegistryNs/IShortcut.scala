package typings
package atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface describing a JupyterLab keyboard shortcut.
  */
trait IShortcut
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * The optional arguments passed into the shortcut's command.
    */
  var args: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONObject] = js.undefined
  /**
    * The command invoked by the shortcut.
    */
  var command: java.lang.String
  /**
    * Whether a keyboard shortcut is disabled. `False` by default.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The key combination of the shortcut.
    */
  var keys: js.Array[java.lang.String]
  /**
    * The CSS selector applicable to the shortcut.
    */
  var selector: java.lang.String
}

object IShortcut {
  @scala.inline
  def apply(
    command: java.lang.String,
    keys: js.Array[java.lang.String],
    selector: java.lang.String,
    args: atPhosphorCoreutilsLib.libJsonMod.JSONObject = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): IShortcut = {
    val __obj = js.Dynamic.literal(command = command, keys = keys, selector = selector)
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[IShortcut]
  }
}

