package typings.jestDashHasteDashMap.buildModuleMapMod

import typings.jestDashHasteDashMap.buildTypesMod.DuplicatesSet
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateHasteCandidatesError extends Error {
  var duplicatesSet: DuplicatesSet
  var hasteName: String
  var platform: String | Null
  var supportsNativePlatform: Boolean
}

object DuplicateHasteCandidatesError {
  @scala.inline
  def apply(
    duplicatesSet: DuplicatesSet,
    hasteName: String,
    message: String,
    name: String,
    supportsNativePlatform: Boolean,
    platform: String = null,
    stack: String = null
  ): DuplicateHasteCandidatesError = {
    val __obj = js.Dynamic.literal(duplicatesSet = duplicatesSet.asInstanceOf[js.Any], hasteName = hasteName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsNativePlatform = supportsNativePlatform.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateHasteCandidatesError]
  }
}

