package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TimeZone extends StObject {
  
  /**
    * Set only if the offset can be determined. Positive for time ahead of UTC.
    * E.g. For &quot;UTC-9&quot;, this value is -540.
    */
  var offsetMinutes: js.UndefOr[Double] = js.undefined
}
object SchemaGooglePrivacyDlpV2TimeZone {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimeZone]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TimeZone](x: Self) {
    
    inline def setOffsetMinutes(value: Double): Self = StObject.set(x, "offsetMinutes", value.asInstanceOf[js.Any])
    
    inline def setOffsetMinutesUndefined: Self = StObject.set(x, "offsetMinutes", js.undefined)
  }
}
