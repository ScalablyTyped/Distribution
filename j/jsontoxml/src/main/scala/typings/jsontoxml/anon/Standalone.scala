package typings.jsontoxml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Standalone extends js.Object {
  var standalone: js.UndefOr[Boolean] = js.undefined
}

object Standalone {
  @scala.inline
  def apply(standalone: js.UndefOr[Boolean] = js.undefined): Standalone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standalone]
  }
}

