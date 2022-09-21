package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrimaryAdmin extends StObject {
  
  /**
    * The business email of the primary administrator of the customer. The email verification link is sent to this email address at the time of customer creation. Primary administrators have access to the customer's Admin Console, including the ability to invite and evict users and manage the administrative needs of the customer.
    */
  var primaryEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrimaryAdmin {
  
  inline def apply(): SchemaPrimaryAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrimaryAdmin]
  }
  
  extension [Self <: SchemaPrimaryAdmin](x: Self) {
    
    inline def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailNull: Self = StObject.set(x, "primaryEmail", null)
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
  }
}
