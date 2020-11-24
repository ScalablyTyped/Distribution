package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Docs document.
  */
@js.native
trait SchemaDocument extends js.Object {
  
  /**
    * The main body of the document.
    */
  var body: js.UndefOr[SchemaBody] = js.native
  
  /**
    * The ID of the document.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * The style of the document.
    */
  var documentStyle: js.UndefOr[SchemaDocumentStyle] = js.native
  
  /**
    * The footers in the document, keyed by footer ID.
    */
  var footers: js.UndefOr[StringDictionary[SchemaFooter]] = js.native
  
  /**
    * The footnotes in the document, keyed by footnote ID.
    */
  var footnotes: js.UndefOr[StringDictionary[SchemaFootnote]] = js.native
  
  /**
    * The headers in the document, keyed by header ID.
    */
  var headers: js.UndefOr[StringDictionary[SchemaHeader]] = js.native
  
  /**
    * The inline objects in the document, keyed by object ID.
    */
  var inlineObjects: js.UndefOr[StringDictionary[SchemaInlineObject]] = js.native
  
  /**
    * The lists in the document, keyed by list ID.
    */
  var lists: js.UndefOr[StringDictionary[SchemaList]] = js.native
  
  /**
    * The named ranges in the document, keyed by name.
    */
  var namedRanges: js.UndefOr[StringDictionary[SchemaNamedRanges]] = js.native
  
  /**
    * The named styles of the document.
    */
  var namedStyles: js.UndefOr[SchemaNamedStyles] = js.native
  
  /**
    * The positioned objects in the document, keyed by object ID.
    */
  var positionedObjects: js.UndefOr[StringDictionary[SchemaPositionedObject]] = js.native
  
  /**
    * The revision ID of the document. Can be used in update requests to
    * specify which revision of a document to apply updates to and how the
    * request should behave if the document has been edited since that
    * revision. Only populated if the user has edit access to the document. The
    * format of the revision ID may change over time, so it should be treated
    * opaquely. A returned revision ID is only guaranteed to be valid for 24
    * hours after it has been returned and cannot be shared across users. If
    * the revision ID is unchanged between calls, then the document has not
    * changed. Conversely, a changed ID (for the same document and user)
    * usually means the document has been updated; however, a changed ID can
    * also be due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /**
    * The suggested changes to the style of the document, keyed by suggestion
    * ID.
    */
  var suggestedDocumentStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedDocumentStyle]] = js.native
  
  /**
    * The suggested changes to the named styles of the document, keyed by
    * suggestion ID.
    */
  var suggestedNamedStylesChanges: js.UndefOr[StringDictionary[SchemaSuggestedNamedStyles]] = js.native
  
  /**
    * The suggestions view mode applied to the document.  Note: When editing a
    * document, changes must be based on a document with SUGGESTIONS_INLINE.
    */
  var suggestionsViewMode: js.UndefOr[String] = js.native
  
  /**
    * The title of the document.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaDocument {
  
  @scala.inline
  def apply(): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocument]
  }
  
  @scala.inline
  implicit class SchemaDocumentOps[Self <: SchemaDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: SchemaBody): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentStyle(value: SchemaDocumentStyle): Self = this.set("documentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStyle: Self = this.set("documentStyle", js.undefined)
    
    @scala.inline
    def setFooters(value: StringDictionary[SchemaFooter]): Self = this.set("footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooters: Self = this.set("footers", js.undefined)
    
    @scala.inline
    def setFootnotes(value: StringDictionary[SchemaFootnote]): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnotes: Self = this.set("footnotes", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[SchemaHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setInlineObjects(value: StringDictionary[SchemaInlineObject]): Self = this.set("inlineObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineObjects: Self = this.set("inlineObjects", js.undefined)
    
    @scala.inline
    def setLists(value: StringDictionary[SchemaList]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    
    @scala.inline
    def setNamedRanges(value: StringDictionary[SchemaNamedRanges]): Self = this.set("namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRanges: Self = this.set("namedRanges", js.undefined)
    
    @scala.inline
    def setNamedStyles(value: SchemaNamedStyles): Self = this.set("namedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedStyles: Self = this.set("namedStyles", js.undefined)
    
    @scala.inline
    def setPositionedObjects(value: StringDictionary[SchemaPositionedObject]): Self = this.set("positionedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjects: Self = this.set("positionedObjects", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    
    @scala.inline
    def setSuggestedDocumentStyleChanges(value: StringDictionary[SchemaSuggestedDocumentStyle]): Self = this.set("suggestedDocumentStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDocumentStyleChanges: Self = this.set("suggestedDocumentStyleChanges", js.undefined)
    
    @scala.inline
    def setSuggestedNamedStylesChanges(value: StringDictionary[SchemaSuggestedNamedStyles]): Self = this.set("suggestedNamedStylesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedNamedStylesChanges: Self = this.set("suggestedNamedStylesChanges", js.undefined)
    
    @scala.inline
    def setSuggestionsViewMode(value: String): Self = this.set("suggestionsViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsViewMode: Self = this.set("suggestionsViewMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
