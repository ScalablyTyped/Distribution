package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location/region designation for language.
  */
@js.native
trait SchemaLocale extends js.Object {
  /**
    * The id for this locale. Example: &quot;en_US&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A human-friendly name for this language/locale. Example:
    * &quot;English&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A human-friendly string representing the region for this locale. Example:
    * &quot;United States&quot;. Not present for every locale.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Tags for this dimension. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaLocale {
  @scala.inline
  def apply(): SchemaLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocale]
  }
  @scala.inline
  implicit class SchemaLocaleOps[Self <: SchemaLocale] (val x: Self) extends AnyVal {
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
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

