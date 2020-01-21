package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    body: SchemaBody = null,
    documentId: String = null,
    documentStyle: SchemaDocumentStyle = null,
    footers: StringDictionary[SchemaFooter] = null,
    footnotes: StringDictionary[SchemaFootnote] = null,
    headers: StringDictionary[SchemaHeader] = null,
    inlineObjects: StringDictionary[SchemaInlineObject] = null,
    lists: StringDictionary[SchemaList] = null,
    namedRanges: StringDictionary[SchemaNamedRanges] = null,
    namedStyles: SchemaNamedStyles = null,
    positionedObjects: StringDictionary[SchemaPositionedObject] = null,
    revisionId: String = null,
    suggestedDocumentStyleChanges: StringDictionary[SchemaSuggestedDocumentStyle] = null,
    suggestedNamedStylesChanges: StringDictionary[SchemaSuggestedNamedStyles] = null,
    suggestionsViewMode: String = null,
    title: String = null
  ): SchemaDocument = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    if (documentStyle != null) __obj.updateDynamic("documentStyle")(documentStyle.asInstanceOf[js.Any])
    if (footers != null) __obj.updateDynamic("footers")(footers.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (inlineObjects != null) __obj.updateDynamic("inlineObjects")(inlineObjects.asInstanceOf[js.Any])
    if (lists != null) __obj.updateDynamic("lists")(lists.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    if (namedStyles != null) __obj.updateDynamic("namedStyles")(namedStyles.asInstanceOf[js.Any])
    if (positionedObjects != null) __obj.updateDynamic("positionedObjects")(positionedObjects.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (suggestedDocumentStyleChanges != null) __obj.updateDynamic("suggestedDocumentStyleChanges")(suggestedDocumentStyleChanges.asInstanceOf[js.Any])
    if (suggestedNamedStylesChanges != null) __obj.updateDynamic("suggestedNamedStylesChanges")(suggestedNamedStylesChanges.asInstanceOf[js.Any])
    if (suggestionsViewMode != null) __obj.updateDynamic("suggestionsViewMode")(suggestionsViewMode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocument]
  }
}

