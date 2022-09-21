package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRevisionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the revision to retrieve. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRevisionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRevisionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRevisionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRevisionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
