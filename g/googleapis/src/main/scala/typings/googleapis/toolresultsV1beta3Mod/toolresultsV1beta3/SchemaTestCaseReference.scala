package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestCaseReference extends StObject {
  
  /**
    * The name of the class.
    */
  var className: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the test case. Required.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the test suite to which this test case belongs.
    */
  var testSuiteName: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestCaseReference {
  
  inline def apply(): SchemaTestCaseReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestCaseReference]
  }
  
  extension [Self <: SchemaTestCaseReference](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestSuiteName(value: String): Self = StObject.set(x, "testSuiteName", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteNameNull: Self = StObject.set(x, "testSuiteName", null)
    
    inline def setTestSuiteNameUndefined: Self = StObject.set(x, "testSuiteName", js.undefined)
  }
}
