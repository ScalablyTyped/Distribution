package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for social meta tag params. Used to set meta tag data for link
  * previews on social sites.
  */
@js.native
trait SchemaSocialMetaTagInfo extends js.Object {
  /**
    * A short description of the link. Optional.
    */
  var socialDescription: js.UndefOr[String] = js.native
  /**
    * An image url string. Optional.
    */
  var socialImageLink: js.UndefOr[String] = js.native
  /**
    * Title to be displayed. Optional.
    */
  var socialTitle: js.UndefOr[String] = js.native
}

object SchemaSocialMetaTagInfo {
  @scala.inline
  def apply(socialDescription: String = null, socialImageLink: String = null, socialTitle: String = null): SchemaSocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    if (socialDescription != null) __obj.updateDynamic("socialDescription")(socialDescription.asInstanceOf[js.Any])
    if (socialImageLink != null) __obj.updateDynamic("socialImageLink")(socialImageLink.asInstanceOf[js.Any])
    if (socialTitle != null) __obj.updateDynamic("socialTitle")(socialTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSocialMetaTagInfo]
  }
}

