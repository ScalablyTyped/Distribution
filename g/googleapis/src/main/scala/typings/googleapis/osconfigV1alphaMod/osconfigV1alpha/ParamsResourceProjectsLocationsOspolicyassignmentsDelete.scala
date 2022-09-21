package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOspolicyassignmentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the OS policy assignment to be deleted
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsOspolicyassignmentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsOspolicyassignmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOspolicyassignmentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOspolicyassignmentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
