package typings.jestHasteMap.moduleMapMod

import typings.jestHasteMap.typesMod.DuplicatesSet
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateHasteCandidatesError extends Error {
  var duplicatesSet: DuplicatesSet = js.native
  var hasteName: String = js.native
  var platform: String | Null = js.native
  var supportsNativePlatform: Boolean = js.native
}

object DuplicateHasteCandidatesError {
  @scala.inline
  def apply(
    duplicatesSet: DuplicatesSet,
    hasteName: String,
    message: String,
    name: String,
    supportsNativePlatform: Boolean
  ): DuplicateHasteCandidatesError = {
    val __obj = js.Dynamic.literal(duplicatesSet = duplicatesSet.asInstanceOf[js.Any], hasteName = hasteName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsNativePlatform = supportsNativePlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateHasteCandidatesError]
  }
  @scala.inline
  implicit class DuplicateHasteCandidatesErrorOps[Self <: DuplicateHasteCandidatesError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuplicatesSet(value: DuplicatesSet): Self = this.set("duplicatesSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasteName(value: String): Self = this.set("hasteName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsNativePlatform(value: Boolean): Self = this.set("supportsNativePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformNull: Self = this.set("platform", null)
  }
  
}

