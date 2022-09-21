package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleapis.anon.ArcStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeDealIds extends StObject {
  
  /**
    * A list of external deal ids and ARC approval status.
    */
  var dealStatuses: js.UndefOr[js.Array[ArcStatus] | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeDealIds {
  
  inline def apply(): SchemaCreativeDealIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDealIds]
  }
  
  extension [Self <: SchemaCreativeDealIds](x: Self) {
    
    inline def setDealStatuses(value: js.Array[ArcStatus]): Self = StObject.set(x, "dealStatuses", value.asInstanceOf[js.Any])
    
    inline def setDealStatusesNull: Self = StObject.set(x, "dealStatuses", null)
    
    inline def setDealStatusesUndefined: Self = StObject.set(x, "dealStatuses", js.undefined)
    
    inline def setDealStatusesVarargs(value: ArcStatus*): Self = StObject.set(x, "dealStatuses", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
