package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a file, used for user inputs.
  */
@js.native
trait SchemaFileReference extends js.Object {
  /**
    * A path to a file in Google Cloud Storage. Example:
    * gs://build-app-1414623860166/app-debug-unaligned.apk
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object SchemaFileReference {
  @scala.inline
  def apply(gcsPath: String = null): SchemaFileReference = {
    val __obj = js.Dynamic.literal()
    if (gcsPath != null) __obj.updateDynamic("gcsPath")(gcsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFileReference]
  }
}

