package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object Anon_Connection {
  @scala.inline
  def apply(connection: String = null, direction: String = null, duration: Int | Double = null): Anon_Connection = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Connection]
  }
}

