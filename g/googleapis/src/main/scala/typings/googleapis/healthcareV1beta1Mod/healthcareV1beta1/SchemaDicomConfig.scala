package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the parameters needed for de-identification of DICOM stores.
  */
@js.native
trait SchemaDicomConfig extends js.Object {
  /**
    * Tag filtering profile that determines which tags to keep/remove.
    */
  var filterProfile: js.UndefOr[String] = js.native
  /**
    * List of tags to keep. Remove all other tags.
    */
  var keepList: js.UndefOr[SchemaTagFilterList] = js.native
  /**
    * List of tags to remove. Keep all other tags.
    */
  var removeList: js.UndefOr[SchemaTagFilterList] = js.native
}

object SchemaDicomConfig {
  @scala.inline
  def apply(): SchemaDicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomConfig]
  }
  @scala.inline
  implicit class SchemaDicomConfigOps[Self <: SchemaDicomConfig] (val x: Self) extends AnyVal {
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
    def setFilterProfile(value: String): Self = this.set("filterProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterProfile: Self = this.set("filterProfile", js.undefined)
    @scala.inline
    def setKeepList(value: SchemaTagFilterList): Self = this.set("keepList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepList: Self = this.set("keepList", js.undefined)
    @scala.inline
    def setRemoveList(value: SchemaTagFilterList): Self = this.set("removeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveList: Self = this.set("removeList", js.undefined)
  }
  
}

