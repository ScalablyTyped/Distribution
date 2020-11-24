package typings.materialSelect.anon

import typings.materialMenuSurface.constantsMod.Corner
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/select.@material/select/adapter.MDCSelectAdapter> */
@js.native
trait PartialMDCSelectAdapter extends js.Object {
  
  var activateBottomLine: js.UndefOr[js.Function0[Unit]] = js.native
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addMenuClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var closeMenu: js.UndefOr[js.Function0[Unit]] = js.native
  
  var closeOutline: js.UndefOr[js.Function0[Unit]] = js.native
  
  var deactivateBottomLine: js.UndefOr[js.Function0[Unit]] = js.native
  
  var floatLabel: js.UndefOr[js.Function1[/* shouldFloat */ Boolean, Unit]] = js.native
  
  var focusMenuItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var getAnchorElement: js.UndefOr[js.Function0[Element | Null]] = js.native
  
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getMenuItemCount: js.UndefOr[js.Function0[Double]] = js.native
  
  var getMenuItemTextAtIndex: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  
  var getMenuItemValues: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  
  var getSelectAnchorAttr: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
  
  var getSelectedIndex: js.UndefOr[js.Function0[Double]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var hasLabel: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var hasOutline: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isSelectAnchorFocused: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isTypeaheadInProgress: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notchOutline: js.UndefOr[js.Function1[/* labelWidth */ Double, Unit]] = js.native
  
  var notifyChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  
  var openMenu: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeMenuClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeSelectAnchorAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.native
  
  var setLabelRequired: js.UndefOr[js.Function1[/* isRequired */ Boolean, Unit]] = js.native
  
  var setMenuAnchorCorner: js.UndefOr[js.Function1[/* anchorCorner */ Corner, Unit]] = js.native
  
  var setMenuAnchorElement: js.UndefOr[js.Function1[/* anchorEl */ Element, Unit]] = js.native
  
  var setMenuWrapFocus: js.UndefOr[js.Function1[/* wrapFocus */ Boolean, Unit]] = js.native
  
  var setRippleCenter: js.UndefOr[js.Function1[/* normalizedX */ Double, Unit]] = js.native
  
  var setSelectAnchorAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
  
  var setSelectedIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var setSelectedText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  
  var typeaheadMatchItem: js.UndefOr[js.Function2[/* nextChar */ String, /* startingIndex */ Double, Double]] = js.native
}
object PartialMDCSelectAdapter {
  
