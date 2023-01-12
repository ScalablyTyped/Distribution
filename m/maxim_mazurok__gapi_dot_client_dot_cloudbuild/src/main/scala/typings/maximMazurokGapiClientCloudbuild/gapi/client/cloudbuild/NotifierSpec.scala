package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifierSpec extends StObject {
  
  /** The configuration of this particular notifier. */
  var notification: js.UndefOr[Notification] = js.undefined
  
  /** Configurations for secret resources used by this particular notifier. */
  var secrets: js.UndefOr[js.Array[NotifierSecret]] = js.undefined
}
object NotifierSpec {
  
  inline def apply(): NotifierSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifierSpec] (val x: Self) extends AnyVal {
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setSecrets(value: js.Array[NotifierSecret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecretsVarargs(value: NotifierSecret*): Self = StObject.set(x, "secrets", js.Array(value*))
  }
}
