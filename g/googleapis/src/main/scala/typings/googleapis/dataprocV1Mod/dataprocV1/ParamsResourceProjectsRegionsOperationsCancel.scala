package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsOperationsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource to be cancelled.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsOperationsCancel {
  
  inline def apply(): ParamsResourceProjectsRegionsOperationsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsOperationsCancel]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsOperationsCancel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
