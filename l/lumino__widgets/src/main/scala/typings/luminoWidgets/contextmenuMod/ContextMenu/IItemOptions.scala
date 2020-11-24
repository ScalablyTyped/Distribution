package typings.luminoWidgets.contextmenuMod.ContextMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for creating a context menu item.
  */
@js.native
trait IItemOptions
  extends typings.luminoWidgets.menuMod.Menu.IItemOptions {
  
  /**
    * The rank for the item.
    *
    * The rank is used as a tie-breaker when ordering context menu
    * items for display. Items are sorted in the following order:
    *   1. Depth in the DOM tree (deeper is better)
    *   2. Selector specificity (higher is better)
    *   3. Rank (lower is better)
    *   4. Insertion order
    *
    * The default rank is `Infinity`.
    */
  var rank: js.UndefOr[Double] = js.native
  
  /**
    * The CSS selector for the context menu item.
    *
    * The context menu item will only be displayed in the context menu
    * when the selector matches a node on the propagation path of the
    * contextmenu event. This allows the menu item to be restricted to
    * user-defined contexts.
    *
    * The selector must not contain commas.
    */
  var selector: String = js.native
}
object IItemOptions {
  
  @scala.inline
  def apply(selector: String): IItemOptions = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
}
