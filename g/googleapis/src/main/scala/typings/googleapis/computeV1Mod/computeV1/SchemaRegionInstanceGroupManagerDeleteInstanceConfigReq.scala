package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq extends StObject {
  
  /**
    * The list of instance names for which we want to delete per-instance configs on this managed instance group.
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq {
  
  inline def apply(): SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagerDeleteInstanceConfigReq](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
