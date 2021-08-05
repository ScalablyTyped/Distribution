package typings.luhnGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("luhn-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checksum(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checksum")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def checksum(input: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checksum")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def generate(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def generate(input: String, inputOptions: InputOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def generate(input: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def generate(input: Double, inputOptions: InputOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def random(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def random(input: String, inputOptions: InputOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(input.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def random(input: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def random(input: Double, inputOptions: InputOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(input.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def validate(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validate(input: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait InputOptions extends StObject {
    
    /** @default 0 */
    var pad: js.UndefOr[Double] = js.undefined
    
    /** @default 2 */
    var weightFactor: js.UndefOr[Double] = js.undefined
  }
  object InputOptions {
    
    inline def apply(): InputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputOptions]
    }
    
    extension [Self <: InputOptions](x: Self) {
      
      inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setWeightFactor(value: Double): Self = StObject.set(x, "weightFactor", value.asInstanceOf[js.Any])
      
      inline def setWeightFactorUndefined: Self = StObject.set(x, "weightFactor", js.undefined)
    }
  }
}
