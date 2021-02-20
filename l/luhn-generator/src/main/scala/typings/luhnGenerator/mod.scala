package typings.luhnGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("luhn-generator", "checksum")
  @js.native
  def checksum(input: String): Double = js.native
  @JSImport("luhn-generator", "checksum")
  @js.native
  def checksum(input: Double): Double = js.native
  
  @JSImport("luhn-generator", "generate")
  @js.native
  def generate(input: String): Double = js.native
  @JSImport("luhn-generator", "generate")
  @js.native
  def generate(input: String, inputOptions: InputOptions): Double = js.native
  @JSImport("luhn-generator", "generate")
  @js.native
  def generate(input: Double): Double = js.native
  @JSImport("luhn-generator", "generate")
  @js.native
  def generate(input: Double, inputOptions: InputOptions): Double = js.native
  
  @JSImport("luhn-generator", "random")
  @js.native
  def random(input: String): Double = js.native
  @JSImport("luhn-generator", "random")
  @js.native
  def random(input: String, inputOptions: InputOptions): Double = js.native
  @JSImport("luhn-generator", "random")
  @js.native
  def random(input: Double): Double = js.native
  @JSImport("luhn-generator", "random")
  @js.native
  def random(input: Double, inputOptions: InputOptions): Double = js.native
  
  @JSImport("luhn-generator", "validate")
  @js.native
  def validate(input: String): Boolean = js.native
  @JSImport("luhn-generator", "validate")
  @js.native
  def validate(input: Double): Boolean = js.native
  
  @js.native
  trait InputOptions extends StObject {
    
    /** @default 0 */
    var pad: js.UndefOr[Double] = js.native
    
    /** @default 2 */
    var weightFactor: js.UndefOr[Double] = js.native
  }
  object InputOptions {
    
    @scala.inline
    def apply(): InputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputOptions]
    }
    
    @scala.inline
    implicit class InputOptionsMutableBuilder[Self <: InputOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setWeightFactor(value: Double): Self = StObject.set(x, "weightFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightFactorUndefined: Self = StObject.set(x, "weightFactor", js.undefined)
    }
  }
}
