package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Etag extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var modified: js.UndefOr[String] = js.undefined
  var vary: js.UndefOr[Boolean] = js.undefined
}

object Anon_Etag {
  @scala.inline
  def apply(etag: String = null, modified: String = null, vary: js.UndefOr[Boolean] = js.undefined): Anon_Etag = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (modified != null) __obj.updateDynamic("modified")(modified)
    if (!js.isUndefined(vary)) __obj.updateDynamic("vary")(vary)
    __obj.asInstanceOf[Anon_Etag]
  }
}

