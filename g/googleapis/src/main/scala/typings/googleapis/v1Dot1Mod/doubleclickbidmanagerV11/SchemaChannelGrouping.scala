package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelGrouping extends StObject {
  
  /**
    * The name to apply to an event that does not match any of the rules in the channel grouping.
    */
  var fallbackName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel Grouping name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rules within Channel Grouping. There is a limit of 100 rules that can be set per channel grouping.
    */
  var rules: js.UndefOr[js.Array[SchemaRule]] = js.undefined
}
object SchemaChannelGrouping {
  
  inline def apply(): SchemaChannelGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelGrouping]
  }
  
  extension [Self <: SchemaChannelGrouping](x: Self) {
    
    inline def setFallbackName(value: String): Self = StObject.set(x, "fallbackName", value.asInstanceOf[js.Any])
    
    inline def setFallbackNameNull: Self = StObject.set(x, "fallbackName", null)
    
    inline def setFallbackNameUndefined: Self = StObject.set(x, "fallbackName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: js.Array[SchemaRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
