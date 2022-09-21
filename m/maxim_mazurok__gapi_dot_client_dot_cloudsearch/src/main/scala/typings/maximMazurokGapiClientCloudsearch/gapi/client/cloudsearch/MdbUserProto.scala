package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MdbUserProto extends StObject {
  
  /**
    * Do not set this field. Contact credentials-eng@ if you believe you absolutely need to use it. This is the @prod.google.com Gaia ID that corresponds to the MDB user, see
    * go/authn-merge for details. This field may always be safely ignored when performing an authorization check.
    */
  var gaiaId: js.UndefOr[String] = js.undefined
  
  var userName: js.UndefOr[String] = js.undefined
}
object MdbUserProto {
  
  inline def apply(): MdbUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MdbUserProto]
  }
  
  extension [Self <: MdbUserProto](x: Self) {
    
    inline def setGaiaId(value: String): Self = StObject.set(x, "gaiaId", value.asInstanceOf[js.Any])
    
    inline def setGaiaIdUndefined: Self = StObject.set(x, "gaiaId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
