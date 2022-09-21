package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectChangeEvent extends StObject {
  
  var subject: String
}
object SubjectChangeEvent {
  
  inline def apply(subject: String): SubjectChangeEvent = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectChangeEvent]
  }
  
  extension [Self <: SubjectChangeEvent](x: Self) {
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
