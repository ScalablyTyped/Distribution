package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCustomresourcedefinitionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the CustomResourceDefinition being retrieved. If needed, replace {namespace_id\} with the project ID.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCustomresourcedefinitionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCustomresourcedefinitionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCustomresourcedefinitionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCustomresourcedefinitionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
