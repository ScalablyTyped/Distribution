package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTestmatricesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Cloud project that owns the test matrix.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique test matrix id which was assigned by the service.
    */
  var testMatrixId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTestmatricesGet {
  
  inline def apply(): ParamsResourceProjectsTestmatricesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTestmatricesGet]
  }
  
  extension [Self <: ParamsResourceProjectsTestmatricesGet](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTestMatrixId(value: String): Self = StObject.set(x, "testMatrixId", value.asInstanceOf[js.Any])
    
    inline def setTestMatrixIdUndefined: Self = StObject.set(x, "testMatrixId", js.undefined)
  }
}
