package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the parameters needed for de-identification of DICOM stores.
  */
@js.native
trait SchemaDicomConfig extends js.Object {
  /**
    * Tags to be whitelisted, for example &quot;PatientID&quot;,
    * &quot;0010,0010&quot;. Any tag that is whitelisted will copied as is. All
    * other tags will be omitted.
    */
  var whitelistTags: js.UndefOr[js.Array[String]] = js.native
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
    def setWhitelistTagsVarargs(value: String*): Self = this.set("whitelistTags", js.Array(value :_*))
    @scala.inline
    def setWhitelistTags(value: js.Array[String]): Self = this.set("whitelistTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelistTags: Self = this.set("whitelistTags", js.undefined)
  }
  
}

