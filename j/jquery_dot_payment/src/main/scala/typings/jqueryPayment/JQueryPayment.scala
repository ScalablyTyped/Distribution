package typings.jqueryPayment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryPayment {
  
  trait CardInfo extends StObject {
    
    /**
      * Array of valid card CVC lengths.
      */
    var cvcLength: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Regex used to format the card number. Each match is joined with a space.
      */
    var format: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Array of valid card number lengths.
      */
    var length: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Boolean indicating whether a valid card number should satisfy the Luhn check.
      */
    var luhn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Regex used to identify the card type. For the best experience, this should be
      * the shortest pattern that can guarantee the card is of a particular type.
      */
    var pattern: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Array of prefixes used to identify the card type.
      */
    var patterns: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Card type
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardInfo {
    
    inline def apply(): CardInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardInfo]
    }
    
    extension [Self <: CardInfo](x: Self) {
      
      inline def setCvcLength(value: js.Array[Double]): Self = StObject.set(x, "cvcLength", value.asInstanceOf[js.Any])
      
      inline def setCvcLengthUndefined: Self = StObject.set(x, "cvcLength", js.undefined)
      
      inline def setCvcLengthVarargs(value: Double*): Self = StObject.set(x, "cvcLength", js.Array(value*))
      
      inline def setFormat(value: js.RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLength(value: js.Array[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLengthVarargs(value: Double*): Self = StObject.set(x, "length", js.Array(value*))
      
      inline def setLuhn(value: Boolean): Self = StObject.set(x, "luhn", value.asInstanceOf[js.Any])
      
      inline def setLuhnUndefined: Self = StObject.set(x, "luhn", js.undefined)
      
      inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPatterns(value: js.Array[Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: Double*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExpiryInfo extends StObject {
    
    var month: Double
    
    var year: Double
  }
  object ExpiryInfo {
    
    inline def apply(month: Double, year: Double): ExpiryInfo = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpiryInfo]
    }
    
    extension [Self <: ExpiryInfo](x: Self) {
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Payment extends StObject {
    
    /**
      * Parses a credit card expiry in the form of MM/YYYY, returning an object containing the month and
      * year. Shorthand years, such as 13 are also supported (and converted into the longhand, e.g. 2013).
      *
      * @param monthYear The value to parse.
      */
    def cardExpiryVal(monthYear: String): ExpiryInfo = js.native
    
    /**
      * Returns a card type. The function will return null if the card type can't be determined.
      *
      * @param cardNumber The card number to parse.
      */
    def cardType(cardNumber: String): String = js.native
    
    /**
      * Array of objects that describe valid card types.
      */
    var cards: js.Array[CardInfo] = js.native
    
    /**
      * Validates a card CVC:
      * * Validates number
      * * Validates length to 4
      *
      * @param cvc The CVC value to validate.
      * @param type Optional card type.
      */
    def validateCardCVC(cvc: String): Boolean = js.native
    def validateCardCVC(cvc: String, `type`: String): Boolean = js.native
    
    /**
      * Validates a card expiry:
      * * Validates numbers
      * * Validates in the future
      * * Supports year shorthand
      *
      * @param expiry An object with the year and month to validate.
      */
    def validateCardExpiry(expiry: ExpiryInfo): Boolean = js.native
    /**
      * Validates a card expiry:
      * * Validates numbers
      * * Validates in the future
      * * Supports year shorthand
      *
      * @param year The year to validate.
      * @param month The months to validate.
      */
    def validateCardExpiry(year: String, month: String): Boolean = js.native
    
    /**
      * Validates a card number:
      * * Validates numbers
      * * Validates Luhn algorithm
      * * Validates length
      *
      * @param cardNumber The card number to validate.
      */
    def validateCardNumber(cardNumber: String): Boolean = js.native
  }
}
