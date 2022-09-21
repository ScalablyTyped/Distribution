package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCompositetypesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the type for this request.
    */
  var compositeType: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceCompositetypesDelete {
  
  inline def apply(): ParamsResourceCompositetypesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCompositetypesDelete]
  }
  
  extension [Self <: ParamsResourceCompositetypesDelete](x: Self) {
    
    inline def setCompositeType(value: String): Self = StObject.set(x, "compositeType", value.asInstanceOf[js.Any])
    
    inline def setCompositeTypeUndefined: Self = StObject.set(x, "compositeType", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
