package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents auto text.
  */
@js.native
trait SchemaAutoText extends js.Object {
  /**
    * The rendered content of this auto text, if available.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The styling applied to this auto text.
    */
  var style: js.UndefOr[SchemaTextStyle] = js.native
  /**
    * The type of this auto text.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAutoText {
  @scala.inline
  def apply(content: String = null, style: SchemaTextStyle = null, `type`: String = null): SchemaAutoText = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoText]
  }
}

