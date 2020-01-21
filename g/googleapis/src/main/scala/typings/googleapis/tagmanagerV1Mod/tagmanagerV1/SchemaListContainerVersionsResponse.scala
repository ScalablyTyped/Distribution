package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List container versions response.
  */
@js.native
trait SchemaListContainerVersionsResponse extends js.Object {
  /**
    * All versions of a GTM Container.
    */
  var containerVersion: js.UndefOr[js.Array[SchemaContainerVersion]] = js.native
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[SchemaContainerVersionHeader]] = js.native
}

object SchemaListContainerVersionsResponse {
  @scala.inline
  def apply(
    containerVersion: js.Array[SchemaContainerVersion] = null,
    containerVersionHeader: js.Array[SchemaContainerVersionHeader] = null
  ): SchemaListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (containerVersionHeader != null) __obj.updateDynamic("containerVersionHeader")(containerVersionHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListContainerVersionsResponse]
  }
}

