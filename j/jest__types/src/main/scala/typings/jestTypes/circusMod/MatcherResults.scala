package typings.jestTypes.circusMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatcherResults extends StObject {
  
  var actual: js.Any
  
  var expected: js.Any
  
  var name: String
  
  var pass: Boolean
}
object MatcherResults {
  
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, name: String, pass: Boolean): MatcherResults = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherResults]
  }
  
  @scala.inline
  implicit class MatcherResultsMutableBuilder[Self <: MatcherResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
