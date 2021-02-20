package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a video category, such as its localized title.
  */
@js.native
trait SchemaVideoAbuseReportReasonSnippet extends StObject {
  
  /**
    * The localized label belonging to this abuse report reason.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The secondary reasons associated with this reason, if any are available.
    * (There might be 0 or more.)
    */
  var secondaryReasons: js.UndefOr[js.Array[SchemaVideoAbuseReportSecondaryReason]] = js.native
}
object SchemaVideoAbuseReportReasonSnippet {
  
  @scala.inline
  def apply(): SchemaVideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAbuseReportReasonSnippet]
  }
  
  @scala.inline
  implicit class SchemaVideoAbuseReportReasonSnippetMutableBuilder[Self <: SchemaVideoAbuseReportReasonSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSecondaryReasons(value: js.Array[SchemaVideoAbuseReportSecondaryReason]): Self = StObject.set(x, "secondaryReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryReasonsUndefined: Self = StObject.set(x, "secondaryReasons", js.undefined)
    
    @scala.inline
    def setSecondaryReasonsVarargs(value: SchemaVideoAbuseReportSecondaryReason*): Self = StObject.set(x, "secondaryReasons", js.Array(value :_*))
  }
}
