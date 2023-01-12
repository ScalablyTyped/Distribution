package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeSObjectOptions extends StObject {
  
  var autofetch: js.UndefOr[Boolean] = js.undefined
  
  var maxConcurrentRequests: js.UndefOr[Double] = js.undefined
  
  var types: js.Array[String]
}
object BatchDescribeSObjectOptions {
  
  inline def apply(types: js.Array[String]): BatchDescribeSObjectOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeSObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDescribeSObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setAutofetch(value: Boolean): Self = StObject.set(x, "autofetch", value.asInstanceOf[js.Any])
    
    inline def setAutofetchUndefined: Self = StObject.set(x, "autofetch", js.undefined)
    
    inline def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentRequestsUndefined: Self = StObject.set(x, "maxConcurrentRequests", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
