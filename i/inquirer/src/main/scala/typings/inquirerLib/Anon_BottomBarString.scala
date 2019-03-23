package typings
package inquirerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomBarString extends js.Object {
  var bottomBar: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BottomBarString {
  @scala.inline
  def apply(bottomBar: java.lang.String = null): Anon_BottomBarString = {
    val __obj = js.Dynamic.literal()
    if (bottomBar != null) __obj.updateDynamic("bottomBar")(bottomBar)
    __obj.asInstanceOf[Anon_BottomBarString]
  }
}

