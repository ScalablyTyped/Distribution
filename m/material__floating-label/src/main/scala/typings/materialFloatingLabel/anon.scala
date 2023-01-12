package typings.materialFloatingLabel

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LABELFLOATABOVE extends StObject {
    
    var LABEL_FLOAT_ABOVE: String
    
    var LABEL_REQUIRED: String
    
    var LABEL_SHAKE: String
    
    var ROOT: String
  }
  object LABELFLOATABOVE {
    
    inline def apply(LABEL_FLOAT_ABOVE: String, LABEL_REQUIRED: String, LABEL_SHAKE: String, ROOT: String): LABELFLOATABOVE = {
      val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE.asInstanceOf[js.Any], LABEL_REQUIRED = LABEL_REQUIRED.asInstanceOf[js.Any], LABEL_SHAKE = LABEL_SHAKE.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[LABELFLOATABOVE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LABELFLOATABOVE] (val x: Self) extends AnyVal {
      
      inline def setLABEL_FLOAT_ABOVE(value: String): Self = StObject.set(x, "LABEL_FLOAT_ABOVE", value.asInstanceOf[js.Any])
      
      inline def setLABEL_REQUIRED(value: String): Self = StObject.set(x, "LABEL_REQUIRED", value.asInstanceOf[js.Any])
      
      inline def setLABEL_SHAKE(value: String): Self = StObject.set(x, "LABEL_SHAKE", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/floating-label.@material/floating-label/adapter.MDCFloatingLabelAdapter> */
  trait PartialMDCFloatingLabelAd extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  }
  object PartialMDCFloatingLabelAd {
    
    inline def apply(): PartialMDCFloatingLabelAd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCFloatingLabelAd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCFloatingLabelAd] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      inline def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
    }
  }
}
