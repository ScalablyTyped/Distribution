package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for FirebaseRulesService.ListRulesets.
  */
@js.native
trait SchemaListRulesetsResponse extends js.Object {
  
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * List of `Ruleset` instances.
    */
  var rulesets: js.UndefOr[js.Array[SchemaRuleset]] = js.native
}
object SchemaListRulesetsResponse {
  
  @scala.inline
  def apply(): SchemaListRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRulesetsResponse]
  }
  
  @scala.inline
  implicit class SchemaListRulesetsResponseOps[Self <: SchemaListRulesetsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setRulesetsVarargs(value: SchemaRuleset*): Self = this.set("rulesets", js.Array(value :_*))
    
    @scala.inline
    def setRulesets(value: js.Array[SchemaRuleset]): Self = this.set("rulesets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesets: Self = this.set("rulesets", js.undefined)
  }
}
