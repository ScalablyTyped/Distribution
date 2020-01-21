package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The shading of a paragraph.
  */
@js.native
trait SchemaShading extends js.Object {
  /**
    * The background color of this paragraph shading.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.native
}

object SchemaShading {
  @scala.inline
  def apply(backgroundColor: SchemaOptionalColor = null): SchemaShading = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShading]
  }
}

