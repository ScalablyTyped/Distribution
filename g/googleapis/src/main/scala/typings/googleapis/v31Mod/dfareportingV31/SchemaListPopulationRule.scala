package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remarketing List Population Rule.
  */
@js.native
trait SchemaListPopulationRule extends js.Object {
  
  /**
    * Floodlight activity ID associated with this rule. This field can be left
    * blank.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /**
    * Name of floodlight activity associated with this rule. This is a
    * read-only, auto-generated field.
    */
  var floodlightActivityName: js.UndefOr[String] = js.native
  
  /**
    * Clauses that make up this list population rule. Clauses are joined by
    * ANDs, and the clauses themselves are made up of list population terms
    * which are joined by ORs.
    */
  var listPopulationClauses: js.UndefOr[js.Array[SchemaListPopulationClause]] = js.native
}
object SchemaListPopulationRule {
  
  @scala.inline
  def apply(): SchemaListPopulationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationRule]
  }
  
  @scala.inline
  implicit class SchemaListPopulationRuleOps[Self <: SchemaListPopulationRule] (val x: Self) extends AnyVal {
    
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
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    
    @scala.inline
    def setFloodlightActivityName(value: String): Self = this.set("floodlightActivityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityName: Self = this.set("floodlightActivityName", js.undefined)
    
    @scala.inline
    def setListPopulationClausesVarargs(value: SchemaListPopulationClause*): Self = this.set("listPopulationClauses", js.Array(value :_*))
    
    @scala.inline
    def setListPopulationClauses(value: js.Array[SchemaListPopulationClause]): Self = this.set("listPopulationClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListPopulationClauses: Self = this.set("listPopulationClauses", js.undefined)
  }
}
