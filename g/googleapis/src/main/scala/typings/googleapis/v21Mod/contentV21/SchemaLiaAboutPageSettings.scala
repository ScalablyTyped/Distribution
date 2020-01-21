package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaAboutPageSettings extends js.Object {
  /**
    * The status of the verification process for the About page.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The URL for the About page.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaLiaAboutPageSettings {
  @scala.inline
  def apply(status: String = null, url: String = null): SchemaLiaAboutPageSettings = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiaAboutPageSettings]
  }
}

