package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a test case.  Test case references are canonically ordered
  * lexicographically by these three factors: * First, by test_suite_name. *
  * Second, by class_name. * Third, by name.
  */
@js.native
trait SchemaTestCaseReference extends js.Object {
  
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
  implicit class SchemaTestCaseReferenceOps[Self <: SchemaTestCaseReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTestSuiteName(value: String): Self = this.set("testSuiteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSuiteName: Self = this.set("testSuiteName", js.undefined)
  }
}
