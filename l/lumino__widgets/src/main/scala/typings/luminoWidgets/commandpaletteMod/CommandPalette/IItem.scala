package typings.luminoWidgets.commandpaletteMod.CommandPalette

import typings.luminoCommands.mod.CommandRegistry.Dataset
import typings.luminoCommands.mod.CommandRegistry.IKeyBinding
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents an item in a command palette.
  *
  * #### Notes
  * Item objects are created automatically by a command palette.
  */
@js.native
trait IItem extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject = js.native
  /**
    * The display caption for the command item.
    */
  val caption: String = js.native
  /**
    * The category for the command item.
    */
  val category: String = js.native
  /**
    * The extra class name for the command item.
    */
  val className: String = js.native
  /**
    * The command to execute when the item is triggered.
    */
  val command: String = js.native
  /**
    * The dataset for the command item.
    */
  val dataset: Dataset = js.native
  /**
    * The icon renderer for the command item.
    */
  val icon: js.UndefOr[typings.luminoVirtualdom.mod.VirtualElement.IRenderer | String] = js.native
  /**
    * The icon class for the command item.
    */
  val iconClass: String = js.native
  /**
    * The icon label for the command item.
    */
  val iconLabel: String = js.native
  /**
    * Whether the command item is enabled.
    */
  val isEnabled: Boolean = js.native
  /**
    * Whether the command item is toggled.
    */
  val isToggled: Boolean = js.native
  /**
    * Whether the command item is visible.
    */
  val isVisible: Boolean = js.native
  /**
    * The key binding for the command item.
    */
  val keyBinding: IKeyBinding | Null = js.native
  /**
    * The display label for the command item.
    */
  val label: String = js.native
  /**
    * The rank for the command item.
    */
  val rank: Double = js.native
}

object IItem {
  @scala.inline
  def apply(
    args: ReadonlyJSONObject,
    caption: String,
    category: String,
    className: String,
    command: String,
    dataset: Dataset,
    iconClass: String,
    iconLabel: String,
    isEnabled: Boolean,
    isToggled: Boolean,
    isVisible: Boolean,
    label: String,
    rank: Double
  ): IItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
  @scala.inline
  implicit class IItemOps[Self <: IItem] (val x: Self) extends AnyVal {
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
    def setArgs(value: ReadonlyJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataset(value: Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconLabel(value: String): Self = this.set("iconLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsToggled(value: Boolean): Self = this.set("isToggled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: typings.luminoVirtualdom.mod.VirtualElement.IRenderer | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKeyBinding(value: IKeyBinding): Self = this.set("keyBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyBindingNull: Self = this.set("keyBinding", null)
  }
  
}

