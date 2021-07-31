package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  /** A list of methods for which this property is required on requests. */
  var required: js.UndefOr[js.Array[String]] = js.undefined
}
object Required {
  
  @scala.inline
  def apply(): Required = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit class RequiredMutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
  }
}
