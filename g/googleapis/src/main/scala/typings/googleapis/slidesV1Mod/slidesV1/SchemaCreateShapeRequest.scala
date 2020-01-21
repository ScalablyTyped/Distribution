package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new shape.
  */
@js.native
trait SchemaCreateShapeRequest extends js.Object {
  /**
    * The element properties for the shape.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50. If empty, a unique identifier
    * will be generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The shape type.
    */
  var shapeType: js.UndefOr[String] = js.native
}

object SchemaCreateShapeRequest {
  @scala.inline
  def apply(
    elementProperties: SchemaPageElementProperties = null,
    objectId: String = null,
    shapeType: String = null
  ): SchemaCreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (shapeType != null) __obj.updateDynamic("shapeType")(shapeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateShapeRequest]
  }
}

