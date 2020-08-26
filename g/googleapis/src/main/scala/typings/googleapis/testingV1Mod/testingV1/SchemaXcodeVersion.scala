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
  def apply(): SchemaXcodeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXcodeVersion]
  }
  @scala.inline
  implicit class SchemaXcodeVersionOps[Self <: SchemaXcodeVersion] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

