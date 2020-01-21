package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for renaming a feature.
  */
@js.native
trait SchemaFeatureRename extends js.Object {
  /**
    * New name of the feature.
    */
  var newName: js.UndefOr[String] = js.native
}

object SchemaFeatureRename {
  @scala.inline
  def apply(newName: String = null): SchemaFeatureRename = {
    val __obj = js.Dynamic.literal()
    if (newName != null) __obj.updateDynamic("newName")(newName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFeatureRename]
  }
}

