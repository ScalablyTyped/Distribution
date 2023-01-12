package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccount extends StObject {
  
  /** Credentials that can be used to authenticate as this ServiceAccount. */
  var key: js.UndefOr[ServiceAccountKey] = js.undefined
  
  /** The account name of the service account, in the form of an email address. Assigned by the server. */
  var name: js.UndefOr[String] = js.undefined
}
object ServiceAccount {
  
  inline def apply(): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceAccount] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ServiceAccountKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
