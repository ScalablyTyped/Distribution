package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocked resource.
  */
@js.native
trait SchemaBlockedResource extends js.Object {
  /**
    * URL of the blocked resource.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaBlockedResource {
  @scala.inline
  def apply(url: String = null): SchemaBlockedResource = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBlockedResource]
  }
}

