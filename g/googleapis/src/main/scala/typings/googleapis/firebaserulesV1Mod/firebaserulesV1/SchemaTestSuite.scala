package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestSuite extends StObject {
  
  /**
    * Collection of test cases associated with the `TestSuite`.
    */
  var testCases: js.UndefOr[js.Array[SchemaTestCase]] = js.undefined
}
object SchemaTestSuite {
  
  inline def apply(): SchemaTestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSuite]
  }
  
  extension [Self <: SchemaTestSuite](x: Self) {
    
    inline def setTestCases(value: js.Array[SchemaTestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: SchemaTestCase*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
