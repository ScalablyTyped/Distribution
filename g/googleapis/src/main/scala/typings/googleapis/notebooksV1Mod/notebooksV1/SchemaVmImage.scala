package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmImage extends StObject {
  
  /**
    * Use this VM image family to find the image; the newest image in this family will be used.
    */
  var imageFamily: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use VM image name to find the image.
    */
  var imageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the Google Cloud project that this VM image belongs to. Format: `{project_id\}`
    */
  var project: js.UndefOr[String | Null] = js.undefined
}
object SchemaVmImage {
  
  inline def apply(): SchemaVmImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmImage]
  }
  
  extension [Self <: SchemaVmImage](x: Self) {
    
    inline def setImageFamily(value: String): Self = StObject.set(x, "imageFamily", value.asInstanceOf[js.Any])
    
    inline def setImageFamilyNull: Self = StObject.set(x, "imageFamily", null)
    
    inline def setImageFamilyUndefined: Self = StObject.set(x, "imageFamily", js.undefined)
    
    inline def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
    
    inline def setImageNameNull: Self = StObject.set(x, "imageName", null)
    
    inline def setImageNameUndefined: Self = StObject.set(x, "imageName", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
