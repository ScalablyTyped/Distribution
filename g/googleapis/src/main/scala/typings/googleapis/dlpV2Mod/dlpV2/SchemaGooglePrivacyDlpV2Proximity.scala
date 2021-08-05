package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for specifying a window around a finding to apply a detection rule.
  */
trait SchemaGooglePrivacyDlpV2Proximity extends StObject {
  
  /**
    * Number of characters after the finding to consider.
    */
  var windowAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of characters before the finding to consider.
    */
  var windowBefore: js.UndefOr[Double] = js.undefined
}
object SchemaGooglePrivacyDlpV2Proximity {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Proximity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Proximity]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Proximity](x: Self) {
    
    inline def setWindowAfter(value: Double): Self = StObject.set(x, "windowAfter", value.asInstanceOf[js.Any])
    
    inline def setWindowAfterUndefined: Self = StObject.set(x, "windowAfter", js.undefined)
    
    inline def setWindowBefore(value: Double): Self = StObject.set(x, "windowBefore", value.asInstanceOf[js.Any])
    
    inline def setWindowBeforeUndefined: Self = StObject.set(x, "windowBefore", js.undefined)
  }
}
