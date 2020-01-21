package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an application category object.
  */
@js.native
trait SchemaApplicationCategory extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#applicationCategory.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The primary category.
    */
  var primary: js.UndefOr[String] = js.native
  /**
    * The secondary category.
    */
  var secondary: js.UndefOr[String] = js.native
}

object SchemaApplicationCategory {
  @scala.inline
  def apply(kind: String = null, primary: String = null, secondary: String = null): SchemaApplicationCategory = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationCategory]
  }
}

