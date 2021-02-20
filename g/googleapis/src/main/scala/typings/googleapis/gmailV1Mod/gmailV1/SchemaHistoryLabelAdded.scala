package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHistoryLabelAdded extends StObject {
  
  /**
    * Label IDs added to the message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  
  var message: js.UndefOr[SchemaMessage] = js.native
}
object SchemaHistoryLabelAdded {
  
  @scala.inline
  def apply(): SchemaHistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistoryLabelAdded]
  }
  
  @scala.inline
  implicit class SchemaHistoryLabelAddedMutableBuilder[Self <: SchemaHistoryLabelAdded] (val x: Self) extends AnyVal {
    
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
