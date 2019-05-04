package typings
package atJupyterlabApputilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Horizontal extends js.Object {
  var horizontal: js.UndefOr[scala.Double] = js.undefined
  var vertical: js.UndefOr[Anon_Above] = js.undefined
}

object Anon_Horizontal {
  @scala.inline
  def apply(horizontal: scala.Int | scala.Double = null, vertical: Anon_Above = null): Anon_Horizontal = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[Anon_Horizontal]
  }
}

