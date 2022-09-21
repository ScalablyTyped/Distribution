package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsPoolInfoRequest
  extends StObject
     with BaseRequest {
  
  /** a pool name */
  var pool: String
}
object IpsPoolInfoRequest {
  
  inline def apply(pool: String): IpsPoolInfoRequest = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsPoolInfoRequest]
  }
  
  extension [Self <: IpsPoolInfoRequest](x: Self) {
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
