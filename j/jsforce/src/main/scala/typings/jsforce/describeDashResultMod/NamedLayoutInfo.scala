package typings.jsforce.describeDashResultMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedLayoutInfo extends js.Object {
  var name: String
  var urls: Record[String, String]
}

object NamedLayoutInfo {
  @scala.inline
  def apply(name: String, urls: Record[String, String]): NamedLayoutInfo = {
    val __obj = js.Dynamic.literal(name = name, urls = urls)
  
    __obj.asInstanceOf[NamedLayoutInfo]
  }
}

