package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that appears inline with text. An InlineObject contains an
  * EmbeddedObject such as an image.
  */
trait SchemaInlineObject extends StObject {
  
  /**
    * The properties of this inline object.
    */
  var inlineObjectProperties: js.UndefOr[SchemaInlineObjectProperties] = js.undefined
  
  /**
    * The ID of this inline object.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested changes to the inline object properties, keyed by
    * suggestion ID.
    */
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedInlineObjectProperties]] = js.undefined
  
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.undefined
}
object SchemaInlineObject {
  
  inline def apply(): SchemaInlineObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineObject]
  }
  
  extension [Self <: SchemaInlineObject](x: Self) {
    
    inline def setInlineObjectProperties(value: SchemaInlineObjectProperties): Self = StObject.set(x, "inlineObjectProperties", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectPropertiesUndefined: Self = StObject.set(x, "inlineObjectProperties", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    inline def setSuggestedInlineObjectPropertiesChanges(value: StringDictionary[SchemaSuggestedInlineObjectProperties]): Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInlineObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedInlineObjectPropertiesChanges", js.undefined)
    
    inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
  }
}
