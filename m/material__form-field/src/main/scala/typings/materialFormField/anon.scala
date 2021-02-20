package typings.materialFormField

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LABELSELECTOR extends StObject {
    
    var LABEL_SELECTOR: String = js.native
  }
  object LABELSELECTOR {
    
    @scala.inline
    def apply(LABEL_SELECTOR: String): LABELSELECTOR = {
      val __obj = js.Dynamic.literal(LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[LABELSELECTOR]
    }
    
    @scala.inline
    implicit class LABELSELECTORMutableBuilder[Self <: LABELSELECTOR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLABEL_SELECTOR(value: String): Self = StObject.set(x, "LABEL_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/form-field.@material/form-field/adapter.MDCFormFieldAdapter> */
  @js.native
  trait PartialMDCFormFieldAdapte extends StObject {
    
    var activateInputRipple: js.UndefOr[js.Function0[Unit]] = js.native
    
    var deactivateInputRipple: js.UndefOr[js.Function0[Unit]] = js.native
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
  }
  object PartialMDCFormFieldAdapte {
    
    @scala.inline
    def apply(): PartialMDCFormFieldAdapte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCFormFieldAdapte]
    }
    
    @scala.inline
    implicit class PartialMDCFormFieldAdapteMutableBuilder[Self <: PartialMDCFormFieldAdapte] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivateInputRipple(value: () => Unit): Self = StObject.set(x, "activateInputRipple", js.Any.fromFunction0(value))
      
      @scala.inline
      def setActivateInputRippleUndefined: Self = StObject.set(x, "activateInputRipple", js.undefined)
      
      @scala.inline
      def setDeactivateInputRipple(value: () => Unit): Self = StObject.set(x, "deactivateInputRipple", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeactivateInputRippleUndefined: Self = StObject.set(x, "deactivateInputRipple", js.undefined)
      
      @scala.inline
      def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      @scala.inline
      def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
    }
  }
  
  @js.native
  trait ROOT extends StObject {
    
    var ROOT: String = js.native
  }
  object ROOT {
    
    @scala.inline
    def apply(ROOT: String): ROOT = {
      val __obj = js.Dynamic.literal(ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ROOT]
    }
    
    @scala.inline
    implicit class ROOTMutableBuilder[Self <: ROOT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
}
