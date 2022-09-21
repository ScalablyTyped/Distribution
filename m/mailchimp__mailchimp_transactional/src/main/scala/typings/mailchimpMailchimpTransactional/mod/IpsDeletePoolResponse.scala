package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsDeletePoolResponse extends StObject {
  
  /** whether the pool was deleted */
  var deleted: Boolean
  
  /** the name of the pool */
  var pool: String
}
object IpsDeletePoolResponse {
  
  inline def apply(deleted: Boolean, pool: String): IpsDeletePoolResponse = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsDeletePoolResponse]
  }
  
  extension [Self <: IpsDeletePoolResponse](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
