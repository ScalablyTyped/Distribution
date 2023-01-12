package typings.iban

import org.scalablytyped.runtime.Shortcut
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("iban", JSImport.Namespace)
  @js.native
  val ^ : IBANStatic = js.native
  
  @js.native
  trait IBANStatic extends StObject {
    
    /**
      * An object containing all the known IBAN specifications
      */
    var countries: Record[String, Specification] = js.native
    
    /**
      * @summary Returns the IBAN in a electronic format.
      * @param iban The IBAN to convert.
      * @param The IBAN in electronic format.
      */
    def electronicFormat(iban: String): String = js.native
    
    /**
      * @summary Convert the passed BBAN to an IBAN for this country specification.
      * @param countryCode The country of the BBAN.
      * @param bban The BBAN to convert to IBAN.
      * @returns The IBAN.
      */
    def fromBBAN(countryCode: String, bban: String): String = js.native
    
    /**
      * @summary Check if the passed iban is valid according to this specification.
      * @param iban The iban to validate.
      * @returns True if valid, false otherwise.
      */
    def isValid(iban: String): Boolean = js.native
    
    /**
      * @summary Check of the passed BBAN is valid.
      * @param countryCode The country of the BBAN.
      * @param bban The BBAN to validate.
      * @returns True if valid, false otherwise.
      */
    def isValidBBAN(countryCode: String, bban: String): Boolean = js.native
    
    /**
      * @summary Returns the IBAN in a print format.
      * @param iban The IBAN to convert.
      * @param [separator] The separator to use between IBAN blocks, defaults to ' '.
      */
    def printFormat(iban: String): String = js.native
    def printFormat(iban: String, separator: String): String = js.native
    
    /**
      * @summary Convert the passed IBAN to a country-specific BBAN.
      * @param iban The IBAN to convert.
      * @param [separator] The separator to use between BBAN blocks, defaults to ' '.
      * @returns The BBAN
      */
    def toBBAN(iban: String): String = js.native
    def toBBAN(iban: String, separator: String): String = js.native
  }
  
  trait Specification extends StObject {
    
    /** the code of the country */
    val countryCode: String
    
    /** an example valid IBAN */
    val example: String
    
    /**
      * Convert the passed BBAN to an IBAN for this country specification.
      * Please note that <i>"generation of the IBAN shall be the exclusive responsibility of the bank/branch servicing the account"</i>.
      * This method implements the preferred algorithm described in http://en.wikipedia.org/wiki/International_Bank_Account_Number#Generating_IBAN_check_digits
      */
    def fromBBAN(bban: String): String
    
    /** Check if the passed iban is valid according to this specification. */
    def isValid(iban: String): Boolean
    
    /**
      * Check of the passed BBAN is valid.
      * This function only checks the format of the BBAN (length and matching the letetr/number specs) but does not
      * verify the check digit.
      */
    def isValidBBAN(bban: String): Boolean
    
    /** the length of the IBAN */
    val length: Double
    
    /*& the structure of the underlying BBAN (for validation and formatting) */
    val structure: String
    
    /**
      * Convert the passed IBAN to a country-specific BBAN.
      */
    def toBBAN(iban: String, separator: String): String
  }
  object Specification {
    
    inline def apply(
      countryCode: String,
      example: String,
      fromBBAN: String => String,
      isValid: String => Boolean,
      isValidBBAN: String => Boolean,
      length: Double,
      structure: String,
      toBBAN: (String, String) => String
    ): Specification = {
      val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], fromBBAN = js.Any.fromFunction1(fromBBAN), isValid = js.Any.fromFunction1(isValid), isValidBBAN = js.Any.fromFunction1(isValidBBAN), length = length.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], toBBAN = js.Any.fromFunction2(toBBAN))
      __obj.asInstanceOf[Specification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Specification] (val x: Self) extends AnyVal {
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setFromBBAN(value: String => String): Self = StObject.set(x, "fromBBAN", js.Any.fromFunction1(value))
      
      inline def setIsValid(value: String => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
      
      inline def setIsValidBBAN(value: String => Boolean): Self = StObject.set(x, "isValidBBAN", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStructure(value: String): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
      
      inline def setToBBAN(value: (String, String) => String): Self = StObject.set(x, "toBBAN", js.Any.fromFunction2(value))
    }
  }
  
  type _To = IBANStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IBANStatic = ^
}
