package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.route
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A route represents a single set of stations, of a single line.
  */
@js.native
trait Route extends js.Object {
  var id: String = js.native
  var line: String = js.native
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking = js.native
  /** stop ids */
  var stops: js.Array[String] = js.native
  var `type`: route = js.native
}

object Route {
  @scala.inline
  def apply(
    id: String,
    line: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    stops: js.Array[String],
    `type`: route
  ): Route = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopsVarargs(value: String*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[String]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: route): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

