package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ParagraphElement representing a footnote reference. A footnote reference
  * is the inline content rendered with a number and is used to identify the
  * footnote.
  */
@js.native
trait SchemaFootnoteReference extends StObject {
  
  /**
    * The ID of the footnote that contains the content of this footnote
    * reference.
    */
  var footnoteId: js.UndefOr[String] = js.native
  
  /**
    * The rendered number of this footnote.
    */
  var footnoteNumber: js.UndefOr[String] = js.native
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested insertion IDs. A FootnoteReference may have multiple
    * insertion IDs if it is a nested suggested change. If empty, then this is
    * not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested text style changes to this FootnoteReference, keyed by
    * suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle]] = js.native
  
  /**
    * The text style of this FootnoteReference.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}
object SchemaFootnoteReference {
  
  @scala.inline
  def apply(): SchemaFootnoteReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFootnoteReference]
  }
  
  @scala.inline
  implicit class SchemaFootnoteReferenceMutableBuilder[Self <: SchemaFootnoteReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
    
    @scala.inline
    def setFootnoteNumber(value: String): Self = StObject.set(x, "footnoteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteNumberUndefined: Self = StObject.set(x, "footnoteNumber", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedTextStyleChanges(value: StringDictionary[SchemaSuggestedTextStyle]): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
