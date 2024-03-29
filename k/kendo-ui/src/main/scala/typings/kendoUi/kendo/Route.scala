package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route
  extends StObject
     with Class {
  
  def callback(url: String): Unit
  
  var route: js.RegExp
  
  def worksWith(url: String): Unit
}
object Route {
  
  inline def apply(callback: String => Unit, route: js.RegExp, worksWith: String => Unit): Route = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), route = route.asInstanceOf[js.Any], worksWith = js.Any.fromFunction1(worksWith))
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setRoute(value: js.RegExp): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setWorksWith(value: String => Unit): Self = StObject.set(x, "worksWith", js.Any.fromFunction1(value))
  }
}
