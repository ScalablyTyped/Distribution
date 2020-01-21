package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message containing the custome dimension.
  */
@js.native
trait SchemaCustomDimension extends js.Object {
  /**
    * Custom dimension name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Custom dimension value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCustomDimension {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomDimension]
  }
}

