package typings.kendoUi.kendo

import typings.std.RegExp
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
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: String => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoute(value: RegExp): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksWith(value: String => Unit): Self = this.set("worksWith", js.Any.fromFunction1(value))
  }
}
