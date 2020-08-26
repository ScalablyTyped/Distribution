package typings.jqueryMaskmoney.jQueryMaskMoney

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set if the prefix and suffix will stay in the field's value after the user exits the field
    */
  var affixesStay: js.UndefOr[Boolean] = js.native
  /**
    * Setting to prevent negative values
    */
  var allowNegative: js.UndefOr[Boolean] = js.native
  /**
    * Setting to prevent users from inputing zero
    */
  var allowZero: js.UndefOr[Boolean] = js.native
  /**
    * The decimal separator
    */
  var decimal: js.UndefOr[String] = js.native
  /**
    * How many decimal places are allowed
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * The prefix to be displayed before the value entered
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The prefix to be displayed after the value entered
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * The thousands separator
    */
  var thousands: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAffixesStay(value: Boolean): Self = this.set("affixesStay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffixesStay: Self = this.set("affixesStay", js.undefined)
    @scala.inline
    def setAllowNegative(value: Boolean): Self = this.set("allowNegative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNegative: Self = this.set("allowNegative", js.undefined)
    @scala.inline
    def setAllowZero(value: Boolean): Self = this.set("allowZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowZero: Self = this.set("allowZero", js.undefined)
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setThousands(value: String): Self = this.set("thousands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousands: Self = this.set("thousands", js.undefined)
  }
  
}

