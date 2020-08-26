package typings.leafletGpx.anon

import typings.leafletGpx.leafletGpxStrings.route
import typings.leafletGpx.leafletGpxStrings.track
import typings.leafletGpx.leafletGpxStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseElements extends js.Object {
  var parseElements: js.Tuple3[track, route, waypoint] = js.native
}

object ParseElements {
  @scala.inline
  def apply(parseElements: js.Tuple3[track, route, waypoint]): ParseElements = {
    val __obj = js.Dynamic.literal(parseElements = parseElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseElements]
  }
  @scala.inline
  implicit class ParseElementsOps[Self <: ParseElements] (val x: Self) extends AnyVal {
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
    def setParseElements(value: js.Tuple3[track, route, waypoint]): Self = this.set("parseElements", value.asInstanceOf[js.Any])
  }
  
}

