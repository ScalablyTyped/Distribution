package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Screen orientation of the device.
  */
@js.native
trait SchemaOrientation extends js.Object {
  /**
    * The id for this orientation. Example: &quot;portrait&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A human-friendly name for this orientation. Example:
    * &quot;portrait&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Tags for this dimension. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOrientation {
  @scala.inline
  def apply(id: String = null, name: String = null, tags: js.Array[String] = null): SchemaOrientation = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrientation]
  }
}

