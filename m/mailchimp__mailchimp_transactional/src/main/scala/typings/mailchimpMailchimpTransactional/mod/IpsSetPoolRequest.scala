package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsSetPoolRequest
  extends StObject
     with BaseRequest {
  
  /**
    * whether to create the pool if it does not exist; if false and the pool does not exist,
    * an Unknown_Pool will be thrown.
    */
  var create_pool: js.UndefOr[Boolean] = js.undefined
  
  /** a dedicated ip address */
  var ip: String
  
  /** the name of the new pool to add the dedicated ip to */
  var pool: String
}
object IpsSetPoolRequest {
  
  inline def apply(ip: String, pool: String): IpsSetPoolRequest = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsSetPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpsSetPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setCreate_pool(value: Boolean): Self = StObject.set(x, "create_pool", value.asInstanceOf[js.Any])
    
    inline def setCreate_poolUndefined: Self = StObject.set(x, "create_pool", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
