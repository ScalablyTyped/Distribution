package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hapi extends js.Object {
  var hapi: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[String] = js.undefined
}

object Anon_Hapi {
  @scala.inline
  def apply(hapi: String = null, node: String = null): Anon_Hapi = {
    val __obj = js.Dynamic.literal()
    if (hapi != null) __obj.updateDynamic("hapi")(hapi)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[Anon_Hapi]
  }
}

