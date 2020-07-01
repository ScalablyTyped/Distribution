package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the bullet of a paragraph.
  */
@js.native
trait SchemaBullet extends js.Object {
  /**
    * The ID of the list this paragraph belongs to.
    */
  var listId: js.UndefOr[String] = js.native
  /**
    * The nesting level of this paragraph in the list.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
  /**
    * The paragraph specific text style applied to this bullet.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaBullet {
  @scala.inline
  def apply(
    listId: String = null,
    nestingLevel: js.UndefOr[Double] = js.undefined,
    textStyle: SchemaTextStyle = null
  ): SchemaBullet = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (!js.isUndefined(nestingLevel)) __obj.updateDynamic("nestingLevel")(nestingLevel.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBullet]
  }
}

