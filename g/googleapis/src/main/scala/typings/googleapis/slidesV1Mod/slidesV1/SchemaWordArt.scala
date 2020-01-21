package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing word art.
  */
@js.native
trait SchemaWordArt extends js.Object {
  /**
    * The text rendered as word art.
    */
  var renderedText: js.UndefOr[String] = js.native
}

object SchemaWordArt {
  @scala.inline
  def apply(renderedText: String = null): SchemaWordArt = {
    val __obj = js.Dynamic.literal()
    if (renderedText != null) __obj.updateDynamic("renderedText")(renderedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWordArt]
  }
}

