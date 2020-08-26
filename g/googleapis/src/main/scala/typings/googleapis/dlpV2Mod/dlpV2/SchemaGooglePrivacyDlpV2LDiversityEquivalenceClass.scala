package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of columns&#39; values that share the same ldiversity value.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass extends js.Object {
  /**
    * Size of the k-anonymity equivalence class.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  /**
    * Number of distinct sensitive values in this equivalence class.
    */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.native
  /**
    * Quasi-identifier values defining the k-anonymity equivalence class. The
    * order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
  /**
    * Estimated frequencies of top sensitive values.
    */
  var topSensitiveValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]] = js.native
}

object SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LDiversityEquivalenceClassOps[Self <: SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass] (val x: Self) extends AnyVal {
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
    def setEquivalenceClassSize(value: String): Self = this.set("equivalenceClassSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEquivalenceClassSize: Self = this.set("equivalenceClassSize", js.undefined)
    @scala.inline
    def setNumDistinctSensitiveValues(value: String): Self = this.set("numDistinctSensitiveValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumDistinctSensitiveValues: Self = this.set("numDistinctSensitiveValues", js.undefined)
    @scala.inline
    def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = this.set("quasiIdsValues", js.Array(value :_*))
    @scala.inline
    def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = this.set("quasiIdsValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuasiIdsValues: Self = this.set("quasiIdsValues", js.undefined)
    @scala.inline
    def setTopSensitiveValuesVarargs(value: SchemaGooglePrivacyDlpV2ValueFrequency*): Self = this.set("topSensitiveValues", js.Array(value :_*))
    @scala.inline
    def setTopSensitiveValues(value: js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]): Self = this.set("topSensitiveValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopSensitiveValues: Self = this.set("topSensitiveValues", js.undefined)
  }
  
}

