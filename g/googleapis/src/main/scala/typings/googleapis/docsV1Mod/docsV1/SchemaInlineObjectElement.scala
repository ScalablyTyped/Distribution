package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ParagraphElement that contains an InlineObject.
  */
trait SchemaInlineObjectElement extends StObject {
  
  /**
    * The ID of the InlineObject this element contains.
    */
  var inlineObjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested insertion IDs. An InlineObjectElement may have multiple
    * insertion IDs if it is a nested suggested change. If empty, then this is
    * not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested text style changes to this InlineObject, keyed by
    * suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle]] = js.undefined
  
  /**
    * The text style of this InlineObjectElement.  Similar to text content,
    * like text runs and footnote references, the text style of an inline
    * object element can affect content layout as well as the styling of text
    * inserted adjacent to it.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.undefined
}
object SchemaInlineObjectElement {
  
  inline def apply(): SchemaInlineObjectElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineObjectElement]
  }
  
  extension [Self <: SchemaInlineObjectElement](x: Self) {
    
    inline def setInlineObjectId(value: String): Self = StObject.set(x, "inlineObjectId", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectIdUndefined: Self = StObject.set(x, "inlineObjectId", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    inline def setSuggestedTextStyleChanges(value: StringDictionary[SchemaSuggestedTextStyle]): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    inline def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
