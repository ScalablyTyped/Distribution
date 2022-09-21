package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSendAsResponse extends StObject {
  
  /**
    * List of send-as aliases.
    */
  var sendAs: js.UndefOr[js.Array[SchemaSendAs]] = js.undefined
}
object SchemaListSendAsResponse {
  
  inline def apply(): SchemaListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSendAsResponse]
  }
  
  extension [Self <: SchemaListSendAsResponse](x: Self) {
    
    inline def setSendAs(value: js.Array[SchemaSendAs]): Self = StObject.set(x, "sendAs", value.asInstanceOf[js.Any])
    
    inline def setSendAsUndefined: Self = StObject.set(x, "sendAs", js.undefined)
    
    inline def setSendAsVarargs(value: SchemaSendAs*): Self = StObject.set(x, "sendAs", js.Array(value*))
  }
}
