package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the parent resource where the tag will be created.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTag] = js.undefined
  
  /**
    * The tag id to use for this repository.
    */
  var tagId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTag): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTagId(value: String): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    inline def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
  }
}
