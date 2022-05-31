package typings.luhnGenerator

import typings.luhnGenerator.mod.InputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object luhn {
    
    @JSGlobal("luhn")
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
  }
}
