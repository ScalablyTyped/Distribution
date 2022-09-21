package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFederationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the metastore federation to retrieve, in the following form:projects/{project_number\}/locations/{location_id\}/federations/{federation_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsFederationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsFederationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFederationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFederationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
