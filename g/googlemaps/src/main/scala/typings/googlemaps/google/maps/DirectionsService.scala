package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsService extends js.Object {
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]
  ): Unit = js.native
}

object DirectionsService {
  @scala.inline
  def apply(
    route: (DirectionsRequest, js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]) => Unit
  ): DirectionsService = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[DirectionsService]
  }
  @scala.inline
  implicit class DirectionsServiceOps[Self <: DirectionsService] (val x: Self) extends AnyVal {
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
    def setRoute(
      value: (DirectionsRequest, js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]) => Unit
    ): Self = this.set("route", js.Any.fromFunction2(value))
  }
  
}

