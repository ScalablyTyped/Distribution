package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelGrouping extends StObject {
  
  /**
    * ChannelGrouping fallback name.
    */
  var fallbackName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#channelGrouping.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ChannelGrouping name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rules contained within this channel grouping.
    */
  var rules: js.UndefOr[js.Array[SchemaChannelGroupingRule]] = js.undefined
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
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: js.Array[SchemaChannelGroupingRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaChannelGroupingRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
