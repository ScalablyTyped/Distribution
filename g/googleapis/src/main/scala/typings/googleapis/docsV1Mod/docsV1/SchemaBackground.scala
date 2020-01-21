package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the background of a document.
  */
@js.native
trait SchemaBackground extends js.Object {
  /**
    * The background color.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.native
}

object SchemaBackground {
  @scala.inline
  def apply(color: SchemaOptionalColor = null): SchemaBackground = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackground]
  }
}

