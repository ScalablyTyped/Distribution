package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsProvisionRequest
  extends StObject
     with BaseRequest {
  
  /** the id of the pool to add the dedicated ip to, or null to use your account's default pool */
  var pool: js.UndefOr[String] = js.undefined
  
  /** whether to enable warmup mode for the ip */
  var warmup: js.UndefOr[Boolean] = js.undefined
}
object IpsProvisionRequest {
  
  inline def apply(): IpsProvisionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpsProvisionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpsProvisionRequest] (val x: Self) extends AnyVal {
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setWarmup(value: Boolean): Self = StObject.set(x, "warmup", value.asInstanceOf[js.Any])
    
    inline def setWarmupUndefined: Self = StObject.set(x, "warmup", js.undefined)
  }
}
