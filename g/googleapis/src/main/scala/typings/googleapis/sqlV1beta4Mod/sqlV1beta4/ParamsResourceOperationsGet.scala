package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOperationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Instance operation ID.
    */
  var operation: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the project that contains the instance.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceOperationsGet {
  
  inline def apply(): ParamsResourceOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOperationsGet]
  }
  
  extension [Self <: ParamsResourceOperationsGet](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
