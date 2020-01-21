package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media resource.
  */
@js.native
trait SchemaGoogleBytestreamMedia extends js.Object {
  /**
    * Name of the media resource.
    */
  var resourceName: js.UndefOr[String] = js.native
}

object SchemaGoogleBytestreamMedia {
  @scala.inline
  def apply(resourceName: String = null): SchemaGoogleBytestreamMedia = {
    val __obj = js.Dynamic.literal()
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleBytestreamMedia]
  }
}

