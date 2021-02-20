package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a test case.  Test case references are canonically ordered
  * lexicographically by these three factors: * First, by test_suite_name. *
  * Second, by class_name. * Third, by name.
  */
@js.native
trait SchemaTestCaseReference extends StObject {
  
  /**
    * The name of the class.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * The name of the test case.  Required.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The name of the test suite to which this test case belongs.
    */
  var testSuiteName: js.UndefOr[String] = js.native
}
object SchemaTestCaseReference {
  
  @scala.inline
  def apply(): SchemaTestCaseReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestCaseReference]
  }
  
  @scala.inline
  implicit class SchemaTestCaseReferenceMutableBuilder[Self <: SchemaTestCaseReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTestSuiteName(value: String): Self = StObject.set(x, "testSuiteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSuiteNameUndefined: Self = StObject.set(x, "testSuiteName", js.undefined)
  }
}
