package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRulesetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for the ruleset to get. Format: `projects/{project_id\}/rulesets/{ruleset_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRulesetsGet {
  
  inline def apply(): ParamsResourceProjectsRulesetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRulesetsGet]
  }
  
  extension [Self <: ParamsResourceProjectsRulesetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
