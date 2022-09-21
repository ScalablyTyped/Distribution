package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountInfo extends StObject {
  
  /**
    * A set of accounts to search.
    */
  var emails: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAccountInfo {
  
  inline def apply(): SchemaAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountInfo]
  }
  
  extension [Self <: SchemaAccountInfo](x: Self) {
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsNull: Self = StObject.set(x, "emails", null)
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
  }
}
