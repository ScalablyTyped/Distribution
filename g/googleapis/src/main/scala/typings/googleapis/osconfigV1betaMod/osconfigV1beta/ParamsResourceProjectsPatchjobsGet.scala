package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPatchjobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the patch in the form `projects/x/patchJobs/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsPatchjobsGet {
  
  inline def apply(): ParamsResourceProjectsPatchjobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPatchjobsGet]
  }
  
  extension [Self <: ParamsResourceProjectsPatchjobsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
