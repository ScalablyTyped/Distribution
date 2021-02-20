package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.maximMazurokGapiClientAdexchangebuyer.anon.ArcStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeDealIds extends StObject {
  
  /** A list of external deal ids and ARC approval status. */
  var dealStatuses: js.UndefOr[js.Array[ArcStatus]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object CreativeDealIds {
  
  @scala.inline
  def apply(): CreativeDealIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDealIds]
  }
  
  @scala.inline
  implicit class CreativeDealIdsMutableBuilder[Self <: CreativeDealIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDealStatuses(value: js.Array[ArcStatus]): Self = StObject.set(x, "dealStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealStatusesUndefined: Self = StObject.set(x, "dealStatuses", js.undefined)
    
    @scala.inline
    def setDealStatusesVarargs(value: ArcStatus*): Self = StObject.set(x, "dealStatuses", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
