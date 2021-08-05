package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for FirebaseRulesService.TestRuleset.
  */
trait SchemaTestRulesetRequest extends StObject {
  
  /**
    * Optional `Source` to be checked for correctness.  This field must not be
    * set when the resource name refers to a `Ruleset`.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
  
  /**
    * Inline `TestSuite` to run.
    */
  var testSuite: js.UndefOr[SchemaTestSuite] = js.undefined
}
object SchemaTestRulesetRequest {
  
  inline def apply(): SchemaTestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestRulesetRequest]
  }
  
  extension [Self <: SchemaTestRulesetRequest](x: Self) {
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTestSuite(value: SchemaTestSuite): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteUndefined: Self = StObject.set(x, "testSuite", js.undefined)
  }
}
