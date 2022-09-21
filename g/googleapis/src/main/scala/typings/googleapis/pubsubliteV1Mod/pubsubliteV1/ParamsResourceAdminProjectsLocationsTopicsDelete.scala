package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsTopicsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the topic to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsTopicsDelete {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsTopicsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsTopicsDelete]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsTopicsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
