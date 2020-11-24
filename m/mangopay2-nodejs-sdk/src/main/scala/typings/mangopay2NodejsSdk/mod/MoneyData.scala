package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoneyData extends js.Object {
  
  /**
    * An amount of money in the smallest sub-division of the currency, e.g. 12.60 EUR would be represented as 1260 whereas 12 JPY would be represented as just 12)
    */
  var Amount: Double = js.native
  
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO = js.native
}
object MoneyData {
  
  @scala.inline
  def apply(Amount: Double, Currency: CurrencyISO): MoneyData = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyData]
  }
  
  @scala.inline
  implicit class MoneyDataOps[Self <: MoneyData] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: CurrencyISO): Self = this.set("Currency", value.asInstanceOf[js.Any])
  }
}
