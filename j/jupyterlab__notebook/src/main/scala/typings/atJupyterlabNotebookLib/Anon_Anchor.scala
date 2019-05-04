package typings
package atJupyterlabNotebookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anchor extends js.Object {
  var anchor: scala.Double | scala.Null
  var head: scala.Double | scala.Null
}

object Anon_Anchor {
  @scala.inline
  def apply(anchor: scala.Int | scala.Double = null, head: scala.Int | scala.Double = null): Anon_Anchor = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Anchor]
  }
}

