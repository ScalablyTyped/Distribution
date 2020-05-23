package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hapi extends js.Object {
  var hapi: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[String] = js.undefined
}

object Hapi {
  @scala.inline
  def apply(hapi: String = null, node: String = null): Hapi = {
    val __obj = js.Dynamic.literal()
    if (hapi != null) __obj.updateDynamic("hapi")(hapi.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hapi]
  }
}

