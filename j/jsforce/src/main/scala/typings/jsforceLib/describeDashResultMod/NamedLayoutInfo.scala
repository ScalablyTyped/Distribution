package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedLayoutInfo extends js.Object {
  var name: java.lang.String
  var urls: stdLib.Record[java.lang.String, java.lang.String]
}

object NamedLayoutInfo {
  @scala.inline
  def apply(name: java.lang.String, urls: stdLib.Record[java.lang.String, java.lang.String]): NamedLayoutInfo = {
    val __obj = js.Dynamic.literal(name = name, urls = urls)
  
    __obj.asInstanceOf[NamedLayoutInfo]
  }
}

