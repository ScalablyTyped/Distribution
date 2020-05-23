package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamesAbbr extends js.Object {
  var names: js.Array[String]
  var namesAbbr: js.Array[String]
}

object NamesAbbr {
  @scala.inline
  def apply(names: js.Array[String], namesAbbr: js.Array[String]): NamesAbbr = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], namesAbbr = namesAbbr.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamesAbbr]
  }
}

