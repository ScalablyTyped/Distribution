package typings.googleapis.policysimulatorV1beta1Mod.policysimulatorV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersLocationsReplaysCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource where this Replay will be created. This resource must be a project, folder, or organization with a location. Example: `projects/my-example-project/locations/global`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1beta1Replay] = js.undefined
}
object ParamsResourceFoldersLocationsReplaysCreate {
  
  inline def apply(): ParamsResourceFoldersLocationsReplaysCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersLocationsReplaysCreate]
  }
  
  extension [Self <: ParamsResourceFoldersLocationsReplaysCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudPolicysimulatorV1beta1Replay): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
