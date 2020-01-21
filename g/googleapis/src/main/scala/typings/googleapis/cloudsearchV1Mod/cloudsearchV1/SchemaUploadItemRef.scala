package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an upload session reference. This reference is created via
  * upload method. Updating of item content may refer to this uploaded content
  * via contentDataRef.
  */
@js.native
trait SchemaUploadItemRef extends js.Object {
  /**
    * Name of the content reference. The maximum length is 2048 characters.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaUploadItemRef {
  @scala.inline
  def apply(name: String = null): SchemaUploadItemRef = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUploadItemRef]
  }
}

