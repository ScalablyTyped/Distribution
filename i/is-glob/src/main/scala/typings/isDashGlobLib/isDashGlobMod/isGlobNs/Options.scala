package typings
package isDashGlobLib.isDashGlobMod.isGlobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When `false` the behavior is less strict in determining if a pattern is a glob. Meaning that some patterns
    * that would return false may return true. This is done so that matching libraries like micromatch
    * have a chance at determining if the pattern is a glob or not.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

