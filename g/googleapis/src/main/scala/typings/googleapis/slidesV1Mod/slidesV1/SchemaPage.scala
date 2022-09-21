package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPage extends StObject {
  
  /**
    * Layout specific properties. Only set if page_type = LAYOUT.
    */
  var layoutProperties: js.UndefOr[SchemaLayoutProperties] = js.undefined
  
  /**
    * Master specific properties. Only set if page_type = MASTER.
    */
  var masterProperties: js.UndefOr[SchemaMasterProperties] = js.undefined
  
  /**
    * Notes specific properties. Only set if page_type = NOTES.
    */
  var notesProperties: js.UndefOr[SchemaNotesProperties] = js.undefined
  
  /**
    * The object ID for this page. Object IDs used by Page and PageElement share the same namespace.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The page elements rendered on the page.
    */
  var pageElements: js.UndefOr[js.Array[SchemaPageElement]] = js.undefined
  
  /**
    * The properties of the page.
    */
  var pageProperties: js.UndefOr[SchemaPageProperties] = js.undefined
  
  /**
    * The type of the page.
    */
  var pageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The revision ID of the presentation. Can be used in update requests to assert the presentation revision hasn't changed since the last read operation. Only populated if the user has edit access to the presentation. The revision ID is not a sequential number but an opaque string. The format of the revision ID might change over time. A returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and cannot be shared across users. If the revision ID is unchanged between calls, then the presentation has not changed. Conversely, a changed ID (for the same presentation and user) usually means the presentation has been updated. However, a changed ID can also be due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Slide specific properties. Only set if page_type = SLIDE.
    */
  var slideProperties: js.UndefOr[SchemaSlideProperties] = js.undefined
}
object SchemaPage {
  
  inline def apply(): SchemaPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPage]
  }
  
  extension [Self <: SchemaPage](x: Self) {
    
    inline def setLayoutProperties(value: SchemaLayoutProperties): Self = StObject.set(x, "layoutProperties", value.asInstanceOf[js.Any])
    
    inline def setLayoutPropertiesUndefined: Self = StObject.set(x, "layoutProperties", js.undefined)
    
    inline def setMasterProperties(value: SchemaMasterProperties): Self = StObject.set(x, "masterProperties", value.asInstanceOf[js.Any])
    
    inline def setMasterPropertiesUndefined: Self = StObject.set(x, "masterProperties", js.undefined)
    
    inline def setNotesProperties(value: SchemaNotesProperties): Self = StObject.set(x, "notesProperties", value.asInstanceOf[js.Any])
    
    inline def setNotesPropertiesUndefined: Self = StObject.set(x, "notesProperties", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPageElements(value: js.Array[SchemaPageElement]): Self = StObject.set(x, "pageElements", value.asInstanceOf[js.Any])
    
    inline def setPageElementsUndefined: Self = StObject.set(x, "pageElements", js.undefined)
    
    inline def setPageElementsVarargs(value: SchemaPageElement*): Self = StObject.set(x, "pageElements", js.Array(value*))
    
    inline def setPageProperties(value: SchemaPageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
    
    inline def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
    
    inline def setPageType(value: String): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    
    inline def setPageTypeNull: Self = StObject.set(x, "pageType", null)
    
    inline def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setSlideProperties(value: SchemaSlideProperties): Self = StObject.set(x, "slideProperties", value.asInstanceOf[js.Any])
    
    inline def setSlidePropertiesUndefined: Self = StObject.set(x, "slideProperties", js.undefined)
  }
}
