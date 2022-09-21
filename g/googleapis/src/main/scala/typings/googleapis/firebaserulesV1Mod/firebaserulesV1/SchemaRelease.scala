package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelease extends StObject {
  
  /**
    * Output only. Time the release was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Format: `projects/{project_id\}/releases/{release_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the `Release` to be created.
    */
  var rulesetName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time the release was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelease {
  
  inline def apply(): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelease]
  }
  
  extension [Self <: SchemaRelease](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRulesetName(value: String): Self = StObject.set(x, "rulesetName", value.asInstanceOf[js.Any])
    
    inline def setRulesetNameNull: Self = StObject.set(x, "rulesetName", null)
    
    inline def setRulesetNameUndefined: Self = StObject.set(x, "rulesetName", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
