package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media resource.
  */
@js.native
trait SchemaMedia extends js.Object {
  /**
    * Name of the media resource.
    */
  var resourceName: js.UndefOr[String] = js.native
}

object SchemaMedia {
  @scala.inline
  def apply(resourceName: String = null): SchemaMedia = {
    val __obj = js.Dynamic.literal()
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMedia]
  }
}

