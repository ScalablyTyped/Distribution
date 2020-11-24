package typings.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
    */
  var conjunction: js.UndefOr[String] = js.native
  
  /**
    * String to substitute for the decimal point in a decimal fraction.
    */
  var decimal: js.UndefOr[String] = js.native
  
  /**
    * String to display between the previous unit and the next value.
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
    */
  var fallbacks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Number representing the maximum number of units to display for the duration.
    */
  var largest: js.UndefOr[Double] = js.native
  
  /**
    * Number that defines a maximal decimal points for float values.
    */
  var maxDecimalPoints: js.UndefOr[Double] = js.native
  
  /**
    * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
    */
  var round: js.UndefOr[Boolean] = js.native
  
  var serialComma: js.UndefOr[Boolean] = js.native
  
  /**
    * String to display between each value and unit.
    */
  var spacer: js.UndefOr[String] = js.native
  
  /**
    * Customize the value used to calculate each unit of time.
    */
  var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.native
  
  /**
    * Array of strings to define which units are used to display the duration (if needed).
    */
  var units: js.UndefOr[js.Array[Unit]] = js.native
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
    def setConjunction(value: String): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConjunction: Self = this.set("conjunction", js.undefined)
    
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setFallbacksVarargs(value: String*): Self = this.set("fallbacks", js.Array(value :_*))
    
    @scala.inline
    def setFallbacks(value: js.Array[String]): Self = this.set("fallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbacks: Self = this.set("fallbacks", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLargest(value: Double): Self = this.set("largest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargest: Self = this.set("largest", js.undefined)
    
    @scala.inline
    def setMaxDecimalPoints(value: Double): Self = this.set("maxDecimalPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDecimalPoints: Self = this.set("maxDecimalPoints", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSerialComma(value: Boolean): Self = this.set("serialComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialComma: Self = this.set("serialComma", js.undefined)
    
    @scala.inline
    def setSpacer(value: String): Self = this.set("spacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacer: Self = this.set("spacer", js.undefined)
    
    @scala.inline
    def setUnitMeasures(value: UnitMeasuresOptions): Self = this.set("unitMeasures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitMeasures: Self = this.set("unitMeasures", js.undefined)
    
    @scala.inline
    def setUnitsVarargs(value: Unit*): Self = this.set("units", js.Array(value :_*))
    
    @scala.inline
    def setUnits(value: js.Array[Unit]): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
