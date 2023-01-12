package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailPreferences extends StObject {
  
  /** If true, email notifications will be sent on transfer run failures. */
  var enableFailureEmail: js.UndefOr[Boolean] = js.undefined
}
object EmailPreferences {
  
  inline def apply(): EmailPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailPreferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailPreferences] (val x: Self) extends AnyVal {
    
    inline def setEnableFailureEmail(value: Boolean): Self = StObject.set(x, "enableFailureEmail", value.asInstanceOf[js.Any])
    
    inline def setEnableFailureEmailUndefined: Self = StObject.set(x, "enableFailureEmail", js.undefined)
  }
}
