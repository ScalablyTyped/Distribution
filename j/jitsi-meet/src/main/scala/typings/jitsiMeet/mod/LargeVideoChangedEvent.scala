package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeVideoChangedEvent extends StObject {
  
  var id: String
}
object LargeVideoChangedEvent {
  
  inline def apply(id: String): LargeVideoChangedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargeVideoChangedEvent]
  }
  
  extension [Self <: LargeVideoChangedEvent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
