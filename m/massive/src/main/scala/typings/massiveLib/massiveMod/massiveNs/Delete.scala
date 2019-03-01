package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UPDATE query. */
trait Delete extends js.Object {
  /** Format this object into a SQL SELECT. */
  def format(): java.lang.String
}

object Delete {
  @scala.inline
  def apply(format: js.Function0[java.lang.String]): Delete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[Delete]
  }
}

