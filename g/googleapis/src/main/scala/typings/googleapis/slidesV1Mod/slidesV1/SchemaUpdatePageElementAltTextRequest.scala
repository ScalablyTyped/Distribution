package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the alt text title and/or description of a page element.
  */
@js.native
trait SchemaUpdatePageElementAltTextRequest extends js.Object {
  /**
    * The updated alt text description of the page element. If unset the
    * existing value will be maintained. The description is exposed to screen
    * readers and other accessibility interfaces. Only use human readable
    * values related to the content of the page element.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The object ID of the page element the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The updated alt text title of the page element. If unset the existing
    * value will be maintained. The title is exposed to screen readers and
    * other accessibility interfaces. Only use human readable values related to
    * the content of the page element.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaUpdatePageElementAltTextRequest {
  @scala.inline
  def apply(description: String = null, objectId: String = null, title: String = null): SchemaUpdatePageElementAltTextRequest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdatePageElementAltTextRequest]
  }
}

