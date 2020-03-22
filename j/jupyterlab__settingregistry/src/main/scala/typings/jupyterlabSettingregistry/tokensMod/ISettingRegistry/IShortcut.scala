package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface describing a JupyterLab keyboard shortcut.
  */
trait IShortcut extends PartialJSONObject {
  /**
    * The optional arguments passed into the shortcut's command.
    */
  var args: js.UndefOr[PartialJSONObject] = js.undefined
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
    args: PartialJSONObject = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): IShortcut = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcut]
  }
}

