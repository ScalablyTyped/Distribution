package typings
package jsontoxmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Standalone extends js.Object {
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Standalone {
  @scala.inline
  def apply(standalone: js.UndefOr[scala.Boolean] = js.undefined): Anon_Standalone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    __obj.asInstanceOf[Anon_Standalone]
  }
}

