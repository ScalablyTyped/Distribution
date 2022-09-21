package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsDeletePoolRequest
  extends StObject
     with BaseRequest {
  
  /** the name of the pool to delete */
  var pool: String
}
object IpsDeletePoolRequest {
  
  inline def apply(pool: String): IpsDeletePoolRequest = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsDeletePoolRequest]
  }
  
  extension [Self <: IpsDeletePoolRequest](x: Self) {
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
