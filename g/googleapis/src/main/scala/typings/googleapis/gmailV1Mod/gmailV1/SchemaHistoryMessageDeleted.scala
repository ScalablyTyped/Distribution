package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistoryMessageDeleted extends StObject {
  
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaHistoryMessageDeleted {
  
  @scala.inline
  def apply(): SchemaHistoryMessageDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistoryMessageDeleted]
  }
  
  @scala.inline
  implicit class SchemaHistoryMessageDeletedMutableBuilder[Self <: SchemaHistoryMessageDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
