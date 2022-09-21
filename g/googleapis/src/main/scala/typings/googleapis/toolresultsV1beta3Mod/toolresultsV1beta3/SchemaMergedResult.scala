package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMergedResult extends StObject {
  
  /**
    * Outcome of the resource
    */
  var outcome: js.UndefOr[SchemaOutcome] = js.undefined
  
  /**
    * State of the resource
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The combined and rolled-up result of each test suite that was run as part of this environment. Combining: When the test cases from a suite are run in different steps (sharding), the results are added back together in one overview. (e.g., if shard1 has 2 failures and shard2 has 1 failure than the overview failure_count = 3). Rollup: When test cases from the same suite are run multiple times (flaky), the results are combined (e.g., if testcase1.run1 fails, testcase1.run2 passes, and both testcase2.run1 and testcase2.run2 fail then the overview flaky_count = 1 and failure_count = 1).
    */
  var testSuiteOverviews: js.UndefOr[js.Array[SchemaTestSuiteOverview]] = js.undefined
}
object SchemaMergedResult {
  
  inline def apply(): SchemaMergedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergedResult]
  }
  
  extension [Self <: SchemaMergedResult](x: Self) {
    
    inline def setOutcome(value: SchemaOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTestSuiteOverviews(value: js.Array[SchemaTestSuiteOverview]): Self = StObject.set(x, "testSuiteOverviews", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteOverviewsUndefined: Self = StObject.set(x, "testSuiteOverviews", js.undefined)
    
    inline def setTestSuiteOverviewsVarargs(value: SchemaTestSuiteOverview*): Self = StObject.set(x, "testSuiteOverviews", js.Array(value*))
  }
}
