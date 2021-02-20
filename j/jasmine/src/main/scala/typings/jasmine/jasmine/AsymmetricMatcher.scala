package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricMatcher[TValue] extends StObject {
  
  def asymmetricMatch(other: TValue, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.native
}
object AsymmetricMatcher {
  
  @scala.inline
  def apply[TValue](asymmetricMatch: (TValue, js.Array[CustomEqualityTester]) => Boolean): AsymmetricMatcher[TValue] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    __obj.asInstanceOf[AsymmetricMatcher[TValue]]
  }
  
  @scala.inline
  implicit class AsymmetricMatcherMutableBuilder[Self <: AsymmetricMatcher[_], TValue] (val x: Self with AsymmetricMatcher[TValue]) extends AnyVal {
    
    @scala.inline
    def setAsymmetricMatch(value: (TValue, js.Array[CustomEqualityTester]) => Boolean): Self = StObject.set(x, "asymmetricMatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setJasmineToString(value: () => String): Self = StObject.set(x, "jasmineToString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJasmineToStringUndefined: Self = StObject.set(x, "jasmineToString", js.undefined)
  }
}
