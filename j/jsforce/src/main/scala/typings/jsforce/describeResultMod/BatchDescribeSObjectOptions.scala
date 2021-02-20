package typings.jsforce.describeResultMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDescribeSObjectOptions extends StObject {
  
  var autofetch: js.UndefOr[Boolean] = js.native
  
  var maxConcurrentRequests: js.UndefOr[Double] = js.native
  
  var types: js.Array[String] = js.native
}
object BatchDescribeSObjectOptions {
  
  @scala.inline
  def apply(types: js.Array[String]): BatchDescribeSObjectOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeSObjectOptions]
  }
  
  @scala.inline
  implicit class BatchDescribeSObjectOptionsMutableBuilder[Self <: BatchDescribeSObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutofetch(value: Boolean): Self = StObject.set(x, "autofetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofetchUndefined: Self = StObject.set(x, "autofetch", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRequestsUndefined: Self = StObject.set(x, "maxConcurrentRequests", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
