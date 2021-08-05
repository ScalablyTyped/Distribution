package typings.materialMenu

import typings.materialMenu.typesMod.MDCMenuItemEventDetail
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ARIACHECKEDATTR extends StObject {
    
    var ARIA_CHECKED_ATTR: String
    
    var ARIA_DISABLED_ATTR: String
    
    var CHECKBOX_SELECTOR: String
    
    var LIST_SELECTOR: String
    
    var SELECTED_EVENT: String
  }
  object ARIACHECKEDATTR {
    
    inline def apply(
      ARIA_CHECKED_ATTR: String,
      ARIA_DISABLED_ATTR: String,
      CHECKBOX_SELECTOR: String,
      LIST_SELECTOR: String,
      SELECTED_EVENT: String
    ): ARIACHECKEDATTR = {
      val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], ARIA_DISABLED_ATTR = ARIA_DISABLED_ATTR.asInstanceOf[js.Any], CHECKBOX_SELECTOR = CHECKBOX_SELECTOR.asInstanceOf[js.Any], LIST_SELECTOR = LIST_SELECTOR.asInstanceOf[js.Any], SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIACHECKEDATTR]
    }
    
    extension [Self <: ARIACHECKEDATTR](x: Self) {
      
      inline def setARIA_CHECKED_ATTR(value: String): Self = StObject.set(x, "ARIA_CHECKED_ATTR", value.asInstanceOf[js.Any])
      
      inline def setARIA_DISABLED_ATTR(value: String): Self = StObject.set(x, "ARIA_DISABLED_ATTR", value.asInstanceOf[js.Any])
      
      inline def setCHECKBOX_SELECTOR(value: String): Self = StObject.set(x, "CHECKBOX_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setLIST_SELECTOR(value: String): Self = StObject.set(x, "LIST_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setSELECTED_EVENT(value: String): Self = StObject.set(x, "SELECTED_EVENT", value.asInstanceOf[js.Any])
    }
  }
  
  trait FOCUSROOTINDEX extends StObject {
    
    var FOCUS_ROOT_INDEX: Double
  }
  object FOCUSROOTINDEX {
    
    inline def apply(FOCUS_ROOT_INDEX: Double): FOCUSROOTINDEX = {
      val __obj = js.Dynamic.literal(FOCUS_ROOT_INDEX = FOCUS_ROOT_INDEX.asInstanceOf[js.Any])
      __obj.asInstanceOf[FOCUSROOTINDEX]
    }
    
    extension [Self <: FOCUSROOTINDEX](x: Self) {
      
      inline def setFOCUS_ROOT_INDEX(value: Double): Self = StObject.set(x, "FOCUS_ROOT_INDEX", value.asInstanceOf[js.Any])
    }
  }
  
  trait MENUSELECTEDLISTITEM extends StObject {
    
    var MENU_SELECTED_LIST_ITEM: String
    
    var MENU_SELECTION_GROUP: String
    
    var ROOT: String
  }
  object MENUSELECTEDLISTITEM {
    
    inline def apply(MENU_SELECTED_LIST_ITEM: String, MENU_SELECTION_GROUP: String, ROOT: String): MENUSELECTEDLISTITEM = {
      val __obj = js.Dynamic.literal(MENU_SELECTED_LIST_ITEM = MENU_SELECTED_LIST_ITEM.asInstanceOf[js.Any], MENU_SELECTION_GROUP = MENU_SELECTION_GROUP.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[MENUSELECTEDLISTITEM]
    }
    
    extension [Self <: MENUSELECTEDLISTITEM](x: Self) {
      
      inline def setMENU_SELECTED_LIST_ITEM(value: String): Self = StObject.set(x, "MENU_SELECTED_LIST_ITEM", value.asInstanceOf[js.Any])
      
      inline def setMENU_SELECTION_GROUP(value: String): Self = StObject.set(x, "MENU_SELECTION_GROUP", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/menu.@material/menu/adapter.MDCMenuAdapter> */
  trait PartialMDCMenuAdapter extends StObject {
    
    var addAttributeToElementAtIndex: js.UndefOr[js.Function3[/* index */ Double, /* attr */ String, /* value */ String, Unit]] = js.undefined
    
    var addClassToElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.undefined
    
    var closeSurface: js.UndefOr[js.Function1[/* skipRestoreFocus */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    var elementContainsClass: js.UndefOr[js.Function2[/* element */ Element, /* className */ String, Boolean]] = js.undefined
    
    var focusItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var focusListRoot: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getElementIndex: js.UndefOr[js.Function1[/* element */ Element, Double]] = js.undefined
    
    var getMenuItemCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getSelectedSiblingOfItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var isSelectableItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.undefined
    
    var notifySelected: js.UndefOr[js.Function1[/* evtData */ MDCMenuItemEventDetail, Unit]] = js.undefined
    
    var removeAttributeFromElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* attr */ String, Unit]] = js.undefined
    
    var removeClassFromElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.undefined
  }
  object PartialMDCMenuAdapter {
    
    inline def apply(): PartialMDCMenuAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuAdapter]
    }
    
    extension [Self <: PartialMDCMenuAdapter](x: Self) {
      
      inline def setAddAttributeToElementAtIndex(value: (/* index */ Double, /* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "addAttributeToElementAtIndex", js.Any.fromFunction3(value))
      
      inline def setAddAttributeToElementAtIndexUndefined: Self = StObject.set(x, "addAttributeToElementAtIndex", js.undefined)
      
      inline def setAddClassToElementAtIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = StObject.set(x, "addClassToElementAtIndex", js.Any.fromFunction2(value))
      
      inline def setAddClassToElementAtIndexUndefined: Self = StObject.set(x, "addClassToElementAtIndex", js.undefined)
      
      inline def setCloseSurface(value: /* skipRestoreFocus */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "closeSurface", js.Any.fromFunction1(value))
      
      inline def setCloseSurfaceUndefined: Self = StObject.set(x, "closeSurface", js.undefined)
      
      inline def setElementContainsClass(value: (/* element */ Element, /* className */ String) => Boolean): Self = StObject.set(x, "elementContainsClass", js.Any.fromFunction2(value))
      
      inline def setElementContainsClassUndefined: Self = StObject.set(x, "elementContainsClass", js.undefined)
      
      inline def setFocusItemAtIndex(value: /* index */ Double => Unit): Self = StObject.set(x, "focusItemAtIndex", js.Any.fromFunction1(value))
      
      inline def setFocusItemAtIndexUndefined: Self = StObject.set(x, "focusItemAtIndex", js.undefined)
      
      inline def setFocusListRoot(value: () => Unit): Self = StObject.set(x, "focusListRoot", js.Any.fromFunction0(value))
      
      inline def setFocusListRootUndefined: Self = StObject.set(x, "focusListRoot", js.undefined)
      
      inline def setGetElementIndex(value: /* element */ Element => Double): Self = StObject.set(x, "getElementIndex", js.Any.fromFunction1(value))
      
      inline def setGetElementIndexUndefined: Self = StObject.set(x, "getElementIndex", js.undefined)
      
      inline def setGetMenuItemCount(value: () => Double): Self = StObject.set(x, "getMenuItemCount", js.Any.fromFunction0(value))
      
      inline def setGetMenuItemCountUndefined: Self = StObject.set(x, "getMenuItemCount", js.undefined)
      
      inline def setGetSelectedSiblingOfItemAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getSelectedSiblingOfItemAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetSelectedSiblingOfItemAtIndexUndefined: Self = StObject.set(x, "getSelectedSiblingOfItemAtIndex", js.undefined)
      
      inline def setIsSelectableItemAtIndex(value: /* index */ Double => Boolean): Self = StObject.set(x, "isSelectableItemAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsSelectableItemAtIndexUndefined: Self = StObject.set(x, "isSelectableItemAtIndex", js.undefined)
      
      inline def setNotifySelected(value: /* evtData */ MDCMenuItemEventDetail => Unit): Self = StObject.set(x, "notifySelected", js.Any.fromFunction1(value))
      
      inline def setNotifySelectedUndefined: Self = StObject.set(x, "notifySelected", js.undefined)
      
      inline def setRemoveAttributeFromElementAtIndex(value: (/* index */ Double, /* attr */ String) => Unit): Self = StObject.set(x, "removeAttributeFromElementAtIndex", js.Any.fromFunction2(value))
      
      inline def setRemoveAttributeFromElementAtIndexUndefined: Self = StObject.set(x, "removeAttributeFromElementAtIndex", js.undefined)
      
      inline def setRemoveClassFromElementAtIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = StObject.set(x, "removeClassFromElementAtIndex", js.Any.fromFunction2(value))
      
      inline def setRemoveClassFromElementAtIndexUndefined: Self = StObject.set(x, "removeClassFromElementAtIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/menu-surface.@material/menu-surface/types.MDCMenuDistance> */
  trait PartialMDCMenuDistance extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object PartialMDCMenuDistance {
    
    inline def apply(): PartialMDCMenuDistance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuDistance]
    }
    
    extension [Self <: PartialMDCMenuDistance](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
