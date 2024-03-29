package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAccountUsersResponse extends StObject {
  
  /**
    * All GTM AccountUsers of a GTM Account.
    */
  var userAccess: js.UndefOr[js.Array[SchemaUserAccess]] = js.undefined
}
object SchemaListAccountUsersResponse {
  
  inline def apply(): SchemaListAccountUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountUsersResponse]
  }
  
  extension [Self <: SchemaListAccountUsersResponse](x: Self) {
    
    inline def setUserAccess(value: js.Array[SchemaUserAccess]): Self = StObject.set(x, "userAccess", value.asInstanceOf[js.Any])
    
    inline def setUserAccessUndefined: Self = StObject.set(x, "userAccess", js.undefined)
    
    inline def setUserAccessVarargs(value: SchemaUserAccess*): Self = StObject.set(x, "userAccess", js.Array(value*))
  }
}
