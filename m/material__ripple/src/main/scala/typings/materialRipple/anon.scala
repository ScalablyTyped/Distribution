package typings.materialRipple

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialRipple.materialRippleStrings.resize
import typings.materialRipple.typesMod.MDCRipplePoint
import typings.std.DOMRect
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BGFOCUSED extends StObject {
    
    var BG_FOCUSED: String
    
    var FG_ACTIVATION: String
    
    var FG_DEACTIVATION: String
    
    var ROOT: String
    
    var UNBOUNDED: String
  }
  object BGFOCUSED {
    
    inline def apply(
      BG_FOCUSED: String,
      FG_ACTIVATION: String,
      FG_DEACTIVATION: String,
      ROOT: String,
      UNBOUNDED: String
    ): BGFOCUSED = {
      val __obj = js.Dynamic.literal(BG_FOCUSED = BG_FOCUSED.asInstanceOf[js.Any], FG_ACTIVATION = FG_ACTIVATION.asInstanceOf[js.Any], FG_DEACTIVATION = FG_DEACTIVATION.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], UNBOUNDED = UNBOUNDED.asInstanceOf[js.Any])
      __obj.asInstanceOf[BGFOCUSED]
    }
    
    extension [Self <: BGFOCUSED](x: Self) {
      
      inline def setBG_FOCUSED(value: String): Self = StObject.set(x, "BG_FOCUSED", value.asInstanceOf[js.Any])
      
      inline def setFG_ACTIVATION(value: String): Self = StObject.set(x, "FG_ACTIVATION", value.asInstanceOf[js.Any])
      
      inline def setFG_DEACTIVATION(value: String): Self = StObject.set(x, "FG_DEACTIVATION", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
      
      inline def setUNBOUNDED(value: String): Self = StObject.set(x, "UNBOUNDED", value.asInstanceOf[js.Any])
    }
  }
  
  trait DEACTIVATIONTIMEOUTMS extends StObject {
    
    var DEACTIVATION_TIMEOUT_MS: Double
    
    var FG_DEACTIVATION_MS: Double
    
    var INITIAL_ORIGIN_SCALE: Double
    
    var PADDING: Double
    
    var TAP_DELAY_MS: Double
  }
  object DEACTIVATIONTIMEOUTMS {
    
    inline def apply(
      DEACTIVATION_TIMEOUT_MS: Double,
      FG_DEACTIVATION_MS: Double,
      INITIAL_ORIGIN_SCALE: Double,
      PADDING: Double,
      TAP_DELAY_MS: Double
    ): DEACTIVATIONTIMEOUTMS = {
      val __obj = js.Dynamic.literal(DEACTIVATION_TIMEOUT_MS = DEACTIVATION_TIMEOUT_MS.asInstanceOf[js.Any], FG_DEACTIVATION_MS = FG_DEACTIVATION_MS.asInstanceOf[js.Any], INITIAL_ORIGIN_SCALE = INITIAL_ORIGIN_SCALE.asInstanceOf[js.Any], PADDING = PADDING.asInstanceOf[js.Any], TAP_DELAY_MS = TAP_DELAY_MS.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEACTIVATIONTIMEOUTMS]
    }
    
    extension [Self <: DEACTIVATIONTIMEOUTMS](x: Self) {
      
      inline def setDEACTIVATION_TIMEOUT_MS(value: Double): Self = StObject.set(x, "DEACTIVATION_TIMEOUT_MS", value.asInstanceOf[js.Any])
      
      inline def setFG_DEACTIVATION_MS(value: Double): Self = StObject.set(x, "FG_DEACTIVATION_MS", value.asInstanceOf[js.Any])
      
      inline def setINITIAL_ORIGIN_SCALE(value: Double): Self = StObject.set(x, "INITIAL_ORIGIN_SCALE", value.asInstanceOf[js.Any])
      
      inline def setPADDING(value: Double): Self = StObject.set(x, "PADDING", value.asInstanceOf[js.Any])
      
      inline def setTAP_DELAY_MS(value: Double): Self = StObject.set(x, "TAP_DELAY_MS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/ripple.@material/ripple/adapter.MDCRippleAdapter> */
  trait PartialMDCRippleAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var browserSupportsCssVars: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var computeBoundingRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
    
    var containsEventTarget: js.UndefOr[js.Function1[/* target */ EventTarget | Null, Boolean]] = js.undefined
    
    var deregisterDocumentInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var getWindowPageOffset: js.UndefOr[js.Function0[MDCRipplePoint]] = js.undefined
    
    var isSurfaceActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isSurfaceDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isUnbounded: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var registerDocumentInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ SpecificEventListener[resize], Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var updateCssVariable: js.UndefOr[js.Function2[/* varName */ String, /* value */ String | Null, Unit]] = js.undefined
  }
  object PartialMDCRippleAdapter {
    
    inline def apply(): PartialMDCRippleAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCRippleAdapter]
    }
    
    extension [Self <: PartialMDCRippleAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setBrowserSupportsCssVars(value: () => Boolean): Self = StObject.set(x, "browserSupportsCssVars", js.Any.fromFunction0(value))
      
      inline def setBrowserSupportsCssVarsUndefined: Self = StObject.set(x, "browserSupportsCssVars", js.undefined)
      
      inline def setComputeBoundingRect(value: () => DOMRect): Self = StObject.set(x, "computeBoundingRect", js.Any.fromFunction0(value))
      
      inline def setComputeBoundingRectUndefined: Self = StObject.set(x, "computeBoundingRect", js.undefined)
      
      inline def setContainsEventTarget(value: /* target */ EventTarget | Null => Boolean): Self = StObject.set(x, "containsEventTarget", js.Any.fromFunction1(value))
      
      inline def setContainsEventTargetUndefined: Self = StObject.set(x, "containsEventTarget", js.undefined)
      
      inline def setDeregisterDocumentInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterDocumentInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterDocumentInteractionHandlerUndefined: Self = StObject.set(x, "deregisterDocumentInteractionHandler", js.undefined)
      
      inline def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      inline def setDeregisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterResizeHandlerUndefined: Self = StObject.set(x, "deregisterResizeHandler", js.undefined)
      
      inline def setGetWindowPageOffset(value: () => MDCRipplePoint): Self = StObject.set(x, "getWindowPageOffset", js.Any.fromFunction0(value))
      
      inline def setGetWindowPageOffsetUndefined: Self = StObject.set(x, "getWindowPageOffset", js.undefined)
      
      inline def setIsSurfaceActive(value: () => Boolean): Self = StObject.set(x, "isSurfaceActive", js.Any.fromFunction0(value))
      
      inline def setIsSurfaceActiveUndefined: Self = StObject.set(x, "isSurfaceActive", js.undefined)
      
      inline def setIsSurfaceDisabled(value: () => Boolean): Self = StObject.set(x, "isSurfaceDisabled", js.Any.fromFunction0(value))
      
      inline def setIsSurfaceDisabledUndefined: Self = StObject.set(x, "isSurfaceDisabled", js.undefined)
      
      inline def setIsUnbounded(value: () => Boolean): Self = StObject.set(x, "isUnbounded", js.Any.fromFunction0(value))
      
      inline def setIsUnboundedUndefined: Self = StObject.set(x, "isUnbounded", js.undefined)
      
      inline def setRegisterDocumentInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerDocumentInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterDocumentInteractionHandlerUndefined: Self = StObject.set(x, "registerDocumentInteractionHandler", js.undefined)
      
      inline def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
      
      inline def setRegisterResizeHandler(value: /* handler */ SpecificEventListener[resize] => Unit): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterResizeHandlerUndefined: Self = StObject.set(x, "registerResizeHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setUpdateCssVariable(value: (/* varName */ String, /* value */ String | Null) => Unit): Self = StObject.set(x, "updateCssVariable", js.Any.fromFunction2(value))
      
      inline def setUpdateCssVariableUndefined: Self = StObject.set(x, "updateCssVariable", js.undefined)
    }
  }
  
  trait VARFGSCALE extends StObject {
    
    var VAR_FG_SCALE: String
    
    var VAR_FG_SIZE: String
    
    var VAR_FG_TRANSLATE_END: String
    
    var VAR_FG_TRANSLATE_START: String
    
    var VAR_LEFT: String
    
    var VAR_TOP: String
  }
  object VARFGSCALE {
    
    inline def apply(
      VAR_FG_SCALE: String,
      VAR_FG_SIZE: String,
      VAR_FG_TRANSLATE_END: String,
      VAR_FG_TRANSLATE_START: String,
      VAR_LEFT: String,
      VAR_TOP: String
    ): VARFGSCALE = {
      val __obj = js.Dynamic.literal(VAR_FG_SCALE = VAR_FG_SCALE.asInstanceOf[js.Any], VAR_FG_SIZE = VAR_FG_SIZE.asInstanceOf[js.Any], VAR_FG_TRANSLATE_END = VAR_FG_TRANSLATE_END.asInstanceOf[js.Any], VAR_FG_TRANSLATE_START = VAR_FG_TRANSLATE_START.asInstanceOf[js.Any], VAR_LEFT = VAR_LEFT.asInstanceOf[js.Any], VAR_TOP = VAR_TOP.asInstanceOf[js.Any])
      __obj.asInstanceOf[VARFGSCALE]
    }
    
    extension [Self <: VARFGSCALE](x: Self) {
      
      inline def setVAR_FG_SCALE(value: String): Self = StObject.set(x, "VAR_FG_SCALE", value.asInstanceOf[js.Any])
      
      inline def setVAR_FG_SIZE(value: String): Self = StObject.set(x, "VAR_FG_SIZE", value.asInstanceOf[js.Any])
      
      inline def setVAR_FG_TRANSLATE_END(value: String): Self = StObject.set(x, "VAR_FG_TRANSLATE_END", value.asInstanceOf[js.Any])
      
      inline def setVAR_FG_TRANSLATE_START(value: String): Self = StObject.set(x, "VAR_FG_TRANSLATE_START", value.asInstanceOf[js.Any])
      
      inline def setVAR_LEFT(value: String): Self = StObject.set(x, "VAR_LEFT", value.asInstanceOf[js.Any])
      
      inline def setVAR_TOP(value: String): Self = StObject.set(x, "VAR_TOP", value.asInstanceOf[js.Any])
    }
  }
}
