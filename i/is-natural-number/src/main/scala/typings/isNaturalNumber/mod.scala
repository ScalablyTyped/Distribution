package typings.isNaturalNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-natural-number", JSImport.Namespace)
  @js.native
  def apply(number: String): Boolean = js.native
  @JSImport("is-natural-number", JSImport.Namespace)
  @js.native
  def apply(number: String, option: Options): Boolean = js.native
  /**
    * Rreturns true if the first argument is one of the natural numbers.
    * If not, or the argument is not a number, it returns false.
    */
  @JSImport("is-natural-number", JSImport.Namespace)
  @js.native
  def apply(number: Double): Boolean = js.native
  @JSImport("is-natural-number", JSImport.Namespace)
  @js.native
  def apply(number: Double, option: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Setting this option true makes 0 regarded as a natural number.
      */
    var includeZero: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(includeZero: Boolean): Options = {
      val __obj = js.Dynamic.literal(includeZero = includeZero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeZero(value: Boolean): Self = StObject.set(x, "includeZero", value.asInstanceOf[js.Any])
    }
  }
}
