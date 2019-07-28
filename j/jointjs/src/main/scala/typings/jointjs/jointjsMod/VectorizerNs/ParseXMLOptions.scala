package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseXMLOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
}

object ParseXMLOptions {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined): ParseXMLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    __obj.asInstanceOf[ParseXMLOptions]
  }
}

