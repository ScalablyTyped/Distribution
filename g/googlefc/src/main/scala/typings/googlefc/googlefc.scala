package typings.googlefc

import typings.googlefc.anon.PartialRecordCallbackQueu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googlefc {
  
  type CallbackQueueArray = js.Array[js.Function0[Any] | PartialRecordCallbackQueu]
  
  /* Rewritten from type alias, can be one of: 
    - typings.googlefc.googlefcStrings.CONSENT_DATA_READY
    - typings.googlefc.googlefcStrings.AD_BLOCK_DATA_READY
    - typings.googlefc.googlefcStrings.INITIAL_CCPA_DATA_READY
  */
  trait CallbackQueueType extends StObject
  object CallbackQueueType {
    
    inline def AD_BLOCK_DATA_READY: typings.googlefc.googlefcStrings.AD_BLOCK_DATA_READY = "AD_BLOCK_DATA_READY".asInstanceOf[typings.googlefc.googlefcStrings.AD_BLOCK_DATA_READY]
    
    inline def CONSENT_DATA_READY: typings.googlefc.googlefcStrings.CONSENT_DATA_READY = "CONSENT_DATA_READY".asInstanceOf[typings.googlefc.googlefcStrings.CONSENT_DATA_READY]
    
    inline def INITIAL_CCPA_DATA_READY: typings.googlefc.googlefcStrings.INITIAL_CCPA_DATA_READY = "INITIAL_CCPA_DATA_READY".asInstanceOf[typings.googlefc.googlefcStrings.INITIAL_CCPA_DATA_READY]
  }
}
