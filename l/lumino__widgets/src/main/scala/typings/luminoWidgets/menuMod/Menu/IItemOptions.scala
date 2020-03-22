package typings.luminoWidgets.menuMod.Menu

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a menu item.
  */
trait IItemOptions extends js.Object {
  /**
    * The arguments for the command.
    *
    * The default value is an empty object.
    */
  var args: js.UndefOr[ReadonlyJSONObject] = js.undefined
  /**
    * The command to execute when the item is triggered.
    *
    * The default value is an empty string.
    */
  var command: js.UndefOr[String] = js.undefined
  /**
    * The submenu for a `'submenu'` type item.
    *
    * The default value is `null`.
    */
  var submenu: js.UndefOr[typings.luminoWidgets.menuMod.Menu | Null] = js.undefined
  /**
    * The type of the menu item.
    *
    * The default value is `'command'`.
    */
  var `type`: js.UndefOr[ItemType] = js.undefined
}

object IItemOptions {
  @scala.inline
  def apply(
    args: ReadonlyJSONObject = null,
    command: String = null,
    submenu: typings.luminoWidgets.menuMod.Menu = null,
    `type`: ItemType = null
  ): IItemOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
}

