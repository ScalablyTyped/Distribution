package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPositionedObject extends StObject {
  
  /**
    * The ID of this positioned object.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The properties of this positioned object.
    */
  var positionedObjectProperties: js.UndefOr[SchemaPositionedObjectProperties] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested insertion ID. If empty, then this is not a suggested insertion.
    */
  var suggestedInsertionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The suggested changes to the positioned object properties, keyed by suggestion ID.
    */
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedPositionedObjectProperties] | Null] = js.undefined
}
object SchemaPositionedObject {
  
  inline def apply(): SchemaPositionedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObject]
  }
  
  extension [Self <: SchemaPositionedObject](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPositionedObjectProperties(value: SchemaPositionedObjectProperties): Self = StObject.set(x, "positionedObjectProperties", value.asInstanceOf[js.Any])
    
    inline def setPositionedObjectPropertiesUndefined: Self = StObject.set(x, "positionedObjectProperties", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsNull: Self = StObject.set(x, "suggestedDeletionIds", null)
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdNull: Self = StObject.set(x, "suggestedInsertionId", null)
    
    inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    inline def setSuggestedPositionedObjectPropertiesChanges(value: StringDictionary[SchemaSuggestedPositionedObjectProperties]): Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedPositionedObjectPropertiesChangesNull: Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", null)
    
    inline def setSuggestedPositionedObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", js.undefined)
  }
}
