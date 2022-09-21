package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Proximity extends StObject {
  
  /**
    * Number of characters after the finding to consider.
    */
  var windowAfter: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of characters before the finding to consider. For tabular data, if you want to modify the likelihood of an entire column of findngs, set this to 1. For more information, see [Hotword example: Set the match likelihood of a table column] (https://cloud.google.com/dlp/docs/creating-custom-infotypes-likelihood#match-column-values).
    */
  var windowBefore: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Proximity {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Proximity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Proximity]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Proximity](x: Self) {
    
    inline def setWindowAfter(value: Double): Self = StObject.set(x, "windowAfter", value.asInstanceOf[js.Any])
    
    inline def setWindowAfterNull: Self = StObject.set(x, "windowAfter", null)
    
    inline def setWindowAfterUndefined: Self = StObject.set(x, "windowAfter", js.undefined)
    
    inline def setWindowBefore(value: Double): Self = StObject.set(x, "windowBefore", value.asInstanceOf[js.Any])
    
    inline def setWindowBeforeNull: Self = StObject.set(x, "windowBefore", null)
    
    inline def setWindowBeforeUndefined: Self = StObject.set(x, "windowBefore", js.undefined)
  }
}
