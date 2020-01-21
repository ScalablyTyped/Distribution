package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A border around a paragraph.
  */
@js.native
trait SchemaParagraphBorder extends js.Object {
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.native
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The padding of the border.
    */
  var padding: js.UndefOr[SchemaDimension] = js.native
  /**
    * The width of the border.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}

object SchemaParagraphBorder {
  @scala.inline
  def apply(
    color: SchemaOptionalColor = null,
    dashStyle: String = null,
    padding: SchemaDimension = null,
    width: SchemaDimension = null
  ): SchemaParagraphBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParagraphBorder]
  }
}

