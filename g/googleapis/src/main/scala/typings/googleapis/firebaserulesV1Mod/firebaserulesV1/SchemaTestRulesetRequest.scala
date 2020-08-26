package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirebaseRulesService.TestRuleset.
  */
@js.native
trait SchemaTestRulesetRequest extends js.Object {
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
  implicit class SchemaTestRulesetRequestOps[Self <: SchemaTestRulesetRequest] (val x: Self) extends AnyVal {
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
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTestSuite(value: SchemaTestSuite): Self = this.set("testSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSuite: Self = this.set("testSuite", js.undefined)
  }
  
}

