package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchModifyMessagesRequest extends StObject {
  
  /**
    * A list of label IDs to add to messages.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The IDs of the messages to modify. There is a limit of 1000 ids per
    * request.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of label IDs to remove from messages.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaBatchModifyMessagesRequest {
  
  @scala.inline
  def apply(): SchemaBatchModifyMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchModifyMessagesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchModifyMessagesRequestMutableBuilder[Self <: SchemaBatchModifyMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
    
    @scala.inline
    def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
    
    @scala.inline
    def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value :_*))
  }
}
