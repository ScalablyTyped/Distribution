package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsymmetricMatcher extends StObject {
  
  def asymmetricMatch(other: js.Any): Boolean
}
object AsymmetricMatcher {
  
  @scala.inline
  def apply(asymmetricMatch: js.Any => Boolean): AsymmetricMatcher = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction1(asymmetricMatch))
    __obj.asInstanceOf[AsymmetricMatcher]
  }
  
  @scala.inline
  implicit class AsymmetricMatcherMutableBuilder[Self <: AsymmetricMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsymmetricMatch(value: js.Any => Boolean): Self = StObject.set(x, "asymmetricMatch", js.Any.fromFunction1(value))
  }
}
