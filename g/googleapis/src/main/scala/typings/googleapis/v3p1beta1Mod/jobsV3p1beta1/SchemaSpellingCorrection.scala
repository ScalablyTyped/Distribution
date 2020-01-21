package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Spell check result.
  */
@js.native
trait SchemaSpellingCorrection extends js.Object {
  /**
    * Indicates if the query was corrected by the spell checker.
    */
  var corrected: js.UndefOr[Boolean] = js.native
  /**
    * Correction output consisting of the corrected keyword string.
    */
  var correctedText: js.UndefOr[String] = js.native
}

object SchemaSpellingCorrection {
  @scala.inline
  def apply(corrected: js.UndefOr[Boolean] = js.undefined, correctedText: String = null): SchemaSpellingCorrection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corrected)) __obj.updateDynamic("corrected")(corrected.asInstanceOf[js.Any])
    if (correctedText != null) __obj.updateDynamic("correctedText")(correctedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpellingCorrection]
  }
}

