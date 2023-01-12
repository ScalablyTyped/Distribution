package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedPhoneNumber extends StObject {
  
  /** The phone number type, e.g., work, mobile, etc. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The actual phone number. */
  var value: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedPhoneNumber {
  
  inline def apply(): AppsDynamiteSharedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedPhoneNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedPhoneNumber] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
