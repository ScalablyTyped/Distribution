package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToRelativeOptions extends js.Object {
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.native
  var locale: js.UndefOr[String] = js.native
  /** The Intl system may choose not to honor this */
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
  /**
    * Padding in milliseconds. This allows you to round up the result if it fits inside the threshold.
    * Don't use in combination with {round: false} because the decimal output will include the padding.
    * Defaults to 0.
    */
  var padding: js.UndefOr[Double] = js.native
  /** Defaults to `true`. */
  var round: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StringUnitLength] = js.native
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[ToRelativeUnit] = js.native
}

object ToRelativeOptions {
  @scala.inline
  def apply(): ToRelativeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToRelativeOptions]
  }
  @scala.inline
  implicit class ToRelativeOptionsOps[Self <: ToRelativeOptions] (val x: Self) extends AnyVal {
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
    def setBase(value: DateTime): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setNumberingSystem(value: NumberingSystem): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setStyle(value: StringUnitLength): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUnit(value: ToRelativeUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

