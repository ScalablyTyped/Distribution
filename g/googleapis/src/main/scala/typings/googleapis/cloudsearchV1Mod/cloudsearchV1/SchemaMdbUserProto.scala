package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMdbUserProto extends StObject {
  
  /**
    * Do not set this field. Contact credentials-eng@ if you believe you absolutely need to use it. This is the @prod.google.com Gaia ID that corresponds to the MDB user, see go/authn-merge for details. This field may always be safely ignored when performing an authorization check.
    */
  var gaiaId: js.UndefOr[String | Null] = js.undefined
  
  var userName: js.UndefOr[String | Null] = js.undefined
}
object SchemaMdbUserProto {
  
  inline def apply(): SchemaMdbUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMdbUserProto]
  }
  
  extension [Self <: SchemaMdbUserProto](x: Self) {
    
    inline def setGaiaId(value: String): Self = StObject.set(x, "gaiaId", value.asInstanceOf[js.Any])
    
    inline def setGaiaIdNull: Self = StObject.set(x, "gaiaId", null)
    
    inline def setGaiaIdUndefined: Self = StObject.set(x, "gaiaId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
