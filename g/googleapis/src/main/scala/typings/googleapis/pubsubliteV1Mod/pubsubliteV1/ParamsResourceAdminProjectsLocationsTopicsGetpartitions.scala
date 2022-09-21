package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsTopicsGetpartitions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The topic whose partition information to return.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsTopicsGetpartitions {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsTopicsGetpartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsTopicsGetpartitions]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsTopicsGetpartitions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
