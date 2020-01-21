package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A width and height.
  */
@js.native
trait SchemaSize extends js.Object {
  /**
    * The height of the object.
    */
  var height: js.UndefOr[SchemaDimension] = js.native
  /**
    * The width of the object.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}

object SchemaSize {
  @scala.inline
  def apply(height: SchemaDimension = null, width: SchemaDimension = null): SchemaSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSize]
  }
}

