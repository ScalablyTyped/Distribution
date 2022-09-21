package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesGet
  extends StObject
     with StandardParameters {
  
  /**
    * If field_mask is present, specifies the subset of Instance fields that should be returned. If absent, all Instance fields are returned.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the requested instance. Values are of the form `projects//instances/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesGet {
  
  inline def apply(): ParamsResourceProjectsInstancesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesGet]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesGet](x: Self) {
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
