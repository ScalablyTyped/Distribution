package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties that describe the style of a line.
  */
@js.native
trait SchemaLineStyle extends js.Object {
  /**
    * The dash type of the line.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The thickness of the line, in px.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaLineStyle {
  @scala.inline
  def apply(`type`: String = null, width: Int | Double = null): SchemaLineStyle = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLineStyle]
  }
}

