package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsIndexesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource ID of the index to get.
    */
  var indexId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID against which to make the request.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsIndexesGet {
  
  inline def apply(): ParamsResourceProjectsIndexesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsIndexesGet]
  }
  
  extension [Self <: ParamsResourceProjectsIndexesGet](x: Self) {
    
    inline def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
