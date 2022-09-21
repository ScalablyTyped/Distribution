package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocument extends StObject {
  
  /**
    * Output only. The main body of the document.
    */
  var body: js.UndefOr[SchemaBody] = js.undefined
  
  /**
    * Output only. The ID of the document.
    */
  var documentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The style of the document.
    */
  var documentStyle: js.UndefOr[SchemaDocumentStyle] = js.undefined
  
  /**
    * Output only. The footers in the document, keyed by footer ID.
    */
  var footers: js.UndefOr[StringDictionary[SchemaFooter] | Null] = js.undefined
  
  /**
    * Output only. The footnotes in the document, keyed by footnote ID.
    */
  var footnotes: js.UndefOr[StringDictionary[SchemaFootnote] | Null] = js.undefined
  
  /**
    * Output only. The headers in the document, keyed by header ID.
    */
  var headers: js.UndefOr[StringDictionary[SchemaHeader] | Null] = js.undefined
  
  /**
    * Output only. The inline objects in the document, keyed by object ID.
    */
  var inlineObjects: js.UndefOr[StringDictionary[SchemaInlineObject] | Null] = js.undefined
  
  /**
    * Output only. The lists in the document, keyed by list ID.
    */
  var lists: js.UndefOr[StringDictionary[SchemaList] | Null] = js.undefined
  
  /**
    * Output only. The named ranges in the document, keyed by name.
    */
  var namedRanges: js.UndefOr[StringDictionary[SchemaNamedRanges] | Null] = js.undefined
  
  /**
    * Output only. The named styles of the document.
    */
  var namedStyles: js.UndefOr[SchemaNamedStyles] = js.undefined
  
  /**
    * Output only. The positioned objects in the document, keyed by object ID.
    */
  var positionedObjects: js.UndefOr[StringDictionary[SchemaPositionedObject] | Null] = js.undefined
  
  /**
    * Output only. The revision ID of the document. Can be used in update requests to specify which revision of a document to apply updates to and how the request should behave if the document has been edited since that revision. Only populated if the user has edit access to the document. The revision ID is not a sequential number but an opaque string. The format of the revision ID might change over time. A returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and cannot be shared across users. If the revision ID is unchanged between calls, then the document has not changed. Conversely, a changed ID (for the same document and user) usually means the document has been updated. However, a changed ID can also be due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The suggested changes to the style of the document, keyed by suggestion ID.
    */
  var suggestedDocumentStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedDocumentStyle] | Null] = js.undefined
  
  /**
    * Output only. The suggested changes to the named styles of the document, keyed by suggestion ID.
    */
  var suggestedNamedStylesChanges: js.UndefOr[StringDictionary[SchemaSuggestedNamedStyles] | Null] = js.undefined
  
  /**
    * Output only. The suggestions view mode applied to the document. Note: When editing a document, changes must be based on a document with SUGGESTIONS_INLINE.
    */
  var suggestionsViewMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the document.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaDocument {
  
  inline def apply(): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocument]
  }
  
  extension [Self <: SchemaDocument](x: Self) {
    
    inline def setBody(value: SchemaBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdNull: Self = StObject.set(x, "documentId", null)
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setDocumentStyle(value: SchemaDocumentStyle): Self = StObject.set(x, "documentStyle", value.asInstanceOf[js.Any])
    
    inline def setDocumentStyleUndefined: Self = StObject.set(x, "documentStyle", js.undefined)
    
    inline def setFooters(value: StringDictionary[SchemaFooter]): Self = StObject.set(x, "footers", value.asInstanceOf[js.Any])
    
    inline def setFootersNull: Self = StObject.set(x, "footers", null)
    
    inline def setFootersUndefined: Self = StObject.set(x, "footers", js.undefined)
    
    inline def setFootnotes(value: StringDictionary[SchemaFootnote]): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
    
    inline def setFootnotesNull: Self = StObject.set(x, "footnotes", null)
    
    inline def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
    
    inline def setHeaders(value: StringDictionary[SchemaHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInlineObjects(value: StringDictionary[SchemaInlineObject]): Self = StObject.set(x, "inlineObjects", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectsNull: Self = StObject.set(x, "inlineObjects", null)
    
    inline def setInlineObjectsUndefined: Self = StObject.set(x, "inlineObjects", js.undefined)
    
    inline def setLists(value: StringDictionary[SchemaList]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsNull: Self = StObject.set(x, "lists", null)
    
    inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    inline def setNamedRanges(value: StringDictionary[SchemaNamedRanges]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    inline def setNamedRangesNull: Self = StObject.set(x, "namedRanges", null)
    
    inline def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    inline def setNamedStyles(value: SchemaNamedStyles): Self = StObject.set(x, "namedStyles", value.asInstanceOf[js.Any])
    
    inline def setNamedStylesUndefined: Self = StObject.set(x, "namedStyles", js.undefined)
    
    inline def setPositionedObjects(value: StringDictionary[SchemaPositionedObject]): Self = StObject.set(x, "positionedObjects", value.asInstanceOf[js.Any])
    
    inline def setPositionedObjectsNull: Self = StObject.set(x, "positionedObjects", null)
    
    inline def setPositionedObjectsUndefined: Self = StObject.set(x, "positionedObjects", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setSuggestedDocumentStyleChanges(value: StringDictionary[SchemaSuggestedDocumentStyle]): Self = StObject.set(x, "suggestedDocumentStyleChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDocumentStyleChangesNull: Self = StObject.set(x, "suggestedDocumentStyleChanges", null)
    
    inline def setSuggestedDocumentStyleChangesUndefined: Self = StObject.set(x, "suggestedDocumentStyleChanges", js.undefined)
    
    inline def setSuggestedNamedStylesChanges(value: StringDictionary[SchemaSuggestedNamedStyles]): Self = StObject.set(x, "suggestedNamedStylesChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedNamedStylesChangesNull: Self = StObject.set(x, "suggestedNamedStylesChanges", null)
    
    inline def setSuggestedNamedStylesChangesUndefined: Self = StObject.set(x, "suggestedNamedStylesChanges", js.undefined)
    
    inline def setSuggestionsViewMode(value: String): Self = StObject.set(x, "suggestionsViewMode", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsViewModeNull: Self = StObject.set(x, "suggestionsViewMode", null)
    
    inline def setSuggestionsViewModeUndefined: Self = StObject.set(x, "suggestionsViewMode", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
