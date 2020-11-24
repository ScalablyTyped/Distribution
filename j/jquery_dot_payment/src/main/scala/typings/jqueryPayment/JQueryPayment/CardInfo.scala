package typings.jqueryPayment.JQueryPayment

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardInfo extends js.Object {
  
  /**
    * Array of valid card CVC lengths.
    */
  var cvcLength: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Regex used to format the card number. Each match is joined with a space.
    */
  var format: js.UndefOr[RegExp] = js.native
  
  /**
    * Array of valid card number lengths.
    */
  var length: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Boolean indicating whether a valid card number should satisfy the Luhn check.
    */
  var luhn: js.UndefOr[Boolean] = js.native
  
  /**
    * Regex used to identify the card type. For the best experience, this should be
    * the shortest pattern that can guarantee the card is of a particular type.
    */
  var pattern: js.UndefOr[RegExp] = js.native
  
  /**
    * Array of prefixes used to identify the card type.
    */
  var patterns: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Card type
    */
  var `type`: js.UndefOr[String] = js.native
}
object CardInfo {
  
  @scala.inline
  def apply(): CardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardInfo]
  }
  
  @scala.inline
  implicit class CardInfoOps[Self <: CardInfo] (val x: Self) extends AnyVal {
    
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
    def setCvcLengthVarargs(value: Double*): Self = this.set("cvcLength", js.Array(value :_*))
    
    @scala.inline
    def setCvcLength(value: js.Array[Double]): Self = this.set("cvcLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCvcLength: Self = this.set("cvcLength", js.undefined)
    
    @scala.inline
    def setFormat(value: RegExp): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLengthVarargs(value: Double*): Self = this.set("length", js.Array(value :_*))
    
    @scala.inline
    def setLength(value: js.Array[Double]): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLuhn(value: Boolean): Self = this.set("luhn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLuhn: Self = this.set("luhn", js.undefined)
    
    @scala.inline
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPatternsVarargs(value: Double*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[Double]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
