package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the entry. Format: "projects/x/locations/x/glossaries/x/glossaryEntries/x"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGlossaryEntry] = js.undefined
}
object ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlossariesGlossaryentriesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGlossaryEntry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
