package typings.jsoneditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.Array[String]
  var startFrom: Double
}

object Options {
  @scala.inline
  def apply(options: js.Array[String], startFrom: Double): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

