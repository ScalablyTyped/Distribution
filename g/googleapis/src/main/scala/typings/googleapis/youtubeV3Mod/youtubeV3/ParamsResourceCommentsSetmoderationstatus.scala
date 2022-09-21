package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsSetmoderationstatus
  extends StObject
     with StandardParameters {
  
  /**
    * If set to true the author of the comment gets added to the ban list. This means all future comments of the author will autmomatically be rejected. Only valid in combination with STATUS_REJECTED.
    */
  var banAuthor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Modifies the moderation status of the comments with the given IDs
    */
  var id: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the requested moderation status. Note, comments can be in statuses, which are not available through this call. For example, this call does not allow to mark a comment as 'likely spam'. Valid values: MODERATION_STATUS_PUBLISHED, MODERATION_STATUS_HELD_FOR_REVIEW, MODERATION_STATUS_REJECTED.
    */
  var moderationStatus: js.UndefOr[String] = js.undefined
}
object ParamsResourceCommentsSetmoderationstatus {
  
  inline def apply(): ParamsResourceCommentsSetmoderationstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsSetmoderationstatus]
  }
  
  extension [Self <: ParamsResourceCommentsSetmoderationstatus](x: Self) {
    
    inline def setBanAuthor(value: Boolean): Self = StObject.set(x, "banAuthor", value.asInstanceOf[js.Any])
    
    inline def setBanAuthorUndefined: Self = StObject.set(x, "banAuthor", js.undefined)
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
    
    inline def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
  }
}
