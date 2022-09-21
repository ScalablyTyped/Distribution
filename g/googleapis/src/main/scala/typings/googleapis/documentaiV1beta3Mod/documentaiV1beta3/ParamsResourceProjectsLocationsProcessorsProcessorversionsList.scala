package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProcessorsProcessorversionsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of processor versions to return. If unspecified, at most 10 processor versions will be returned. The maximum value is 20; values above 20 will be coerced to 20.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * We will return the processor versions sorted by creation time. The page token will point to the next processor version.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent (project, location and processor) to list all versions. Format: `projects/{project\}/locations/{location\}/processors/{processor\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsProcessorsProcessorversionsList {
  
  inline def apply(): ParamsResourceProjectsLocationsProcessorsProcessorversionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProcessorsProcessorversionsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProcessorsProcessorversionsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
