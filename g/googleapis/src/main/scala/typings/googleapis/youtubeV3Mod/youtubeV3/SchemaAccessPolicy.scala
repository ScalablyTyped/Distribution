package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rights management policy for YouTube resources.
  */
@js.native
trait SchemaAccessPolicy extends js.Object {
  /**
    * The value of allowed indicates whether the access to the policy is
    * allowed or denied by default.
    */
  var allowed: js.UndefOr[Boolean] = js.native
  /**
    * A list of region codes that identify countries where the default policy
    * do not apply.
    */
  var exception: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAccessPolicy {
  @scala.inline
  def apply(allowed: js.UndefOr[Boolean] = js.undefined, exception: js.Array[String] = null): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowed)) __obj.updateDynamic("allowed")(allowed.get.asInstanceOf[js.Any])
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
}

