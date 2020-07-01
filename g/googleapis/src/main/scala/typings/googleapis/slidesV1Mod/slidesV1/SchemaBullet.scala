package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the bullet of a paragraph.
  */
@js.native
trait SchemaBullet extends js.Object {
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var bulletStyle: js.UndefOr[SchemaTextStyle] = js.native
  /**
    * The rendered bullet glyph for this paragraph.
    */
  var glyph: js.UndefOr[String] = js.native
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String] = js.native
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
}

object SchemaBullet {
  @scala.inline
  def apply(
    bulletStyle: SchemaTextStyle = null,
    glyph: String = null,
    listId: String = null,
    nestingLevel: js.UndefOr[Double] = js.undefined
  ): SchemaBullet = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (!js.isUndefined(nestingLevel)) __obj.updateDynamic("nestingLevel")(nestingLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBullet]
  }
}

