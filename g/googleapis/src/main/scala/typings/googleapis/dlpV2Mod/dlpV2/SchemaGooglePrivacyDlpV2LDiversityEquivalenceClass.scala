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
  def apply(
    equivalenceClassSize: String = null,
    numDistinctSensitiveValues: String = null,
    quasiIdsValues: js.Array[SchemaGooglePrivacyDlpV2Value] = null,
    topSensitiveValues: js.Array[SchemaGooglePrivacyDlpV2ValueFrequency] = null
  ): SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassSize != null) __obj.updateDynamic("equivalenceClassSize")(equivalenceClassSize.asInstanceOf[js.Any])
    if (numDistinctSensitiveValues != null) __obj.updateDynamic("numDistinctSensitiveValues")(numDistinctSensitiveValues.asInstanceOf[js.Any])
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues.asInstanceOf[js.Any])
    if (topSensitiveValues != null) __obj.updateDynamic("topSensitiveValues")(topSensitiveValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass]
  }
}

