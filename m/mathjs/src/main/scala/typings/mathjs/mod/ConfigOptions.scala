package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends StObject {
  
  var epsilon: js.UndefOr[Double] = js.native
  
  var matrix: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[String] = js.native
  
  var parenthesis: js.UndefOr[String] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var randomSeed: js.UndefOr[String] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
    
    @scala.inline
    def setMatrix(value: String): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setParenthesis(value: String): Self = StObject.set(x, "parenthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParenthesisUndefined: Self = StObject.set(x, "parenthesis", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomSeedUndefined: Self = StObject.set(x, "randomSeed", js.undefined)
  }
}
