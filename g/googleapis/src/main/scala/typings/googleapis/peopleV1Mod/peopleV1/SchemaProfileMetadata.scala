package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The read-only metadata about a profile.
  */
@js.native
trait SchemaProfileMetadata extends js.Object {
  /**
    * The profile object type.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The user types.
    */
  var userTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaProfileMetadata {
  @scala.inline
  def apply(objectType: String = null, userTypes: js.Array[String] = null): SchemaProfileMetadata = {
    val __obj = js.Dynamic.literal()
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (userTypes != null) __obj.updateDynamic("userTypes")(userTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProfileMetadata]
  }
}

