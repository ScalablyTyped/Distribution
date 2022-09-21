package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountGoogleMyBusinessLink extends StObject {
  
  /**
    * The ID of the Business Profile. If this is provided, then `gmbEmail` is ignored. The value of this field should match the `accountId` used by the Business Profile API.
    */
  var gmbAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Business Profile email address of a specific account within a Business Profile. A sample account within a Business Profile could be a business account with set of locations, managed under the Business Profile.
    */
  var gmbEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the link between this Merchant Center account and the Business Profile. Acceptable values are: - "`active`" - "`pending`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountGoogleMyBusinessLink {
  
  inline def apply(): SchemaAccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountGoogleMyBusinessLink]
  }
  
  extension [Self <: SchemaAccountGoogleMyBusinessLink](x: Self) {
    
    inline def setGmbAccountId(value: String): Self = StObject.set(x, "gmbAccountId", value.asInstanceOf[js.Any])
    
    inline def setGmbAccountIdNull: Self = StObject.set(x, "gmbAccountId", null)
    
    inline def setGmbAccountIdUndefined: Self = StObject.set(x, "gmbAccountId", js.undefined)
    
    inline def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    inline def setGmbEmailNull: Self = StObject.set(x, "gmbEmail", null)
    
    inline def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
