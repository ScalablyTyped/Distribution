package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the instance to be deleted. Values are of the form `projects//instances/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDelete {
  
  inline def apply(): ParamsResourceProjectsInstancesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
