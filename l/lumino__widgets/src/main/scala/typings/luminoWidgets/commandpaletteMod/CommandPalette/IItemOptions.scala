package typings.luminoWidgets.commandpaletteMod.CommandPalette

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a command item.
  */
@js.native
trait IItemOptions extends js.Object {
  /**
    * The arguments for the command.
    *
    * The default value is an empty object.
    */
  var args: js.UndefOr[ReadonlyJSONObject] = js.native
  /**
    * The category for the item.
    */
  var category: String = js.native
  /**
    * The command to execute when the item is triggered.
    */
  var command: String = js.native
  /**
    * The rank for the command item.
    *
    * The rank is used as a tie-breaker when ordering command items
    * for display. Items are sorted in the following order:
    *   1. Text match (lower is better)
    *   2. Category (locale order)
    *   3. Rank (lower is better)
    *   4. Label (locale order)
    *
    * The default rank is `Infinity`.
    */
  var rank: js.UndefOr[Double] = js.native
}

object IItemOptions {
  @scala.inline
  def apply(category: String, command: String): IItemOptions = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
  @scala.inline
  implicit class IItemOptionsOps[Self <: IItemOptions] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: ReadonlyJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
  
}

