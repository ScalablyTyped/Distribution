package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcStatus extends StObject {
  
  /** ARC approval status. */
  var arcStatus: js.UndefOr[String] = js.undefined
  
  /** External deal ID. */
  var dealId: js.UndefOr[String] = js.undefined
  
  /** Publisher ID. */
  var webPropertyId: js.UndefOr[Double] = js.undefined
}
object ArcStatus {
  
  inline def apply(): ArcStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcStatus] (val x: Self) extends AnyVal {
    
    inline def setArcStatus(value: String): Self = StObject.set(x, "arcStatus", value.asInstanceOf[js.Any])
    
    inline def setArcStatusUndefined: Self = StObject.set(x, "arcStatus", js.undefined)
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setWebPropertyId(value: Double): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
