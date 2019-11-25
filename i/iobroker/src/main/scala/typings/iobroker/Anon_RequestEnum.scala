package typings.iobroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestEnum extends js.Object {
  var requestEnum: String
  var result: Record[String, _]
}

object Anon_RequestEnum {
  @scala.inline
  def apply(requestEnum: String, result: Record[String, _]): Anon_RequestEnum = {
    val __obj = js.Dynamic.literal(requestEnum = requestEnum.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RequestEnum]
  }
}

