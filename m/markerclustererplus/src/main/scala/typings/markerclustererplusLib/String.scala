package typings
package markerclustererplusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def trim(): java.lang.String
}

object String {
  @scala.inline
  def apply(trim: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(trim = js.Any.fromFunction0(trim))
  
    __obj.asInstanceOf[String]
  }
}

