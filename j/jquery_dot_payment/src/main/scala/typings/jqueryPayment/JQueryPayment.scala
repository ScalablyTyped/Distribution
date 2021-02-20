package typings.jqueryPayment

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryPayment {
  
  @js.native
  trait CardInfo extends StObject {
    
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
    implicit class CardInfoMutableBuilder[Self <: CardInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCvcLength(value: js.Array[Double]): Self = StObject.set(x, "cvcLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCvcLengthUndefined: Self = StObject.set(x, "cvcLength", js.undefined)
      
      @scala.inline
      def setCvcLengthVarargs(value: Double*): Self = StObject.set(x, "cvcLength", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLength(value: js.Array[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLengthVarargs(value: Double*): Self = StObject.set(x, "length", js.Array(value :_*))
      
      @scala.inline
      def setLuhn(value: Boolean): Self = StObject.set(x, "luhn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuhnUndefined: Self = StObject.set(x, "luhn", js.undefined)
      
      @scala.inline
      def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPatterns(value: js.Array[Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      @scala.inline
      def setPatternsVarargs(value: Double*): Self = StObject.set(x, "patterns", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExpiryInfo extends StObject {
    
    var month: Double = js.native
    
    var year: Double = js.native
  }
  object ExpiryInfo {
    
    @scala.inline
    def apply(month: Double, year: Double): ExpiryInfo = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpiryInfo]
    }
    
    @scala.inline
    implicit class ExpiryInfoMutableBuilder[Self <: ExpiryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
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