  @scala.inline
  def apply(): PartialMDCSelectAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCSelectAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCSelectAdapterOps[Self <: PartialMDCSelectAdapter] (val x: Self) extends AnyVal {
    
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
    def setActivateBottomLine(value: () => Unit): Self = this.set("activateBottomLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteActivateBottomLine: Self = this.set("activateBottomLine", js.undefined)
    
    @scala.inline
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setAddMenuClass(value: /* className */ String => Unit): Self = this.set("addMenuClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddMenuClass: Self = this.set("addMenuClass", js.undefined)
    
    @scala.inline
    def setCloseMenu(value: () => Unit): Self = this.set("closeMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCloseMenu: Self = this.set("closeMenu", js.undefined)
    
    @scala.inline
    def setCloseOutline(value: () => Unit): Self = this.set("closeOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCloseOutline: Self = this.set("closeOutline", js.undefined)
    
    @scala.inline
    def setDeactivateBottomLine(value: () => Unit): Self = this.set("deactivateBottomLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDeactivateBottomLine: Self = this.set("deactivateBottomLine", js.undefined)
    
    @scala.inline
    def setFloatLabel(value: /* shouldFloat */ Boolean => Unit): Self = this.set("floatLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFloatLabel: Self = this.set("floatLabel", js.undefined)
    
    @scala.inline
    def setFocusMenuItemAtIndex(value: /* index */ Double => Unit): Self = this.set("focusMenuItemAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusMenuItemAtIndex: Self = this.set("focusMenuItemAtIndex", js.undefined)
    
    @scala.inline
    def setGetAnchorElement(value: () => Element | Null): Self = this.set("getAnchorElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAnchorElement: Self = this.set("getAnchorElement", js.undefined)
    
    @scala.inline
    def setGetLabelWidth(value: () => Double): Self = this.set("getLabelWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLabelWidth: Self = this.set("getLabelWidth", js.undefined)
    
    @scala.inline
    def setGetMenuItemCount(value: () => Double): Self = this.set("getMenuItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMenuItemCount: Self = this.set("getMenuItemCount", js.undefined)
    
    @scala.inline
    def setGetMenuItemTextAtIndex(value: /* index */ Double => String): Self = this.set("getMenuItemTextAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetMenuItemTextAtIndex: Self = this.set("getMenuItemTextAtIndex", js.undefined)
    
    @scala.inline
    def setGetMenuItemValues(value: () => js.Array[String]): Self = this.set("getMenuItemValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMenuItemValues: Self = this.set("getMenuItemValues", js.undefined)
    
    @scala.inline
    def setGetSelectAnchorAttr(value: /* attr */ String => String | Null): Self = this.set("getSelectAnchorAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSelectAnchorAttr: Self = this.set("getSelectAnchorAttr", js.undefined)
    
    @scala.inline
    def setGetSelectedIndex(value: () => Double): Self = this.set("getSelectedIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectedIndex: Self = this.set("getSelectedIndex", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setHasLabel(value: () => Boolean): Self = this.set("hasLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasLabel: Self = this.set("hasLabel", js.undefined)
    
    @scala.inline
    def setHasOutline(value: () => Boolean): Self = this.set("hasOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasOutline: Self = this.set("hasOutline", js.undefined)
    
    @scala.inline
    def setIsSelectAnchorFocused(value: () => Boolean): Self = this.set("isSelectAnchorFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsSelectAnchorFocused: Self = this.set("isSelectAnchorFocused", js.undefined)
    
    @scala.inline
    def setIsTypeaheadInProgress(value: () => Boolean): Self = this.set("isTypeaheadInProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsTypeaheadInProgress: Self = this.set("isTypeaheadInProgress", js.undefined)
    
    @scala.inline
    def setNotchOutline(value: /* labelWidth */ Double => Unit): Self = this.set("notchOutline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotchOutline: Self = this.set("notchOutline", js.undefined)
    
    @scala.inline
    def setNotifyChange(value: /* value */ String => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyChange: Self = this.set("notifyChange", js.undefined)
    
    @scala.inline
    def setOpenMenu(value: () => Unit): Self = this.set("openMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOpenMenu: Self = this.set("openMenu", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRemoveMenuClass(value: /* className */ String => Unit): Self = this.set("removeMenuClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveMenuClass: Self = this.set("removeMenuClass", js.undefined)
    
    @scala.inline
    def setRemoveSelectAnchorAttr(value: /* attr */ String => Unit): Self = this.set("removeSelectAnchorAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveSelectAnchorAttr: Self = this.set("removeSelectAnchorAttr", js.undefined)
    
    @scala.inline
    def setSetLabelRequired(value: /* isRequired */ Boolean => Unit): Self = this.set("setLabelRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLabelRequired: Self = this.set("setLabelRequired", js.undefined)
    
    @scala.inline
    def setSetMenuAnchorCorner(value: /* anchorCorner */ Corner => Unit): Self = this.set("setMenuAnchorCorner", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMenuAnchorCorner: Self = this.set("setMenuAnchorCorner", js.undefined)
    
    @scala.inline
    def setSetMenuAnchorElement(value: /* anchorEl */ Element => Unit): Self = this.set("setMenuAnchorElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMenuAnchorElement: Self = this.set("setMenuAnchorElement", js.undefined)
    
    @scala.inline
    def setSetMenuWrapFocus(value: /* wrapFocus */ Boolean => Unit): Self = this.set("setMenuWrapFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMenuWrapFocus: Self = this.set("setMenuWrapFocus", js.undefined)
    
    @scala.inline
    def setSetRippleCenter(value: /* normalizedX */ Double => Unit): Self = this.set("setRippleCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRippleCenter: Self = this.set("setRippleCenter", js.undefined)
    
    @scala.inline
    def setSetSelectAnchorAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setSelectAnchorAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetSelectAnchorAttr: Self = this.set("setSelectAnchorAttr", js.undefined)
    
    @scala.inline
    def setSetSelectedIndex(value: /* index */ Double => Unit): Self = this.set("setSelectedIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSelectedIndex: Self = this.set("setSelectedIndex", js.undefined)
    
    @scala.inline
    def setSetSelectedText(value: /* text */ String => Unit): Self = this.set("setSelectedText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSelectedText: Self = this.set("setSelectedText", js.undefined)
    
    @scala.inline
    def setTypeaheadMatchItem(value: (/* nextChar */ String, /* startingIndex */ Double) => Double): Self = this.set("typeaheadMatchItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTypeaheadMatchItem: Self = this.set("typeaheadMatchItem", js.undefined)
  }
}
