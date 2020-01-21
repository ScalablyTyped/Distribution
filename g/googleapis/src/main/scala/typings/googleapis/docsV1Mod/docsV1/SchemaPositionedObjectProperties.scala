package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of a PositionedObject.
  */
@js.native
trait SchemaPositionedObjectProperties extends js.Object {
  /**
    * The embedded object of this positioned object.
    */
  var embeddedObject: js.UndefOr[SchemaEmbeddedObject] = js.native
  /**
    * The positioning of this positioned object relative to the newline of the
    * Paragraph that references this positioned object.
    */
  var positioning: js.UndefOr[SchemaPositionedObjectPositioning] = js.native
}

object SchemaPositionedObjectProperties {
  @scala.inline
  def apply(embeddedObject: SchemaEmbeddedObject = null, positioning: SchemaPositionedObjectPositioning = null): SchemaPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (embeddedObject != null) __obj.updateDynamic("embeddedObject")(embeddedObject.asInstanceOf[js.Any])
    if (positioning != null) __obj.updateDynamic("positioning")(positioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPositionedObjectProperties]
  }
}

