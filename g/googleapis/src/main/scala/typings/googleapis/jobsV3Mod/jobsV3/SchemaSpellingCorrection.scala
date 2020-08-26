package typings.googleapis.jobsV3Mod.jobsV3

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
  def apply(): SchemaSpellingCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellingCorrection]
  }
  @scala.inline
  implicit class SchemaSpellingCorrectionOps[Self <: SchemaSpellingCorrection] (val x: Self) extends AnyVal {
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
    def setCorrected(value: Boolean): Self = this.set("corrected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrected: Self = this.set("corrected", js.undefined)
    @scala.inline
    def setCorrectedText(value: String): Self = this.set("correctedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrectedText: Self = this.set("correctedText", js.undefined)
  }
  
}

