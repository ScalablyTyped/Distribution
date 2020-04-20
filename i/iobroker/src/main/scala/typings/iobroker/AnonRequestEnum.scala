package typings.iobroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequestEnum extends js.Object {
  var requestEnum: String
  var result: Record[String, _]
}

object AnonRequestEnum {
  @scala.inline
  def apply(requestEnum: String, result: Record[String, _]): AnonRequestEnum = {
    val __obj = js.Dynamic.literal(requestEnum = requestEnum.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequestEnum]
  }
}

