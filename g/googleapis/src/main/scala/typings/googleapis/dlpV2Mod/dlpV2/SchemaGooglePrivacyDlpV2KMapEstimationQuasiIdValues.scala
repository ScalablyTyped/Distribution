package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues extends js.Object {
  /**
    * The estimated anonymity for these quasi-identifier values.
    */
  var estimatedAnonymity: js.UndefOr[String] = js.native
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValuesOps[Self <: SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues] (val x: Self) extends AnyVal {
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
    def setEstimatedAnonymity(value: String): Self = this.set("estimatedAnonymity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedAnonymity: Self = this.set("estimatedAnonymity", js.undefined)
    @scala.inline
    def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = this.set("quasiIdsValues", js.Array(value :_*))
    @scala.inline
    def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = this.set("quasiIdsValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuasiIdsValues: Self = this.set("quasiIdsValues", js.undefined)
  }
  
}

