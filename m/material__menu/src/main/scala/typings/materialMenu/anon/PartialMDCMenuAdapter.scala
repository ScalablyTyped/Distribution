package typings.materialMenu.anon

import typings.materialMenu.typesMod.MDCMenuItemEventDetail
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/menu.@material/menu/adapter.MDCMenuAdapter> */
@js.native
trait PartialMDCMenuAdapter extends js.Object {
  
  var addAttributeToElementAtIndex: js.UndefOr[js.Function3[/* index */ Double, /* attr */ String, /* value */ String, Unit]] = js.native
  
  var addClassToElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
  
  var closeSurface: js.UndefOr[js.Function1[/* skipRestoreFocus */ js.UndefOr[Boolean], Unit]] = js.native
  
  var elementContainsClass: js.UndefOr[js.Function2[/* element */ Element, /* className */ String, Boolean]] = js.native
  
  var focusItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var focusListRoot: js.UndefOr[js.Function0[Unit]] = js.native
  
  var getElementIndex: js.UndefOr[js.Function1[/* element */ Element, Double]] = js.native
  
  var getMenuItemCount: js.UndefOr[js.Function0[Double]] = js.native
  
  var getSelectedSiblingOfItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  var isSelectableItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.native
  
  var notifySelected: js.UndefOr[js.Function1[/* evtData */ MDCMenuItemEventDetail, Unit]] = js.native
  
  var removeAttributeFromElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* attr */ String, Unit]] = js.native
  
  var removeClassFromElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
}
object PartialMDCMenuAdapter {
  
  @scala.inline
  def apply(): PartialMDCMenuAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCMenuAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCMenuAdapterOps[Self <: PartialMDCMenuAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddAttributeToElementAtIndex(value: (/* index */ Double, /* attr */ String, /* value */ String) => Unit): Self = this.set("addAttributeToElementAtIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddAttributeToElementAtIndex: Self = this.set("addAttributeToElementAtIndex", js.undefined)
    
    @scala.inline
    def setAddClassToElementAtIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = this.set("addClassToElementAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddClassToElementAtIndex: Self = this.set("addClassToElementAtIndex", js.undefined)
    
    @scala.inline
    def setCloseSurface(value: /* skipRestoreFocus */ js.UndefOr[Boolean] => Unit): Self = this.set("closeSurface", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCloseSurface: Self = this.set("closeSurface", js.undefined)
    
    @scala.inline
    def setElementContainsClass(value: (/* element */ Element, /* className */ String) => Boolean): Self = this.set("elementContainsClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteElementContainsClass: Self = this.set("elementContainsClass", js.undefined)
    
    @scala.inline
    def setFocusItemAtIndex(value: /* index */ Double => Unit): Self = this.set("focusItemAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusItemAtIndex: Self = this.set("focusItemAtIndex", js.undefined)
    
    @scala.inline
    def setFocusListRoot(value: () => Unit): Self = this.set("focusListRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFocusListRoot: Self = this.set("focusListRoot", js.undefined)
    
    @scala.inline
    def setGetElementIndex(value: /* element */ Element => Double): Self = this.set("getElementIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetElementIndex: Self = this.set("getElementIndex", js.undefined)
    
    @scala.inline
    def setGetMenuItemCount(value: () => Double): Self = this.set("getMenuItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMenuItemCount: Self = this.set("getMenuItemCount", js.undefined)
    
    @scala.inline
    def setGetSelectedSiblingOfItemAtIndex(value: /* index */ Double => Double): Self = this.set("getSelectedSiblingOfItemAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSelectedSiblingOfItemAtIndex: Self = this.set("getSelectedSiblingOfItemAtIndex", js.undefined)
    
    @scala.inline
    def setIsSelectableItemAtIndex(value: /* index */ Double => Boolean): Self = this.set("isSelectableItemAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsSelectableItemAtIndex: Self = this.set("isSelectableItemAtIndex", js.undefined)
    
    @scala.inline
    def setNotifySelected(value: /* evtData */ MDCMenuItemEventDetail => Unit): Self = this.set("notifySelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifySelected: Self = this.set("notifySelected", js.undefined)
    
    @scala.inline
    def setRemoveAttributeFromElementAtIndex(value: (/* index */ Double, /* attr */ String) => Unit): Self = this.set("removeAttributeFromElementAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveAttributeFromElementAtIndex: Self = this.set("removeAttributeFromElementAtIndex", js.undefined)
    
    @scala.inline
    def setRemoveClassFromElementAtIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = this.set("removeClassFromElementAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveClassFromElementAtIndex: Self = this.set("removeClassFromElementAtIndex", js.undefined)
  }
}
