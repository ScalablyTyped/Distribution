package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFunctionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the function which details should be obtained.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsFunctionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsFunctionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFunctionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFunctionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
