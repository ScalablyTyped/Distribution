package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common properties for a page element.  Note: When you initially create a
  * PageElement, the API may modify the values of both `size` and `transform`,
  * but the visual size will be unchanged.
  */
@js.native
trait SchemaPageElementProperties extends js.Object {
  /**
    * The object ID of the page where the element is located.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * The size of the element.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * The transform for the element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
}

object SchemaPageElementProperties {
  @scala.inline
  def apply(pageObjectId: String = null, size: SchemaSize = null, transform: SchemaAffineTransform = null): SchemaPageElementProperties = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageElementProperties]
  }
}

