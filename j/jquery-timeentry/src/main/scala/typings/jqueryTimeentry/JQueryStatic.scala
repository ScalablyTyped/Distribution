package typings.jqueryTimeentry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var timeEntry: ITimeEntryStatic = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(timeEntry: ITimeEntryStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(timeEntry = timeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeEntry(value: ITimeEntryStatic): Self = StObject.set(x, "timeEntry", value.asInstanceOf[js.Any])
  }
}
