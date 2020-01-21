package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a generic shape that does not have a more
  * specific classification.
  */
@js.native
trait SchemaShape extends js.Object {
  /**
    * Placeholders are shapes that are inherit from corresponding placeholders
    * on layouts and masters.  If set, the shape is a placeholder shape and any
    * inherited properties can be resolved by looking at the parent placeholder
    * identified by the Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[SchemaPlaceholder] = js.native
  /**
    * The properties of the shape.
    */
  var shapeProperties: js.UndefOr[SchemaShapeProperties] = js.native
  /**
    * The type of the shape.
    */
  var shapeType: js.UndefOr[String] = js.native
  /**
    * The text content of the shape.
    */
  var text: js.UndefOr[SchemaTextContent] = js.native
}

object SchemaShape {
  @scala.inline
  def apply(
    placeholder: SchemaPlaceholder = null,
    shapeProperties: SchemaShapeProperties = null,
    shapeType: String = null,
    text: SchemaTextContent = null
  ): SchemaShape = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties.asInstanceOf[js.Any])
    if (shapeType != null) __obj.updateDynamic("shapeType")(shapeType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShape]
  }
}

