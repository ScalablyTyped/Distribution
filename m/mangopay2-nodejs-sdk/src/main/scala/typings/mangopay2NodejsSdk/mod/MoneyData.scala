package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoneyData extends StObject {
  
  /**
    * An amount of money in the smallest sub-division of the currency, e.g. 12.60 EUR would be represented as 1260 whereas 12 JPY would be represented as just 12)
    */
  var Amount: Double
  
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO
}
object MoneyData {
  
  @scala.inline
  def apply(Amount: Double, Currency: CurrencyISO): MoneyData = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyData]
  }
  
  @scala.inline
  implicit class MoneyDataMutableBuilder[Self <: MoneyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
  }
}
