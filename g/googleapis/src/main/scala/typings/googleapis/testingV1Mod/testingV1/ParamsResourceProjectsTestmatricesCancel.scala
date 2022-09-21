package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTestmatricesCancel
  extends StObject
     with StandardParameters {
  
  /**
    * Cloud project that owns the test.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Test matrix that will be canceled.
    */
  var testMatrixId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTestmatricesCancel {
  
  inline def apply(): ParamsResourceProjectsTestmatricesCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTestmatricesCancel]
  }
  
  extension [Self <: ParamsResourceProjectsTestmatricesCancel](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTestMatrixId(value: String): Self = StObject.set(x, "testMatrixId", value.asInstanceOf[js.Any])
    
    inline def setTestMatrixIdUndefined: Self = StObject.set(x, "testMatrixId", js.undefined)
  }
}
