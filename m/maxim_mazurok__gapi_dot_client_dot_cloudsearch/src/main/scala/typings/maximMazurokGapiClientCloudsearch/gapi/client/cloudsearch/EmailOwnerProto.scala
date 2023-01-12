package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailOwnerProto extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
}
object EmailOwnerProto {
  
  inline def apply(): EmailOwnerProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOwnerProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailOwnerProto] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
