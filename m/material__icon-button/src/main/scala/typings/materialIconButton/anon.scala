package typings.materialIconButton

import typings.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ARIALABEL extends StObject {
    
    var ARIA_LABEL: String
    
    var ARIA_PRESSED: String
    
    var CHANGE_EVENT: String
    
    var DATA_ARIA_LABEL_OFF: String
    
    var DATA_ARIA_LABEL_ON: String
  }
  object ARIALABEL {
    
    inline def apply(
      ARIA_LABEL: String,
      ARIA_PRESSED: String,
      CHANGE_EVENT: String,
      DATA_ARIA_LABEL_OFF: String,
      DATA_ARIA_LABEL_ON: String
    ): ARIALABEL = {
      val __obj = js.Dynamic.literal(ARIA_LABEL = ARIA_LABEL.asInstanceOf[js.Any], ARIA_PRESSED = ARIA_PRESSED.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], DATA_ARIA_LABEL_OFF = DATA_ARIA_LABEL_OFF.asInstanceOf[js.Any], DATA_ARIA_LABEL_ON = DATA_ARIA_LABEL_ON.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIALABEL]
    }
    
    extension [Self <: ARIALABEL](x: Self) {
      
      inline def setARIA_LABEL(value: String): Self = StObject.set(x, "ARIA_LABEL", value.asInstanceOf[js.Any])
      
      inline def setARIA_PRESSED(value: String): Self = StObject.set(x, "ARIA_PRESSED", value.asInstanceOf[js.Any])
      
      inline def setCHANGE_EVENT(value: String): Self = StObject.set(x, "CHANGE_EVENT", value.asInstanceOf[js.Any])
      
      inline def setDATA_ARIA_LABEL_OFF(value: String): Self = StObject.set(x, "DATA_ARIA_LABEL_OFF", value.asInstanceOf[js.Any])
      
      inline def setDATA_ARIA_LABEL_ON(value: String): Self = StObject.set(x, "DATA_ARIA_LABEL_ON", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICONBUTTONON extends StObject {
    
    var ICON_BUTTON_ON: String
    
    var ROOT: String
  }
  object ICONBUTTONON {
    
    inline def apply(ICON_BUTTON_ON: String, ROOT: String): ICONBUTTONON = {
      val __obj = js.Dynamic.literal(ICON_BUTTON_ON = ICON_BUTTON_ON.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICONBUTTONON]
    }
    
    extension [Self <: ICONBUTTONON](x: Self) {
      
      inline def setICON_BUTTON_ON(value: String): Self = StObject.set(x, "ICON_BUTTON_ON", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/icon-button.@material/icon-button/adapter.MDCIconButtonToggleAdapter> */
  trait PartialMDCIconButtonToggl extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var getAttr: js.UndefOr[js.Function1[/* attrName */ String, String | Null]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCIconButtonToggleEventDetail, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* attrValue */ String, Unit]] = js.undefined
  }
  object PartialMDCIconButtonToggl {
    
    inline def apply(): PartialMDCIconButtonToggl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCIconButtonToggl]
    }
    
    extension [Self <: PartialMDCIconButtonToggl](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetAttr(value: /* attrName */ String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setGetAttrUndefined: Self = StObject.set(x, "getAttr", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setNotifyChange(value: /* evtData */ MDCIconButtonToggleEventDetail => Unit): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1(value))
      
      inline def setNotifyChangeUndefined: Self = StObject.set(x, "notifyChange", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetAttr(value: (/* attrName */ String, /* attrValue */ String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      inline def setSetAttrUndefined: Self = StObject.set(x, "setAttr", js.undefined)
    }
  }
}
