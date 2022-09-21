package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoAbuseReport extends StObject {
  
  /**
    * Additional comments regarding the abuse report.
    */
  var comments: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The language that the content was viewed in.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The high-level, or primary, reason that the content is abusive. The value is an abuse report reason ID.
    */
  var reasonId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The specific, or secondary, reason that this content is abusive (if available). The value is an abuse report reason ID that is a valid secondary reason for the primary reason.
    */
  var secondaryReasonId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoAbuseReport {
  
  inline def apply(): SchemaVideoAbuseReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAbuseReport]
  }
  
  extension [Self <: SchemaVideoAbuseReport](x: Self) {
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setReasonId(value: String): Self = StObject.set(x, "reasonId", value.asInstanceOf[js.Any])
    
    inline def setReasonIdNull: Self = StObject.set(x, "reasonId", null)
    
    inline def setReasonIdUndefined: Self = StObject.set(x, "reasonId", js.undefined)
    
    inline def setSecondaryReasonId(value: String): Self = StObject.set(x, "secondaryReasonId", value.asInstanceOf[js.Any])
    
    inline def setSecondaryReasonIdNull: Self = StObject.set(x, "secondaryReasonId", null)
    
    inline def setSecondaryReasonIdUndefined: Self = StObject.set(x, "secondaryReasonId", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdNull: Self = StObject.set(x, "videoId", null)
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
