package typings.jqueryCycle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def cycle(): JQuery
  def cycle(fx: String): JQuery
  def cycle(options: CycleOptions): JQuery
  @JSName("cycle")
  var cycle_Original: Cycle
}
object JQuery {
  
  @scala.inline
  def apply(cycle: Cycle): JQuery = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCycle(value: Cycle): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
  }
}
