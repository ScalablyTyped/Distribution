package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsymmetricMatcher[TValue] extends StObject {
  
  def asymmetricMatch(other: TValue, customTesters: js.Array[CustomEqualityTester]): Boolean
  
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.undefined
}
object AsymmetricMatcher {
  
  inline def apply[TValue](asymmetricMatch: (TValue, js.Array[CustomEqualityTester]) => Boolean): AsymmetricMatcher[TValue] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    __obj.asInstanceOf[AsymmetricMatcher[TValue]]
  }
  
  extension [Self <: AsymmetricMatcher[?], TValue](x: Self & AsymmetricMatcher[TValue]) {
    
    inline def setAsymmetricMatch(value: (TValue, js.Array[CustomEqualityTester]) => Boolean): Self = StObject.set(x, "asymmetricMatch", js.Any.fromFunction2(value))
    
    inline def setJasmineToString(value: () => String): Self = StObject.set(x, "jasmineToString", js.Any.fromFunction0(value))
    
    inline def setJasmineToStringUndefined: Self = StObject.set(x, "jasmineToString", js.undefined)
  }
}
