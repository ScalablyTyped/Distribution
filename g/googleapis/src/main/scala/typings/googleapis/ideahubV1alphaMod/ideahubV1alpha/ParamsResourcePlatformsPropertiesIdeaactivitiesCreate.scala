package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlatformsPropertiesIdeaactivitiesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource where this idea activity will be created. Format: platforms/{platform\}/property/{property\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleSearchIdeahubV1alphaIdeaActivity] = js.undefined
}
object ParamsResourcePlatformsPropertiesIdeaactivitiesCreate {
  
  inline def apply(): ParamsResourcePlatformsPropertiesIdeaactivitiesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlatformsPropertiesIdeaactivitiesCreate]
  }
  
  extension [Self <: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleSearchIdeahubV1alphaIdeaActivity): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
