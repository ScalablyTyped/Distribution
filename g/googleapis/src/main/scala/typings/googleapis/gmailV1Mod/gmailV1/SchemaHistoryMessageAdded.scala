package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistoryMessageAdded extends StObject {
  
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaHistoryMessageAdded {
  
  inline def apply(): SchemaHistoryMessageAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistoryMessageAdded]
  }
  
  extension [Self <: SchemaHistoryMessageAdded](x: Self) {
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
