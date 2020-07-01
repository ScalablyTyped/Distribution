package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An iOS version.
  */
@js.native
trait SchemaIosVersion extends js.Object {
  /**
    * An opaque id for this iOS version. Use this id to invoke the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * An integer representing the major iOS version. Examples: &quot;8&quot;,
    * &quot;9&quot;.
    */
  var majorVersion: js.UndefOr[Double] = js.native
  /**
    * An integer representing the minor iOS version. Examples: &quot;1&quot;,
    * &quot;2&quot;.
    */
  var minorVersion: js.UndefOr[Double] = js.native
  /**
    * The available Xcode versions for this version.
    */
  var supportedXcodeVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIosVersion {
  @scala.inline
  def apply(
    id: String = null,
    majorVersion: js.UndefOr[Double] = js.undefined,
    minorVersion: js.UndefOr[Double] = js.undefined,
    supportedXcodeVersionIds: js.Array[String] = null,
    tags: js.Array[String] = null
  ): SchemaIosVersion = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(majorVersion)) __obj.updateDynamic("majorVersion")(majorVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorVersion)) __obj.updateDynamic("minorVersion")(minorVersion.get.asInstanceOf[js.Any])
    if (supportedXcodeVersionIds != null) __obj.updateDynamic("supportedXcodeVersionIds")(supportedXcodeVersionIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIosVersion]
  }
}

