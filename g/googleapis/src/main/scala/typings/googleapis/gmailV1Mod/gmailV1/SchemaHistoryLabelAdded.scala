package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistoryLabelAdded extends StObject {
  
  /**
    * Label IDs added to the message.
    */
  var labelIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaHistoryLabelAdded {
  
  inline def apply(): SchemaHistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistoryLabelAdded]
  }
  
  extension [Self <: SchemaHistoryLabelAdded](x: Self) {
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsNull: Self = StObject.set(x, "labelIds", null)
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
