package typings.kendoUi.kendo

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends Class {
  
  def callback(url: String): Unit = js.native
  
  var route: RegExp = js.native
  
  def worksWith(url: String): Unit = js.native
}
object Route {
  
  @scala.inline
  def apply(callback: String => Unit, route: RegExp, worksWith: String => Unit): Route = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), route = route.asInstanceOf[js.Any], worksWith = js.Any.fromFunction1(worksWith))
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoute(value: RegExp): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksWith(value: String => Unit): Self = StObject.set(x, "worksWith", js.Any.fromFunction1(value))
  }
}
