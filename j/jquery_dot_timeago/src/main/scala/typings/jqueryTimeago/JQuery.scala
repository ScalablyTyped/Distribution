package typings.jqueryTimeago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def timeago(): JQuery
  @JSName("timeago")
  var timeago_Original: Timeago
}
object JQuery {
  
  inline def apply(timeago: () => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(timeago = js.Any.fromFunction0(timeago))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTimeago(value: () => JQuery): Self = StObject.set(x, "timeago", js.Any.fromFunction0(value))
  }
}
