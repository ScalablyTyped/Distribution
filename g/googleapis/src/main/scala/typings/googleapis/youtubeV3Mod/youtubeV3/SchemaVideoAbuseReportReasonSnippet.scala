package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoAbuseReportReasonSnippet extends StObject {
  
  /**
    * The localized label belonging to this abuse report reason.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The secondary reasons associated with this reason, if any are available. (There might be 0 or more.)
    */
  var secondaryReasons: js.UndefOr[js.Array[SchemaVideoAbuseReportSecondaryReason]] = js.undefined
}
object SchemaVideoAbuseReportReasonSnippet {
  
  inline def apply(): SchemaVideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAbuseReportReasonSnippet]
  }
  
  extension [Self <: SchemaVideoAbuseReportReasonSnippet](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSecondaryReasons(value: js.Array[SchemaVideoAbuseReportSecondaryReason]): Self = StObject.set(x, "secondaryReasons", value.asInstanceOf[js.Any])
    
    inline def setSecondaryReasonsUndefined: Self = StObject.set(x, "secondaryReasons", js.undefined)
    
    inline def setSecondaryReasonsVarargs(value: SchemaVideoAbuseReportSecondaryReason*): Self = StObject.set(x, "secondaryReasons", js.Array(value*))
  }
}
