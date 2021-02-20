package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for specifying a window around a finding to apply a detection rule.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Proximity extends StObject {
  
  /**
    * Number of characters after the finding to consider.
    */
  var windowAfter: js.UndefOr[Double] = js.native
  
  /**
    * Number of characters before the finding to consider.
    */
  var windowBefore: js.UndefOr[Double] = js.native
}
object SchemaGooglePrivacyDlpV2Proximity {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Proximity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Proximity]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ProximityMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Proximity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowAfter(value: Double): Self = StObject.set(x, "windowAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowAfterUndefined: Self = StObject.set(x, "windowAfter", js.undefined)
    
    @scala.inline
    def setWindowBefore(value: Double): Self = StObject.set(x, "windowBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBeforeUndefined: Self = StObject.set(x, "windowBefore", js.undefined)
  }
}
