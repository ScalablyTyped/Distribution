package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoText extends StObject {
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested insertion IDs. An AutoText may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested text style changes to this AutoText, keyed by suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle] | Null] = js.undefined
  
  /**
    * The text style of this AutoText.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.undefined
  
  /**
    * The type of this auto text.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAutoText {
  
  inline def apply(): SchemaAutoText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoText]
  }
  
  extension [Self <: SchemaAutoText](x: Self) {
    
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
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
