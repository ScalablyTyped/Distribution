package typings.jqueryTimeago

import typings.std.Date
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def timeago(timestamp: String): String
  def timeago(timestamp: Double): String
  def timeago(timestamp: JQuery): String
  def timeago(timestamp: Date): String
  def timeago(timestamp: Element): String
  @JSName("timeago")
  var timeago_Original: TimeagoStatic
}
object JQueryStatic {
  
  inline def apply(timeago: TimeagoStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(timeago = timeago.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setTimeago(value: TimeagoStatic): Self = StObject.set(x, "timeago", value.asInstanceOf[js.Any])
  }
}
