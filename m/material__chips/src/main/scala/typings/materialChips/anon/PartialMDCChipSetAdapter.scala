package typings.materialChips.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/chips.@material/chips/chip-set/adapter.MDCChipSetAdapter> */
@js.native
trait PartialMDCChipSetAdapter extends js.Object {
  
  var announceMessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  var focusChipPrimaryActionAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var focusChipTrailingActionAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var getChipListCount: js.UndefOr[js.Function0[Double]] = js.native
  
  var getIndexOfChipById: js.UndefOr[js.Function1[/* chipId */ String, Double]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var removeChipAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var removeFocusFromChipAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var selectChipAtIndex: js.UndefOr[
    js.Function3[/* index */ Double, /* isSelected */ Boolean, /* shouldNotifyClients */ Boolean, Unit]
  ] = js.native
}
object PartialMDCChipSetAdapter {
  
  @scala.inline
  def apply(): PartialMDCChipSetAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCChipSetAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCChipSetAdapterOps[Self <: PartialMDCChipSetAdapter] (val x: Self) extends AnyVal {
    
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
    def setAnnounceMessage(value: /* message */ String => Unit): Self = this.set("announceMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAnnounceMessage: Self = this.set("announceMessage", js.undefined)
    
    @scala.inline
    def setFocusChipPrimaryActionAtIndex(value: /* index */ Double => Unit): Self = this.set("focusChipPrimaryActionAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusChipPrimaryActionAtIndex: Self = this.set("focusChipPrimaryActionAtIndex", js.undefined)
    
    @scala.inline
    def setFocusChipTrailingActionAtIndex(value: /* index */ Double => Unit): Self = this.set("focusChipTrailingActionAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusChipTrailingActionAtIndex: Self = this.set("focusChipTrailingActionAtIndex", js.undefined)
    
    @scala.inline
    def setGetChipListCount(value: () => Double): Self = this.set("getChipListCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetChipListCount: Self = this.set("getChipListCount", js.undefined)
    
    @scala.inline
    def setGetIndexOfChipById(value: /* chipId */ String => Double): Self = this.set("getIndexOfChipById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetIndexOfChipById: Self = this.set("getIndexOfChipById", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setRemoveChipAtIndex(value: /* index */ Double => Unit): Self = this.set("removeChipAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveChipAtIndex: Self = this.set("removeChipAtIndex", js.undefined)
    
    @scala.inline
    def setRemoveFocusFromChipAtIndex(value: /* index */ Double => Unit): Self = this.set("removeFocusFromChipAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveFocusFromChipAtIndex: Self = this.set("removeFocusFromChipAtIndex", js.undefined)
    
    @scala.inline
    def setSelectChipAtIndex(value: (/* index */ Double, /* isSelected */ Boolean, /* shouldNotifyClients */ Boolean) => Unit): Self = this.set("selectChipAtIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelectChipAtIndex: Self = this.set("selectChipAtIndex", js.undefined)
  }
}
