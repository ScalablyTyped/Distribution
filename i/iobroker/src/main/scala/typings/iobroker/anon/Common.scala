package typings.iobroker.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Common extends js.Object {
  var common: Record[String, _]
  var native: Record[String, _]
}

object Common {
  @scala.inline
  def apply(common: Record[String, _], native: Record[String, _]): Common = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
}

