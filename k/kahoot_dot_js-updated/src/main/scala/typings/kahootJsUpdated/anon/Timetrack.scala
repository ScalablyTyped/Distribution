package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timetrack extends StObject {
  
  /** Unix timestamp when the server received the message */
  var timetrack: Double
}
object Timetrack {
  
  inline def apply(timetrack: Double): Timetrack = {
    val __obj = js.Dynamic.literal(timetrack = timetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timetrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timetrack] (val x: Self) extends AnyVal {
    
    inline def setTimetrack(value: Double): Self = StObject.set(x, "timetrack", value.asInstanceOf[js.Any])
  }
}
