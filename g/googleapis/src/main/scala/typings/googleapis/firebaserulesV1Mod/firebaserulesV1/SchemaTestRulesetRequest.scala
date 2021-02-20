package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for FirebaseRulesService.TestRuleset.
  */
@js.native
trait SchemaTestRulesetRequest extends StObject {
  
  /**
    * Optional `Source` to be checked for correctness.  This field must not be
    * set when the resource name refers to a `Ruleset`.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  
  /**
    * Inline `TestSuite` to run.
    */
  var testSuite: js.UndefOr[SchemaTestSuite] = js.native
}
object SchemaTestRulesetRequest {
  
  @scala.inline
  def apply(): SchemaTestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestRulesetRequest]
  }
  
  @scala.inline
  implicit class SchemaTestRulesetRequestMutableBuilder[Self <: SchemaTestRulesetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTestSuite(value: SchemaTestSuite): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSuiteUndefined: Self = StObject.set(x, "testSuite", js.undefined)
  }
}
