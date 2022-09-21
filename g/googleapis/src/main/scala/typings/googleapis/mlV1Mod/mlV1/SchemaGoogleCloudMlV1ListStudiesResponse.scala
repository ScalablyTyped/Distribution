package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ListStudiesResponse extends StObject {
  
  /**
    * The studies associated with the project.
    */
  var studies: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Study]] = js.undefined
}
object SchemaGoogleCloudMlV1ListStudiesResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1ListStudiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListStudiesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ListStudiesResponse](x: Self) {
    
    inline def setStudies(value: js.Array[SchemaGoogleCloudMlV1Study]): Self = StObject.set(x, "studies", value.asInstanceOf[js.Any])
    
    inline def setStudiesUndefined: Self = StObject.set(x, "studies", js.undefined)
    
    inline def setStudiesVarargs(value: SchemaGoogleCloudMlV1Study*): Self = StObject.set(x, "studies", js.Array(value*))
  }
}
