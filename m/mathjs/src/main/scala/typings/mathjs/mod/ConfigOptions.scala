package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigOptions extends StObject {
  
  var epsilon: js.UndefOr[Double] = js.undefined
  
  var matrix: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var parenthesis: js.UndefOr[String] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var randomSeed: js.UndefOr[String] = js.undefined
}
object ConfigOptions {
  
  inline def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
    
    inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
    
    inline def setMatrix(value: String): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setParenthesis(value: String): Self = StObject.set(x, "parenthesis", value.asInstanceOf[js.Any])
    
    inline def setParenthesisUndefined: Self = StObject.set(x, "parenthesis", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
    
    inline def setRandomSeedUndefined: Self = StObject.set(x, "randomSeed", js.undefined)
  }
}
