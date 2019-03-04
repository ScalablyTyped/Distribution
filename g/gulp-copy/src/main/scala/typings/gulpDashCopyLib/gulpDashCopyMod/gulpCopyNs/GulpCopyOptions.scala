package typings
package gulpDashCopyLib.gulpDashCopyMod.gulpCopyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpCopyOptions extends js.Object {
  /**
    * Specifies the number of parts of the path to be ignored as path prefixes.
    */
  var prefix: scala.Double
}

object GulpCopyOptions {
  @scala.inline
  def apply(prefix: scala.Double): GulpCopyOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix)
  
    __obj.asInstanceOf[GulpCopyOptions]
  }
}

