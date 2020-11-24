package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A summary of a test suite result either parsed from XML or uploaded
  * directly by a user.  Note: the API related comments are for StepService
  * only. This message is also being used in ExecutionService in a read only
  * mode for the corresponding step.
  */
@js.native
trait SchemaTestSuiteOverview extends js.Object {
  
  /**
    * Number of test cases in error, typically set by the service by parsing
    * the xml_source.  - In create/response: always set - In update request:
    * never
    */
  var errorCount: js.UndefOr[Double] = js.native
  
  /**
    * Number of failed test cases, typically set by the service by parsing the
    * xml_source. May also be set by the user.  - In create/response: always
    * set - In update request: never
    */
  var failureCount: js.UndefOr[Double] = js.native
  
  /**
    * The name of the test suite.  - In create/response: always set - In update
    * request: never
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Number of test cases not run, typically set by the service by parsing the
    * xml_source.  - In create/response: always set - In update request: never
    */
  var skippedCount: js.UndefOr[Double] = js.native
  
  /**
    * Number of test cases, typically set by the service by parsing the
    * xml_source.  - In create/response: always set - In update request: never
    */
  var totalCount: js.UndefOr[Double] = js.native
  
  /**
    * If this test suite was parsed from XML, this is the URI where the
    * original XML file is stored.  Note: Multiple test suites can share the
    * same xml_source  Returns INVALID_ARGUMENT if the uri format is not
    * supported.  - In create/response: optional - In update request: never
    */
  var xmlSource: js.UndefOr[SchemaFileReference] = js.native
}
object SchemaTestSuiteOverview {
  
  @scala.inline
  def apply(): SchemaTestSuiteOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSuiteOverview]
  }
  
  @scala.inline
  implicit class SchemaTestSuiteOverviewOps[Self <: SchemaTestSuiteOverview] (val x: Self) extends AnyVal {
    
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
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCount: Self = this.set("errorCount", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Double): Self = this.set("failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCount: Self = this.set("failureCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSkippedCount(value: Double): Self = this.set("skippedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippedCount: Self = this.set("skippedCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
    
    @scala.inline
    def setXmlSource(value: SchemaFileReference): Self = this.set("xmlSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlSource: Self = this.set("xmlSource", js.undefined)
  }
}
