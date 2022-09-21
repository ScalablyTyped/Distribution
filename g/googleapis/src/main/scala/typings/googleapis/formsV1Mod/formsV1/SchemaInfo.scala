package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInfo extends StObject {
  
  /**
    * The description of the form.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The title of the document which is visible in Drive. If `Info.title` is empty, `document_title` may appear in its place in the Google Forms UI and be visible to responders. `document_title` can be set on create, but cannot be modified by a batchUpdate request. Please use the [Google Drive API](https://developers.google.com/drive/api/v3/reference/files/update) if you need to programmatically update `document_title`.
    */
  var documentTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The title of the form which is visible to responders.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaInfo {
  
  inline def apply(): SchemaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInfo]
  }
  
  extension [Self <: SchemaInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocumentTitle(value: String): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleNull: Self = StObject.set(x, "documentTitle", null)
    
    inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
