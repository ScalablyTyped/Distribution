package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message resulting from reading an image file.
  */
@js.native
trait SchemaImageError extends js.Object {
  /**
    * The type of image error encountered. Optional for older image errors.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The file path in the import of the image that was rejected.
    */
  var filePath: js.UndefOr[String] = js.native
}

object SchemaImageError {
  @scala.inline
  def apply(code: String = null, filePath: String = null): SchemaImageError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageError]
  }
}

