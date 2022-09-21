package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the job to retrieve, such as "jobs/11111111".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceJobsGet {
  
  inline def apply(): ParamsResourceJobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsGet]
  }
  
  extension [Self <: ParamsResourceJobsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
