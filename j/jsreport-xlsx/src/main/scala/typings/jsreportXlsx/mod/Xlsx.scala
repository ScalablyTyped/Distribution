package typings.jsreportXlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xlsx extends js.Object {
  var shortid: String
}

object Xlsx {
  @scala.inline
  def apply(shortid: String): Xlsx = {
    val __obj = js.Dynamic.literal(shortid = shortid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xlsx]
  }
}

