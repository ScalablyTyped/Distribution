package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A page in a presentation.
  */
@js.native
trait SchemaPage extends StObject {
  
  /**
    * Layout specific properties. Only set if page_type = LAYOUT.
    */
  var layoutProperties: js.UndefOr[SchemaLayoutProperties] = js.native
  
  /**
    * Master specific properties. Only set if page_type = MASTER.
    */
  var masterProperties: js.UndefOr[SchemaMasterProperties] = js.native
  
  /**
    * Notes specific properties. Only set if page_type = NOTES.
    */
  var notesProperties: js.UndefOr[SchemaNotesProperties] = js.native
  
  /**
    * The object ID for this page. Object IDs used by Page and PageElement
    * share the same namespace.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The page elements rendered on the page.
    */
  var pageElements: js.UndefOr[js.Array[SchemaPageElement]] = js.native
  
  /**
    * The properties of the page.
    */
  var pageProperties: js.UndefOr[SchemaPageProperties] = js.native
  
  /**
    * The type of the page.
    */
  var pageType: js.UndefOr[String] = js.native
  
  /**
    * The revision ID of the presentation containing this page. Can be used in
    * update requests to assert that the presentation revision hasn&#39;t
    * changed since the last read operation. Only populated if the user has
    * edit access to the presentation.  The format of the revision ID may
    * change over time, so it should be treated opaquely. A returned revision
    * ID is only guaranteed to be valid for 24 hours after it has been returned
    * and cannot be shared across users. If the revision ID is unchanged
    * between calls, then the presentation has not changed. Conversely, a
    * changed ID (for the same presentation and user) usually means the
    * presentation has been updated; however, a changed ID can also be due to
    * internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /**
    * Slide specific properties. Only set if page_type = SLIDE.
    */
  var slideProperties: js.UndefOr[SchemaSlideProperties] = js.native
}
object SchemaPage {
  
  @scala.inline
  def apply(): SchemaPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPage]
  }
  
  @scala.inline
  implicit class SchemaPageMutableBuilder[Self <: SchemaPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutProperties(value: SchemaLayoutProperties): Self = StObject.set(x, "layoutProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutPropertiesUndefined: Self = StObject.set(x, "layoutProperties", js.undefined)
    
    @scala.inline
    def setMasterProperties(value: SchemaMasterProperties): Self = StObject.set(x, "masterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterPropertiesUndefined: Self = StObject.set(x, "masterProperties", js.undefined)
    
    @scala.inline
    def setNotesProperties(value: SchemaNotesProperties): Self = StObject.set(x, "notesProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesPropertiesUndefined: Self = StObject.set(x, "notesProperties", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPageElements(value: js.Array[SchemaPageElement]): Self = StObject.set(x, "pageElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageElementsUndefined: Self = StObject.set(x, "pageElements", js.undefined)
    
    @scala.inline
    def setPageElementsVarargs(value: SchemaPageElement*): Self = StObject.set(x, "pageElements", js.Array(value :_*))
    
    @scala.inline
    def setPageProperties(value: SchemaPageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
    
    @scala.inline
    def setPageType(value: String): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setSlideProperties(value: SchemaSlideProperties): Self = StObject.set(x, "slideProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidePropertiesUndefined: Self = StObject.set(x, "slideProperties", js.undefined)
  }
}
