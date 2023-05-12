package typings.googlefc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<std.Record<googlefc.googlefc.CallbackQueueType, (): any>> */
  trait PartialRecordCallbackQueu extends StObject {
    
    var AD_BLOCK_DATA_READY: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var CONSENT_DATA_READY: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var INITIAL_CCPA_DATA_READY: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object PartialRecordCallbackQueu {
    
    inline def apply(): PartialRecordCallbackQueu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCallbackQueu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecordCallbackQueu] (val x: Self) extends AnyVal {
      
      inline def setAD_BLOCK_DATA_READY(value: () => Any): Self = StObject.set(x, "AD_BLOCK_DATA_READY", js.Any.fromFunction0(value))
      
      inline def setAD_BLOCK_DATA_READYUndefined: Self = StObject.set(x, "AD_BLOCK_DATA_READY", js.undefined)
      
      inline def setCONSENT_DATA_READY(value: () => Any): Self = StObject.set(x, "CONSENT_DATA_READY", js.Any.fromFunction0(value))
      
      inline def setCONSENT_DATA_READYUndefined: Self = StObject.set(x, "CONSENT_DATA_READY", js.undefined)
      
      inline def setINITIAL_CCPA_DATA_READY(value: () => Any): Self = StObject.set(x, "INITIAL_CCPA_DATA_READY", js.Any.fromFunction0(value))
      
      inline def setINITIAL_CCPA_DATA_READYUndefined: Self = StObject.set(x, "INITIAL_CCPA_DATA_READY", js.undefined)
    }
  }
  
  trait Proceed extends StObject {
    
    def proceed(shouldProceed: Boolean): Unit
  }
  object Proceed {
    
    inline def apply(proceed: Boolean => Unit): Proceed = {
      val __obj = js.Dynamic.literal(proceed = js.Any.fromFunction1(proceed))
      __obj.asInstanceOf[Proceed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Proceed] (val x: Self) extends AnyVal {
      
      inline def setProceed(value: Boolean => Unit): Self = StObject.set(x, "proceed", js.Any.fromFunction1(value))
    }
  }
}
