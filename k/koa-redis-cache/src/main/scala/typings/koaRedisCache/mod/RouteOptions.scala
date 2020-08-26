package typings.koaRedisCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptions extends js.Object {
  /**
    * expiration time in seconds for cached responses for the route
    */
  var expire: js.UndefOr[Double] = js.native
  /**
    * the route to cache, example: '/api/(.*)'
    */
  var route: String = js.native
}

object RouteOptions {
  @scala.inline
  def apply(route: String): RouteOptions = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
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
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
  }
  
}

