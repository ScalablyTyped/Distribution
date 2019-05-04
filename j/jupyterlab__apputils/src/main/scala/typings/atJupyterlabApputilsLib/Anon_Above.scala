package typings
package atJupyterlabApputilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Above extends js.Object {
  var above: js.UndefOr[scala.Double] = js.undefined
  var below: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Above {
  @scala.inline
  def apply(above: scala.Int | scala.Double = null, below: scala.Int | scala.Double = null): Anon_Above = {
    val __obj = js.Dynamic.literal()
    if (above != null) __obj.updateDynamic("above")(above.asInstanceOf[js.Any])
    if (below != null) __obj.updateDynamic("below")(below.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Above]
  }
}

