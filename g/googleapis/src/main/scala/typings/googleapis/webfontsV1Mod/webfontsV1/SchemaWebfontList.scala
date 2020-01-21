package typings.googleapis.webfontsV1Mod.webfontsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWebfontList extends js.Object {
  /**
    * The list of fonts currently served by the Google Fonts API.
    */
  var items: js.UndefOr[js.Array[SchemaWebfont]] = js.native
  /**
    * This kind represents a list of webfont objects in the webfonts service.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaWebfontList {
  @scala.inline
  def apply(items: js.Array[SchemaWebfont] = null, kind: String = null): SchemaWebfontList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebfontList]
  }
}

