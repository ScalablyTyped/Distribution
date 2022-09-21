package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestSuiteOverview extends StObject {
  
  /**
    * Elapsed time of test suite.
    */
  var elapsedTime: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * Number of test cases in error, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
    */
  var errorCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of failed test cases, typically set by the service by parsing the xml_source. May also be set by the user. - In create/response: always set - In update request: never
    */
  var failureCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of flaky test cases, set by the service by rolling up flaky test attempts. Present only for rollup test suite overview at environment level. A step cannot have flaky test cases.
    */
  var flakyCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the test suite. - In create/response: always set - In update request: never
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of test cases not run, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
    */
  var skippedCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of test cases, typically set by the service by parsing the xml_source. - In create/response: always set - In update request: never
    */
  var totalCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If this test suite was parsed from XML, this is the URI where the original XML file is stored. Note: Multiple test suites can share the same xml_source Returns INVALID_ARGUMENT if the uri format is not supported. - In create/response: optional - In update request: never
    */
  var xmlSource: js.UndefOr[SchemaFileReference] = js.undefined
}
object SchemaTestSuiteOverview {
  
  inline def apply(): SchemaTestSuiteOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSuiteOverview]
  }
  
  extension [Self <: SchemaTestSuiteOverview](x: Self) {
    
    inline def setElapsedTime(value: SchemaDuration): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountNull: Self = StObject.set(x, "errorCount", null)
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCountNull: Self = StObject.set(x, "failureCount", null)
    
    inline def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    inline def setFlakyCount(value: Double): Self = StObject.set(x, "flakyCount", value.asInstanceOf[js.Any])
    
    inline def setFlakyCountNull: Self = StObject.set(x, "flakyCount", null)
    
    inline def setFlakyCountUndefined: Self = StObject.set(x, "flakyCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSkippedCount(value: Double): Self = StObject.set(x, "skippedCount", value.asInstanceOf[js.Any])
    
    inline def setSkippedCountNull: Self = StObject.set(x, "skippedCount", null)
    
    inline def setSkippedCountUndefined: Self = StObject.set(x, "skippedCount", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    inline def setXmlSource(value: SchemaFileReference): Self = StObject.set(x, "xmlSource", value.asInstanceOf[js.Any])
    
    inline def setXmlSourceUndefined: Self = StObject.set(x, "xmlSource", js.undefined)
  }
}
