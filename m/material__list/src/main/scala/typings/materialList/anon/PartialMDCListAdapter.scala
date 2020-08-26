package typings.materialList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/list.@material/list/adapter.MDCListAdapter> */
@js.native
trait PartialMDCListAdapter extends js.Object {
  var addClassForElementIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
  var focusItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var getAttributeForElementIndex: js.UndefOr[js.Function2[/* index */ Double, /* attr */ String, String | Null]] = js.native
  var getFocusedElementIndex: js.UndefOr[js.Function0[Double]] = js.native
  var getListItemCount: js.UndefOr[js.Function0[Double]] = js.native
  var getPrimaryTextAtIndex: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  var hasCheckboxAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.native
  var hasRadioAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.native
  var isCheckboxCheckedAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.native
  var isFocusInsideList: js.UndefOr[js.Function0[Boolean]] = js.native
  var isRootFocused: js.UndefOr[js.Function0[Boolean]] = js.native
  var listItemAtIndexHasClass: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Boolean]] = js.native
  var notifyAction: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var removeClassForElementIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
  var setAttributeForElementIndex: js.UndefOr[
    js.Function3[/* index */ Double, /* attribute */ String, /* value */ String, Unit]
  ] = js.native
  var setCheckedCheckboxOrRadioAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* isChecked */ Boolean, Unit]] = js.native
  var setTabIndexForListItemChildren: js.UndefOr[js.Function2[/* listItemIndex */ Double, /* tabIndexValue */ String, Unit]] = js.native
}

object PartialMDCListAdapter {
  @scala.inline
  def apply(): PartialMDCListAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCListAdapter]
  }
  @scala.inline
  implicit class PartialMDCListAdapterOps[Self <: PartialMDCListAdapter] (val x: Self) extends AnyVal {
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
    def setAddClassForElementIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = this.set("addClassForElementIndex", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddClassForElementIndex: Self = this.set("addClassForElementIndex", js.undefined)
    @scala.inline
    def setFocusItemAtIndex(value: /* index */ Double => Unit): Self = this.set("focusItemAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusItemAtIndex: Self = this.set("focusItemAtIndex", js.undefined)
    @scala.inline
    def setGetAttributeForElementIndex(value: (/* index */ Double, /* attr */ String) => String | Null): Self = this.set("getAttributeForElementIndex", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetAttributeForElementIndex: Self = this.set("getAttributeForElementIndex", js.undefined)
    @scala.inline
    def setGetFocusedElementIndex(value: () => Double): Self = this.set("getFocusedElementIndex", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFocusedElementIndex: Self = this.set("getFocusedElementIndex", js.undefined)
    @scala.inline
    def setGetListItemCount(value: () => Double): Self = this.set("getListItemCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetListItemCount: Self = this.set("getListItemCount", js.undefined)
    @scala.inline
    def setGetPrimaryTextAtIndex(value: /* index */ Double => String): Self = this.set("getPrimaryTextAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPrimaryTextAtIndex: Self = this.set("getPrimaryTextAtIndex", js.undefined)
    @scala.inline
    def setHasCheckboxAtIndex(value: /* index */ Double => Boolean): Self = this.set("hasCheckboxAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasCheckboxAtIndex: Self = this.set("hasCheckboxAtIndex", js.undefined)
    @scala.inline
    def setHasRadioAtIndex(value: /* index */ Double => Boolean): Self = this.set("hasRadioAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasRadioAtIndex: Self = this.set("hasRadioAtIndex", js.undefined)
    @scala.inline
    def setIsCheckboxCheckedAtIndex(value: /* index */ Double => Boolean): Self = this.set("isCheckboxCheckedAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsCheckboxCheckedAtIndex: Self = this.set("isCheckboxCheckedAtIndex", js.undefined)
    @scala.inline
    def setIsFocusInsideList(value: () => Boolean): Self = this.set("isFocusInsideList", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsFocusInsideList: Self = this.set("isFocusInsideList", js.undefined)
    @scala.inline
    def setIsRootFocused(value: () => Boolean): Self = this.set("isRootFocused", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsRootFocused: Self = this.set("isRootFocused", js.undefined)
    @scala.inline
    def setListItemAtIndexHasClass(value: (/* index */ Double, /* className */ String) => Boolean): Self = this.set("listItemAtIndexHasClass", js.Any.fromFunction2(value))
    @scala.inline
    def deleteListItemAtIndexHasClass: Self = this.set("listItemAtIndexHasClass", js.undefined)
    @scala.inline
    def setNotifyAction(value: /* index */ Double => Unit): Self = this.set("notifyAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNotifyAction: Self = this.set("notifyAction", js.undefined)
    @scala.inline
    def setRemoveClassForElementIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = this.set("removeClassForElementIndex", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveClassForElementIndex: Self = this.set("removeClassForElementIndex", js.undefined)
    @scala.inline
    def setSetAttributeForElementIndex(value: (/* index */ Double, /* attribute */ String, /* value */ String) => Unit): Self = this.set("setAttributeForElementIndex", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetAttributeForElementIndex: Self = this.set("setAttributeForElementIndex", js.undefined)
    @scala.inline
    def setSetCheckedCheckboxOrRadioAtIndex(value: (/* index */ Double, /* isChecked */ Boolean) => Unit): Self = this.set("setCheckedCheckboxOrRadioAtIndex", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetCheckedCheckboxOrRadioAtIndex: Self = this.set("setCheckedCheckboxOrRadioAtIndex", js.undefined)
    @scala.inline
    def setSetTabIndexForListItemChildren(value: (/* listItemIndex */ Double, /* tabIndexValue */ String) => Unit): Self = this.set("setTabIndexForListItemChildren", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetTabIndexForListItemChildren: Self = this.set("setTabIndexForListItemChildren", js.undefined)
  }
  
}

