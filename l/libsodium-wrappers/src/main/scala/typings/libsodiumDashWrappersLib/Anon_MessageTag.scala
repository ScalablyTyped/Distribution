package typings
package libsodiumDashWrappersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageTag extends js.Object {
  var message: java.lang.String
  var tag: scala.Double
}

object Anon_MessageTag {
  @scala.inline
  def apply(message: java.lang.String, tag: scala.Double): Anon_MessageTag = {
    val __obj = js.Dynamic.literal(message = message, tag = tag)
  
    __obj.asInstanceOf[Anon_MessageTag]
  }
}

