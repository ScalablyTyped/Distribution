package typings.mathjs.mod

import typings.mathjs.mathjsStrings.auto
import typings.mathjs.mathjsStrings.engineering
import typings.mathjs.mathjsStrings.exponential
import typings.mathjs.mathjsStrings.fixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatOptions extends StObject {
  
  /**
    * Available values: 'ratio' (default) or 'decimal'. For example
    * format(fraction(1, 3)) will output '1/3' when 'ratio' is configured,
    * and will output 0.(3) when 'decimal' is configured.
    */
  var fraction: js.UndefOr[String] = js.native
  
  /**
    * Exponent determining the lower boundary for formatting a value with
    * an exponent when notation='auto. Default value is -3.
    */
  var lowerExp: js.UndefOr[Double] = js.native
  
  /**
    * Number notation. Choose from: 'fixed' Always use regular number
    * notation. For example '123.40' and '14000000' 'exponential' Always
    * use exponential notation. For example '1.234e+2' and '1.4e+7' 'auto'
    * (default) Regular number notation for numbers having an absolute
    * value between lower and upper bounds, and uses exponential notation
    * elsewhere. Lower bound is included, upper bound is excluded. For
    * example '123.4' and '1.4e7'.
    */
  var notation: js.UndefOr[fixed | exponential | engineering | auto] = js.native
  
  /**
    * A number between 0 and 16 to round the digits of the number. In case
    * of notations 'exponential' and 'auto', precision defines the total
    * number of significant digits returned and is undefined by default. In
    * case of notation 'fixed', precision defines the number of significant
    * digits after the decimal point, and is 0 by default.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Exponent determining the upper boundary for formatting a value with
    * an exponent when notation='auto. Default value is 5.
    */
  var upperExp: js.UndefOr[Double] = js.native
}
object FormatOptions {
  
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  @scala.inline
  implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFraction(value: String): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
    
    @scala.inline
    def setLowerExp(value: Double): Self = StObject.set(x, "lowerExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerExpUndefined: Self = StObject.set(x, "lowerExp", js.undefined)
    
    @scala.inline
    def setNotation(value: fixed | exponential | engineering | auto): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setUpperExp(value: Double): Self = StObject.set(x, "upperExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperExpUndefined: Self = StObject.set(x, "upperExp", js.undefined)
  }
}
