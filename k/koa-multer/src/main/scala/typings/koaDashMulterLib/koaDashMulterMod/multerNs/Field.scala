package typings
package koaDashMulterLib.koaDashMulterMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /** Optional maximum number of files per field to accept. */
  var maxCount: js.UndefOr[scala.Double] = js.undefined
  /** The field name. */
  var name: java.lang.String
}

object Field {
  @scala.inline
  def apply(name: java.lang.String, maxCount: scala.Int | scala.Double = null): Field = {
    val __obj = js.Dynamic.literal(name = name)
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

