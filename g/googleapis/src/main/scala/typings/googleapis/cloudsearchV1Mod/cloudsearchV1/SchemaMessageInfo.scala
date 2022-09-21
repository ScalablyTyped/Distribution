package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageInfo extends StObject {
  
  /**
    * The content of a matching message.
    */
  var message: js.UndefOr[SchemaMessage] = js.undefined
  
  /**
    * Searcher's membership state in the space where the message is posted.
    */
  var searcherMembershipState: js.UndefOr[String | Null] = js.undefined
}
object SchemaMessageInfo {
  
  inline def apply(): SchemaMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageInfo]
  }
  
  extension [Self <: SchemaMessageInfo](x: Self) {
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSearcherMembershipState(value: String): Self = StObject.set(x, "searcherMembershipState", value.asInstanceOf[js.Any])
    
    inline def setSearcherMembershipStateNull: Self = StObject.set(x, "searcherMembershipState", null)
    
    inline def setSearcherMembershipStateUndefined: Self = StObject.set(x, "searcherMembershipState", js.undefined)
  }
}
