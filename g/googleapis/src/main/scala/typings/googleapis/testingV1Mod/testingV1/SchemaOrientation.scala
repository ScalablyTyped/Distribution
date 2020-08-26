package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Screen orientation of the device.
  */
@js.native
trait SchemaOrientation extends js.Object {
  /**
    * The id for this orientation. Example: &quot;portrait&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A human-friendly name for this orientation. Example:
    * &quot;portrait&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Tags for this dimension. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOrientation {
  @scala.inline
  def apply(): SchemaOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrientation]
  }
  @scala.inline
  implicit class SchemaOrientationOps[Self <: SchemaOrientation] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

