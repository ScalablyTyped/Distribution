package typings.jestTestResult.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suite extends StObject {
  
  var suites: js.Array[Suite]
  
  var tests: js.Array[AssertionResult]
  
  var title: String
}
object Suite {
  
  inline def apply(suites: js.Array[Suite], tests: js.Array[AssertionResult], title: String): Suite = {
    val __obj = js.Dynamic.literal(suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Suite] (val x: Self) extends AnyVal {
    
    inline def setSuites(value: js.Array[Suite]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
    
    inline def setSuitesVarargs(value: Suite*): Self = StObject.set(x, "suites", js.Array(value*))
    
    inline def setTests(value: js.Array[AssertionResult]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsVarargs(value: AssertionResult*): Self = StObject.set(x, "tests", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
