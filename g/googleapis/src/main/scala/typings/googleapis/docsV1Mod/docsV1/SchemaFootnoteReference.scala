package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFootnoteReference extends StObject {
  
  /**
    * The ID of the footnote that contains the content of this footnote reference.
    */
  var footnoteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rendered number of this footnote.
    */
  var footnoteNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested insertion IDs. A FootnoteReference may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested text style changes to this FootnoteReference, keyed by suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle] | Null] = js.undefined
  
  /**
    * The text style of this FootnoteReference.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.undefined
}
object SchemaFootnoteReference {
  
  inline def apply(): SchemaFootnoteReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFootnoteReference]
  }
  
  extension [Self <: SchemaFootnoteReference](x: Self) {
    
    inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIdNull: Self = StObject.set(x, "footnoteId", null)
    
    inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
    
    inline def setFootnoteNumber(value: String): Self = StObject.set(x, "footnoteNumber", value.asInstanceOf[js.Any])
    
    inline def setFootnoteNumberNull: Self = StObject.set(x, "footnoteNumber", null)
    
    inline def setFootnoteNumberUndefined: Self = StObject.set(x, "footnoteNumber", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsNull: Self = StObject.set(x, "suggestedDeletionIds", null)
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsNull: Self = StObject.set(x, "suggestedInsertionIds", null)
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value*))
    
    inline def setSuggestedTextStyleChanges(value: StringDictionary[SchemaSuggestedTextStyle]): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedTextStyleChangesNull: Self = StObject.set(x, "suggestedTextStyleChanges", null)
    
    inline def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    inline def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
