package typings
package intercomDashClientLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagIdentifier extends js.Object {
  var id: java.lang.String
}

object TagIdentifier {
  @scala.inline
  def apply(id: java.lang.String): TagIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[TagIdentifier]
  }
}

