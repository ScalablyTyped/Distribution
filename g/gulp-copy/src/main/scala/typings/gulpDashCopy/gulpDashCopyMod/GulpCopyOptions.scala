package typings.gulpDashCopy.gulpDashCopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpCopyOptions extends js.Object {
  /**
    * Specifies the number of parts of the path to be ignored as path prefixes.
    */
  var prefix: Double
}

object GulpCopyOptions {
  @scala.inline
  def apply(prefix: Double): GulpCopyOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GulpCopyOptions]
  }
}

