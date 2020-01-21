package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Xcode version that an iOS version is compatible with.
  */
@js.native
trait SchemaXcodeVersion extends js.Object {
  /**
    * Tags for this Xcode version. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The id for this version. Example: &quot;9.2&quot;.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaXcodeVersion {
  @scala.inline
  def apply(tags: js.Array[String] = null, version: String = null): SchemaXcodeVersion = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaXcodeVersion]
  }
}

