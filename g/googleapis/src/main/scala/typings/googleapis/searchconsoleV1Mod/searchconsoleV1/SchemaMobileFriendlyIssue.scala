package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileFriendlyIssue extends StObject {
  
  /**
    * Rule violated.
    */
  var rule: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileFriendlyIssue {
  
  inline def apply(): SchemaMobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileFriendlyIssue]
  }
  
  extension [Self <: SchemaMobileFriendlyIssue](x: Self) {
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleNull: Self = StObject.set(x, "rule", null)
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
