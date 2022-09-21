package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTriggersResponse extends StObject {
  
  /**
    * All GTM Triggers of a GTM Container.
    */
  var triggers: js.UndefOr[js.Array[SchemaTrigger]] = js.undefined
}
object SchemaListTriggersResponse {
  
  inline def apply(): SchemaListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTriggersResponse]
  }
  
  extension [Self <: SchemaListTriggersResponse](x: Self) {
    
    inline def setTriggers(value: js.Array[SchemaTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: SchemaTrigger*): Self = StObject.set(x, "triggers", js.Array(value*))
  }
}
