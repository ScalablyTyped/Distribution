package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedJustificationPerson extends StObject {
  
  /** Whether the person is the recipient of the suggestions. */
  var isRecipient: js.UndefOr[Boolean] = js.undefined
  
  /** Obfuscated user ID. */
  var user: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object AppsDynamiteSharedJustificationPerson {
  
  inline def apply(): AppsDynamiteSharedJustificationPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedJustificationPerson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedJustificationPerson] (val x: Self) extends AnyVal {
    
    inline def setIsRecipient(value: Boolean): Self = StObject.set(x, "isRecipient", value.asInstanceOf[js.Any])
    
    inline def setIsRecipientUndefined: Self = StObject.set(x, "isRecipient", js.undefined)
    
    inline def setUser(value: AppsDynamiteUserId): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
