package typings.jqueryTimeentry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var timeEntry: ITimeEntryStatic
}
object JQueryStatic {
  
  inline def apply(timeEntry: ITimeEntryStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(timeEntry = timeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setTimeEntry(value: ITimeEntryStatic): Self = StObject.set(x, "timeEntry", value.asInstanceOf[js.Any])
  }
}
