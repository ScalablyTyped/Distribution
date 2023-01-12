package typings.materialFormField

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LABELSELECTOR extends StObject {
    
    var LABEL_SELECTOR: String
  }
  object LABELSELECTOR {
    
    inline def apply(LABEL_SELECTOR: String): LABELSELECTOR = {
      val __obj = js.Dynamic.literal(LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[LABELSELECTOR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LABELSELECTOR] (val x: Self) extends AnyVal {
      
      inline def setLABEL_SELECTOR(value: String): Self = StObject.set(x, "LABEL_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/form-field.@material/form-field/adapter.MDCFormFieldAdapter> */
  trait PartialMDCFormFieldAdapte extends StObject {
    
    var activateInputRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var deactivateInputRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
  }
  object PartialMDCFormFieldAdapte {
    
    inline def apply(): PartialMDCFormFieldAdapte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCFormFieldAdapte]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCFormFieldAdapte] (val x: Self) extends AnyVal {
      
      inline def setActivateInputRipple(value: () => Unit): Self = StObject.set(x, "activateInputRipple", js.Any.fromFunction0(value))
      
      inline def setActivateInputRippleUndefined: Self = StObject.set(x, "activateInputRipple", js.undefined)
      
      inline def setDeactivateInputRipple(value: () => Unit): Self = StObject.set(x, "deactivateInputRipple", js.Any.fromFunction0(value))
      
      inline def setDeactivateInputRippleUndefined: Self = StObject.set(x, "deactivateInputRipple", js.undefined)
      
      inline def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      inline def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
    }
  }
  
  trait ROOT extends StObject {
    
    var ROOT: String
  }
  object ROOT {
    
    inline def apply(ROOT: String): ROOT = {
      val __obj = js.Dynamic.literal(ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ROOT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ROOT] (val x: Self) extends AnyVal {
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
}
