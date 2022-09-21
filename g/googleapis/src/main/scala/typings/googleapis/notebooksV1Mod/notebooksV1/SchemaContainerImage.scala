package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainerImage extends StObject {
  
  /**
    * Required. The path to the container image repository. For example: `gcr.io/{project_id\}/{image_name\}`
    */
  var repository: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tag of the container image. If not specified, this defaults to the latest tag.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaContainerImage {
  
  inline def apply(): SchemaContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerImage]
  }
  
  extension [Self <: SchemaContainerImage](x: Self) {
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
