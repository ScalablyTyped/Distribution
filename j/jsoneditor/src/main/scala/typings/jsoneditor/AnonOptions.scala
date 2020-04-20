package typings.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.Array[String]
  var startFrom: Double
}

object AnonOptions {
  @scala.inline
  def apply(options: js.Array[String], startFrom: Double): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

