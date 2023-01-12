package typings.matrixJsSdk.anon

import typings.matrixJsSdk.mod.EventContentTypeMessage
import typings.matrixJsSdk.mod.EventType
import typings.matrixJsSdk.mod.MatrixEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Presence extends StObject {
  
  var presence: MatrixEvent[EventContentTypeMessage, EventType]
}
object Presence {
  
  inline def apply(presence: MatrixEvent[EventContentTypeMessage, EventType]): Presence = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Presence] (val x: Self) extends AnyVal {
    
    inline def setPresence(value: MatrixEvent[EventContentTypeMessage, EventType]): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
  }
}
