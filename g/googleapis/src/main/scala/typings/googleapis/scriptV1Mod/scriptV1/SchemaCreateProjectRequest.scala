package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateProjectRequest extends StObject {
  
  /**
    * The Drive ID of a parent file that the created script project is bound to. This is usually the ID of a Google Doc, Google Sheet, Google Form, or Google Slides file. If not set, a standalone script project is created.
    */
  var parentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateProjectRequest {
  
  inline def apply(): SchemaCreateProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateProjectRequest]
  }
  
  extension [Self <: SchemaCreateProjectRequest](x: Self) {
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdNull: Self = StObject.set(x, "parentId", null)
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
