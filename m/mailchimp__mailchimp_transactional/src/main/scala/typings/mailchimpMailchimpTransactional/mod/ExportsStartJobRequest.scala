package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportsStartJobRequest
  extends StObject
     with BaseRequest {
  
  /** an optional email address to notify when the export job has finished. */
  var notify_email: js.UndefOr[String] = js.undefined
}
object ExportsStartJobRequest {
  
  inline def apply(): ExportsStartJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportsStartJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportsStartJobRequest] (val x: Self) extends AnyVal {
    
    inline def setNotify_email(value: String): Self = StObject.set(x, "notify_email", value.asInstanceOf[js.Any])
    
    inline def setNotify_emailUndefined: Self = StObject.set(x, "notify_email", js.undefined)
  }
}
