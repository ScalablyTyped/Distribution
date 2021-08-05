package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReviewReplyResult extends StObject {
  
  /**
    * The time at which the reply took effect.
    */
  var lastEdited: js.UndefOr[SchemaTimestamp] = js.undefined
  
  /**
    * The reply text that was applied.
    */
  var replyText: js.UndefOr[String] = js.undefined
}
object SchemaReviewReplyResult {
  
  inline def apply(): SchemaReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewReplyResult]
  }
  
  extension [Self <: SchemaReviewReplyResult](x: Self) {
    
    inline def setLastEdited(value: SchemaTimestamp): Self = StObject.set(x, "lastEdited", value.asInstanceOf[js.Any])
    
    inline def setLastEditedUndefined: Self = StObject.set(x, "lastEdited", js.undefined)
    
    inline def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    inline def setReplyTextUndefined: Self = StObject.set(x, "replyText", js.undefined)
  }
}
