package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkService extends StObject {
  
  /**
    * Service provided to or by the linked account. Acceptable values are: - "`shoppingActionsOrderManagement`" - "`shoppingActionsProductManagement`" - "`shoppingAdsProductManagement`" - "`paymentProcessing`"
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the link Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaLinkService {
  
  inline def apply(): SchemaLinkService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkService]
  }
  
  extension [Self <: SchemaLinkService](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
