package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHapi extends js.Object {
  var hapi: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[String] = js.undefined
}

object AnonHapi {
  @scala.inline
  def apply(hapi: String = null, node: String = null): AnonHapi = {
    val __obj = js.Dynamic.literal()
    if (hapi != null) __obj.updateDynamic("hapi")(hapi.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHapi]
  }
}

