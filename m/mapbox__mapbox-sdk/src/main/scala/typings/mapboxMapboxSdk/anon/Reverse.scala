package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reverse extends js.Object {
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object Reverse {
  @scala.inline
  def apply(reverse: js.UndefOr[Boolean] = js.undefined): Reverse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reverse]
  }
}

