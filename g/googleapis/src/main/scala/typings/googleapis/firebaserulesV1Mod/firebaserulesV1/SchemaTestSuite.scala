package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `TestSuite` is a collection of `TestCase` instances that validate the
  * logical correctness of a `Ruleset`. The `TestSuite` may be referenced
  * in-line within a `TestRuleset` invocation or as part of a `Release` object
  * as a pre-release check.
  */
@js.native
trait SchemaTestSuite extends StObject {
  
  /**
    * Collection of test cases associated with the `TestSuite`.
    */
  var testCases: js.UndefOr[js.Array[SchemaTestCase]] = js.native
}
object SchemaTestSuite {
  
  @scala.inline
  def apply(): SchemaTestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSuite]
  }
  
  @scala.inline
  implicit class SchemaTestSuiteMutableBuilder[Self <: SchemaTestSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestCases(value: js.Array[SchemaTestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    @scala.inline
    def setTestCasesVarargs(value: SchemaTestCase*): Self = StObject.set(x, "testCases", js.Array(value :_*))
  }
}
