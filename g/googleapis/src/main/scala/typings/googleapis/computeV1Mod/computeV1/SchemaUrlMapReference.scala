package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapReference extends js.Object {
  var urlMap: js.UndefOr[String] = js.native
}

object SchemaUrlMapReference {
  @scala.inline
  def apply(urlMap: String = null): SchemaUrlMapReference = {
    val __obj = js.Dynamic.literal()
    if (urlMap != null) __obj.updateDynamic("urlMap")(urlMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlMapReference]
  }
}

