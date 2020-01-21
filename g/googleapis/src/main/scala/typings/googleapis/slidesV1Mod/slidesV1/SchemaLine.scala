package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a non-connector line, straight connector,
  * curved connector, or bent connector.
  */
@js.native
trait SchemaLine extends js.Object {
  /**
    * The category of the line.  It matches the `category` specified in
    * CreateLineRequest, and can be updated with UpdateLineCategoryRequest.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * The properties of the line.
    */
  var lineProperties: js.UndefOr[SchemaLineProperties] = js.native
  /**
    * The type of the line.
    */
  var lineType: js.UndefOr[String] = js.native
}

object SchemaLine {
  @scala.inline
  def apply(lineCategory: String = null, lineProperties: SchemaLineProperties = null, lineType: String = null): SchemaLine = {
    val __obj = js.Dynamic.literal()
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory.asInstanceOf[js.Any])
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLine]
  }
}

