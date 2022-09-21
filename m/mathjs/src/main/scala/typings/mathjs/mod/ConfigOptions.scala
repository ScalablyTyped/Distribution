package typings.mathjs.mod

import typings.mathjs.mathjsStrings.Array
import typings.mathjs.mathjsStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigOptions extends StObject {
  
  var epsilon: js.UndefOr[Double] = js.undefined
  
  var matrix: js.UndefOr[typings.mathjs.mathjsStrings.Matrix | Array] = js.undefined
  
  var number: js.UndefOr[
    typings.mathjs.mathjsStrings.number | typings.mathjs.mathjsStrings.BigNumber | typings.mathjs.mathjsStrings.Fraction
  ] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var predictable: js.UndefOr[Boolean] = js.undefined
  
  var randomSeed: js.UndefOr[String | Null] = js.undefined
}
object ConfigOptions {
  
  inline def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
    
    inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
    
    inline def setMatrix(value: typings.mathjs.mathjsStrings.Matrix | Array): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setNumber(value: number | typings.mathjs.mathjsStrings.BigNumber | typings.mathjs.mathjsStrings.Fraction): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPredictable(value: Boolean): Self = StObject.set(x, "predictable", value.asInstanceOf[js.Any])
    
    inline def setPredictableUndefined: Self = StObject.set(x, "predictable", js.undefined)
    
    inline def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
    
    inline def setRandomSeedNull: Self = StObject.set(x, "randomSeed", null)
    
    inline def setRandomSeedUndefined: Self = StObject.set(x, "randomSeed", js.undefined)
  }
}
