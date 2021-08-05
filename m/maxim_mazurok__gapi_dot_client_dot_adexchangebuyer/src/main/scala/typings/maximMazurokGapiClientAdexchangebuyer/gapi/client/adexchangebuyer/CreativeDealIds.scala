package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.maximMazurokGapiClientAdexchangebuyer.anon.ArcStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeDealIds extends StObject {
  
  /** A list of external deal ids and ARC approval status. */
  var dealStatuses: js.UndefOr[js.Array[ArcStatus]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}
object CreativeDealIds {
  
  inline def apply(): CreativeDealIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDealIds]
  }
  
  extension [Self <: CreativeDealIds](x: Self) {
    
    inline def setDealStatuses(value: js.Array[ArcStatus]): Self = StObject.set(x, "dealStatuses", value.asInstanceOf[js.Any])
    
    inline def setDealStatusesUndefined: Self = StObject.set(x, "dealStatuses", js.undefined)
    
    inline def setDealStatusesVarargs(value: ArcStatus*): Self = StObject.set(x, "dealStatuses", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
