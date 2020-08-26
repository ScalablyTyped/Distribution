package typings.jointjs.mod.connectionPoints

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPointArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var anchor: DefaultConnectionPointArguments = js.native
  var bbox: StrokeConnectionPointArguments = js.native
  var boundary: BoundaryConnectionPointArguments = js.native
  var rectangle: StrokeConnectionPointArguments = js.native
}

object ConnectionPointArgumentsMap {
  @scala.inline
  def apply(
    anchor: DefaultConnectionPointArguments,
    bbox: StrokeConnectionPointArguments,
    boundary: BoundaryConnectionPointArguments,
    rectangle: StrokeConnectionPointArguments
  ): ConnectionPointArgumentsMap = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPointArgumentsMap]
  }
  @scala.inline
  implicit class ConnectionPointArgumentsMapOps[Self <: ConnectionPointArgumentsMap] (val x: Self) extends AnyVal {
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
    def setAnchor(value: DefaultConnectionPointArguments): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbox(value: StrokeConnectionPointArguments): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundary(value: BoundaryConnectionPointArguments): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectangle(value: StrokeConnectionPointArguments): Self = this.set("rectangle", value.asInstanceOf[js.Any])
  }
  
}

