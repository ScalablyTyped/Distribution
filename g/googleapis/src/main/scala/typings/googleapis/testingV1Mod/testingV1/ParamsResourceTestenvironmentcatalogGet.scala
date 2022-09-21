package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTestenvironmentcatalogGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The type of environment that should be listed.
    */
  var environmentType: js.UndefOr[String] = js.undefined
  
  /**
    * For authorization, the cloud project requesting the TestEnvironmentCatalog.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTestenvironmentcatalogGet {
  
  inline def apply(): ParamsResourceTestenvironmentcatalogGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTestenvironmentcatalogGet]
  }
  
  extension [Self <: ParamsResourceTestenvironmentcatalogGet](x: Self) {
    
    inline def setEnvironmentType(value: String): Self = StObject.set(x, "environmentType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTypeUndefined: Self = StObject.set(x, "environmentType", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
