package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A videoAbuseReportReason resource identifies a reason that a video could be
  * reported as abusive. Video abuse report reasons are used with
  * video.ReportAbuse.
  */
trait SchemaVideoAbuseReportReason extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of this abuse report reason.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#videoAbuseReportReason&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the abuse report reason.
    */
  var snippet: js.UndefOr[SchemaVideoAbuseReportReasonSnippet] = js.undefined
}
object SchemaVideoAbuseReportReason {
  
  @scala.inline
  def apply(): SchemaVideoAbuseReportReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAbuseReportReason]
  }
  
  @scala.inline
  implicit class SchemaVideoAbuseReportReasonMutableBuilder[Self <: SchemaVideoAbuseReportReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaVideoAbuseReportReasonSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
