package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of an InlineObject.
  */
@js.native
trait SchemaInlineObjectProperties extends js.Object {
  /**
    * The embedded object of this inline object.
    */
  var embeddedObject: js.UndefOr[SchemaEmbeddedObject] = js.native
}

object SchemaInlineObjectProperties {
  @scala.inline
  def apply(embeddedObject: SchemaEmbeddedObject = null): SchemaInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (embeddedObject != null) __obj.updateDynamic("embeddedObject")(embeddedObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInlineObjectProperties]
  }
}

