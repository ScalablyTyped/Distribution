package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Position settings for text.
  */
@js.native
trait SchemaTextPosition extends js.Object {
  /**
    * Horizontal alignment setting for the piece of text.
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
}

object SchemaTextPosition {
  @scala.inline
  def apply(horizontalAlignment: String = null): SchemaTextPosition = {
    val __obj = js.Dynamic.literal()
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextPosition]
  }
}

