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
  def apply(whitelistTags: js.Array[String] = null): SchemaDicomConfig = {
    val __obj = js.Dynamic.literal()
    if (whitelistTags != null) __obj.updateDynamic("whitelistTags")(whitelistTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDicomConfig]
  }
}

