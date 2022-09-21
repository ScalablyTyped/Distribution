package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstanceconfigsOperationsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource to be cancelled.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstanceconfigsOperationsCancel {
  
  inline def apply(): ParamsResourceProjectsInstanceconfigsOperationsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstanceconfigsOperationsCancel]
  }
  
  extension [Self <: ParamsResourceProjectsInstanceconfigsOperationsCancel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
