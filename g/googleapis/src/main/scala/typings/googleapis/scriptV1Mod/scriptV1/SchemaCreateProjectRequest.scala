package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a script project.
  */
trait SchemaCreateProjectRequest extends StObject {
  
  /**
    * The Drive ID of a parent file that the created script project is bound
    * to. This is usually the ID of a Google Doc, Google Sheet, Google Form, or
    * Google Slides file. If not set, a standalone script project is created.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaCreateProjectRequest {
  
  @scala.inline
  def apply(): SchemaCreateProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateProjectRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateProjectRequestMutableBuilder[Self <: SchemaCreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
