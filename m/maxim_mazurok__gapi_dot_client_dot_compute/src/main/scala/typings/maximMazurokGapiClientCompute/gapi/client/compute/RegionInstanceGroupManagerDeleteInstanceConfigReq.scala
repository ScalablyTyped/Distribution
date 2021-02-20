package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupManagerDeleteInstanceConfigReq extends StObject {
  
  /** The list of instance names for which we want to delete per-instance configs on this managed instance group. */
  var names: js.UndefOr[js.Array[String]] = js.native
}
object RegionInstanceGroupManagerDeleteInstanceConfigReq {
  
  @scala.inline
  def apply(): RegionInstanceGroupManagerDeleteInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagerDeleteInstanceConfigReq]
  }
  
  @scala.inline
  implicit class RegionInstanceGroupManagerDeleteInstanceConfigReqMutableBuilder[Self <: RegionInstanceGroupManagerDeleteInstanceConfigReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
