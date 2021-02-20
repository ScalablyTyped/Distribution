package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReviewReplyResult extends StObject {
  
  /**
    * The time at which the reply took effect.
    */
  var lastEdited: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * The reply text that was applied.
    */
  var replyText: js.UndefOr[String] = js.native
}
object SchemaReviewReplyResult {
  
  @scala.inline
  def apply(): SchemaReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewReplyResult]
  }
  
  @scala.inline
  implicit class SchemaReviewReplyResultMutableBuilder[Self <: SchemaReviewReplyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastEdited(value: SchemaTimestamp): Self = StObject.set(x, "lastEdited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEditedUndefined: Self = StObject.set(x, "lastEdited", js.undefined)
    
    @scala.inline
    def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyTextUndefined: Self = StObject.set(x, "replyText", js.undefined)
  }
}
