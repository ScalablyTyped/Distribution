package typings.luminoWidgets.menuMod.Menu

import typings.luminoCommands.mod.CommandRegistry.Dataset
import typings.luminoCommands.mod.CommandRegistry.IKeyBinding
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a menu item.
  *
  * #### Notes
  * Item objects are created automatically by a menu.
  */
trait IItem extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject
  /**
    * The display caption for the menu item.
    */
  val caption: String
  /**
    * The extra class name for the menu item.
    */
  val className: String
  /**
    * The command to execute when the item is triggered.
    */
  val command: String
  /**
    * The dataset for the menu item.
    */
  val dataset: Dataset
  /**
    * The icon renderer for the menu item.
    */
  val icon: js.UndefOr[typings.luminoVirtualdom.mod.VirtualElement.IRenderer | String] = js.undefined
  /**
    * The icon class for the menu item.
    */
  val iconClass: String
  /**
    * The icon label for the menu item.
    */
  val iconLabel: String
  /**
    * Whether the menu item is enabled.
    */
  val isEnabled: Boolean
  /**
    * Whether the menu item is toggled.
    */
  val isToggled: Boolean
  /**
    * Whether the menu item is visible.
    */
  val isVisible: Boolean
  /**
    * The key binding for the menu item.
    */
  val keyBinding: IKeyBinding | Null
  /**
    * The display label for the menu item.
    */
  val label: String
  /**
    * The mnemonic index for the menu item.
    */
  val mnemonic: Double
  /**
    * The submenu for a `'submenu'` type item.
    */
  val submenu: typings.luminoWidgets.menuMod.Menu | Null
  /**
    * The type of the menu item.
    */
  val `type`: ItemType
}

object IItem {
  @scala.inline
  def apply(
    args: ReadonlyJSONObject,
    caption: String,
    className: String,
    command: String,
    dataset: Dataset,
    iconClass: String,
    iconLabel: String,
    isEnabled: Boolean,
    isToggled: Boolean,
    isVisible: Boolean,
    label: String,
    mnemonic: Double,
    `type`: ItemType,
    icon: typings.luminoVirtualdom.mod.VirtualElement.IRenderer | String = null,
    keyBinding: IKeyBinding = null,
    submenu: typings.luminoWidgets.menuMod.Menu = null
  ): IItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (keyBinding != null) __obj.updateDynamic("keyBinding")(keyBinding.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
}

