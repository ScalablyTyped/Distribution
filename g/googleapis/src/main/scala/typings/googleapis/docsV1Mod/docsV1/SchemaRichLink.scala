package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRichLink extends StObject {
  
  /**
    * Output only. The ID of this link.
    */
  var richLinkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The properties of this RichLink. This field is always present.
    */
  var richLinkProperties: js.UndefOr[SchemaRichLinkProperties] = js.undefined
  
  /**
    * IDs for suggestions that remove this link from the document. A RichLink might have multiple deletion IDs if, for example, multiple users suggest to delete it. If empty, then this person link isn't suggested for deletion.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * IDs for suggestions that insert this link into the document. A RichLink might have multiple insertion IDs if it is a nested suggested change (a suggestion within a suggestion made by a different user, for example). If empty, then this person link isn't a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested text style changes to this RichLink, keyed by suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle] | Null] = js.undefined
  
  /**
    * The text style of this RichLink.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.undefined
}
object SchemaRichLink {
  
  inline def apply(): SchemaRichLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichLink]
  }
  
  extension [Self <: SchemaRichLink](x: Self) {
    
    inline def setRichLinkId(value: String): Self = StObject.set(x, "richLinkId", value.asInstanceOf[js.Any])
    
    inline def setRichLinkIdNull: Self = StObject.set(x, "richLinkId", null)
    
    inline def setRichLinkIdUndefined: Self = StObject.set(x, "richLinkId", js.undefined)
    
    inline def setRichLinkProperties(value: SchemaRichLinkProperties): Self = StObject.set(x, "richLinkProperties", value.asInstanceOf[js.Any])
    
    inline def setRichLinkPropertiesUndefined: Self = StObject.set(x, "richLinkProperties", js.undefined)
    
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
