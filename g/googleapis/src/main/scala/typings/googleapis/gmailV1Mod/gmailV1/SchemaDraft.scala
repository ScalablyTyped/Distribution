package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A draft email in the user&#39;s mailbox.
  */
trait SchemaDraft extends StObject {
  
  /**
    * The immutable ID of the draft.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The message content of the draft.
    */
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaDraft {
  
  inline def apply(): SchemaDraft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDraft]
  }
  
  extension [Self <: SchemaDraft](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
