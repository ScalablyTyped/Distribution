package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeedbackSubmittedEvent extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
}
object FeedbackSubmittedEvent {
  
  inline def apply(): FeedbackSubmittedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackSubmittedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeedbackSubmittedEvent] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
