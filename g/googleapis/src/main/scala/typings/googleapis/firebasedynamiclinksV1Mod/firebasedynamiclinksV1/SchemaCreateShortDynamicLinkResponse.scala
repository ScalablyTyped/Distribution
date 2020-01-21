package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to create a short Dynamic Link.
  */
@js.native
trait SchemaCreateShortDynamicLinkResponse extends js.Object {
  /**
    * Preview link to show the link flow chart. (debug info.)
    */
  var previewLink: js.UndefOr[String] = js.native
  /**
    * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
    */
  var shortLink: js.UndefOr[String] = js.native
  /**
    * Information about potential warnings on link creation.
    */
  var warning: js.UndefOr[js.Array[SchemaDynamicLinkWarning]] = js.native
}

object SchemaCreateShortDynamicLinkResponse {
  @scala.inline
  def apply(
    previewLink: String = null,
    shortLink: String = null,
    warning: js.Array[SchemaDynamicLinkWarning] = null
  ): SchemaCreateShortDynamicLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (previewLink != null) __obj.updateDynamic("previewLink")(previewLink.asInstanceOf[js.Any])
    if (shortLink != null) __obj.updateDynamic("shortLink")(shortLink.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateShortDynamicLinkResponse]
  }
}

