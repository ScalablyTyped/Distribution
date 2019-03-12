package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UPDATE query. */
trait Update extends js.Object {
  /** Format this object into a SQL SELECT. */
  def format(): java.lang.String
}

object Update {
  @scala.inline
  def apply(format: () => java.lang.String): Update = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction0(format))
  
    __obj.asInstanceOf[Update]
  }
}

