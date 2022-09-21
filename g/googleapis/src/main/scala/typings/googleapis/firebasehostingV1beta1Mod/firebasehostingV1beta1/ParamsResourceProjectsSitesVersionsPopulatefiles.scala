package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSitesVersionsPopulatefiles
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The version to which to add files, in the format: sites/SITE_ID /versions/VERSION_ID
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPopulateVersionFilesRequest] = js.undefined
}
object ParamsResourceProjectsSitesVersionsPopulatefiles {
  
  inline def apply(): ParamsResourceProjectsSitesVersionsPopulatefiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSitesVersionsPopulatefiles]
  }
  
  extension [Self <: ParamsResourceProjectsSitesVersionsPopulatefiles](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaPopulateVersionFilesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
