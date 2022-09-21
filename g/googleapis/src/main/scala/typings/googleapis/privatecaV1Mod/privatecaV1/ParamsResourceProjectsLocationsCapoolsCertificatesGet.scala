package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapoolsCertificatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Certificate to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCapoolsCertificatesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCapoolsCertificatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapoolsCertificatesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapoolsCertificatesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
