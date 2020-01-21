package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to create a short Dynamic Link.
  */
@js.native
trait SchemaCreateManagedShortLinkResponse extends js.Object {
  /**
    * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
    */
  var managedShortLink: js.UndefOr[SchemaManagedShortLink] = js.native
  /**
    * Preview link to show the link flow chart. (debug info.)
    */
  var previewLink: js.UndefOr[String] = js.native
  /**
    * Information about potential warnings on link creation.
    */
  var warning: js.UndefOr[js.Array[SchemaDynamicLinkWarning]] = js.native
}

object SchemaCreateManagedShortLinkResponse {
  @scala.inline
  def apply(
    managedShortLink: SchemaManagedShortLink = null,
    previewLink: String = null,
    warning: js.Array[SchemaDynamicLinkWarning] = null
  ): SchemaCreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (managedShortLink != null) __obj.updateDynamic("managedShortLink")(managedShortLink.asInstanceOf[js.Any])
    if (previewLink != null) __obj.updateDynamic("previewLink")(previewLink.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateManagedShortLinkResponse]
  }
}

