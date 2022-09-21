package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserMentionData extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the principal is backed by a gaia id, DO NOT use this field. Use user_gaia_id/user_id fields instead.
    */
  var user: js.UndefOr[SchemaPrincipalProto] = js.undefined
  
  /**
    * An unobfuscated gaia ID:
    */
  var userGaiaId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An obfuscated gaia ID:
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserMentionData {
  
  inline def apply(): SchemaUserMentionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserMentionData]
  }
  
  extension [Self <: SchemaUserMentionData](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUser(value: SchemaPrincipalProto): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserGaiaId(value: String): Self = StObject.set(x, "userGaiaId", value.asInstanceOf[js.Any])
    
    inline def setUserGaiaIdNull: Self = StObject.set(x, "userGaiaId", null)
    
    inline def setUserGaiaIdUndefined: Self = StObject.set(x, "userGaiaId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
