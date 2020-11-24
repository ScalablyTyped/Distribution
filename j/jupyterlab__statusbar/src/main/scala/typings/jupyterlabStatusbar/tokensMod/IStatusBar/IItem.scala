package typings.jupyterlabStatusbar.tokensMod.IStatusBar

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for status bar items.
  */
@js.native
trait IItem extends js.Object {
  
  /**
    * A signal that is fired when the item active state changes.
    */
  var activeStateChanged: js.UndefOr[ISignal[_, Unit]] = js.native
  
  /**
    * Which side to place item.
    * Permanent items are intended for the right and left side,
    * with more transient items in the middle.
    */
  var align: js.UndefOr[Alignment] = js.native
  
  /**
    * Whether the item is shown or hidden.
    */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * The item to add to the status bar.
    */
  var item: Widget = js.native
  
  /**
    *  Ordering of Items -- higher rank items are closer to the middle.
    */
  var rank: js.UndefOr[Double] = js.native
}
object IItem {
  
  @scala.inline
  def apply(item: Widget): IItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
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
    def setItem(value: Widget): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveStateChanged(value: ISignal[_, Unit]): Self = this.set("activeStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveStateChanged: Self = this.set("activeStateChanged", js.undefined)
    
    @scala.inline
    def setAlign(value: Alignment): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
}
