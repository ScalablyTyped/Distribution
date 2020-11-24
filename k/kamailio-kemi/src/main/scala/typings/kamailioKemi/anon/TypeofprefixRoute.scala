package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofprefixRoute extends js.Object {
  
  def prefix_route(ruser: String): Double = js.native
  
  def prefix_route_uri(): Double = js.native
}
object TypeofprefixRoute {
  
  @scala.inline
  def apply(prefix_route: String => Double, prefix_route_uri: () => Double): TypeofprefixRoute = {
    val __obj = js.Dynamic.literal(prefix_route = js.Any.fromFunction1(prefix_route), prefix_route_uri = js.Any.fromFunction0(prefix_route_uri))
    __obj.asInstanceOf[TypeofprefixRoute]
  }
  
  @scala.inline
  implicit class TypeofprefixRouteOps[Self <: TypeofprefixRoute] (val x: Self) extends AnyVal {
    
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
    def setPrefix_route(value: String => Double): Self = this.set("prefix_route", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefix_route_uri(value: () => Double): Self = this.set("prefix_route_uri", js.Any.fromFunction0(value))
  }
}
