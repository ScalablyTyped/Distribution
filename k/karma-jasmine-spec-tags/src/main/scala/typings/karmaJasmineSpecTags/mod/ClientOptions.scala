package typings.karmaJasmineSpecTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default values can be configured using client map in Karma configuration
  */
trait ClientOptions extends js.Object {
  /**
    * defines a comma-separated list of tag names
    * * If `names` is defined then specs which match to tags will be skipped.
    * * If `names` is not defined then all specs with a tag will be skipped.
    */
  var skipTags: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
  /**
    * defines a prefix for a tag name
    * @default '#'
    */
  var tagPrefix: js.UndefOr[String] = js.undefined
  /**
    * defines a comma-separated list of tag names:
    * * if `names` is defined then specs which match to tags will be executed.
    * * If `names` is not defined then all specs with a tag will be executed.
    */
  var tags: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    skipTags: String | js.Array[String] | Boolean = null,
    tagPrefix: String = null,
    tags: String | js.Array[String] | Boolean = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (skipTags != null) __obj.updateDynamic("skipTags")(skipTags.asInstanceOf[js.Any])
    if (tagPrefix != null) __obj.updateDynamic("tagPrefix")(tagPrefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

