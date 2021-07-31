package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistoryLabelRemoved extends StObject {
  
  /**
    * Label IDs removed from the message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaHistoryLabelRemoved {
  
  @scala.inline
  def apply(): SchemaHistoryLabelRemoved = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistoryLabelRemoved]
  }
  
  @scala.inline
  implicit class SchemaHistoryLabelRemovedMutableBuilder[Self <: SchemaHistoryLabelRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
