package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoAbuseReportSecondaryReason extends StObject {
  
  /**
    * The ID of this abuse report secondary reason.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The localized label for this abuse report secondary reason.
    */
  var label: js.UndefOr[String] = js.undefined
}
object SchemaVideoAbuseReportSecondaryReason {
  
  inline def apply(): SchemaVideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAbuseReportSecondaryReason]
  }
  
  extension [Self <: SchemaVideoAbuseReportSecondaryReason](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
