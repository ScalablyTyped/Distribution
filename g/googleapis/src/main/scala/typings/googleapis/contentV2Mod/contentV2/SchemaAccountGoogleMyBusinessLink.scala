package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountGoogleMyBusinessLink extends StObject {
  
  /**
    * The GMB email address of which a specific account within a GMB account. A sample account within a GMB account could be a business account with set of locations, managed under the GMB account.
    */
  var gmbEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the link between this Merchant Center account and the GMB account. Acceptable values are: - "`active`" - "`pending`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountGoogleMyBusinessLink {
  
  inline def apply(): SchemaAccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountGoogleMyBusinessLink]
  }
  
  extension [Self <: SchemaAccountGoogleMyBusinessLink](x: Self) {
    
    inline def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    inline def setGmbEmailNull: Self = StObject.set(x, "gmbEmail", null)
    
    inline def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
