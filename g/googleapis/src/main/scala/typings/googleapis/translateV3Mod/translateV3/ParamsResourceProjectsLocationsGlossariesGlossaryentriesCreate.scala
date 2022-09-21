package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the glossary to create the entry under.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGlossaryEntry] = js.undefined
}
object ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlossariesGlossaryentriesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGlossaryEntry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
