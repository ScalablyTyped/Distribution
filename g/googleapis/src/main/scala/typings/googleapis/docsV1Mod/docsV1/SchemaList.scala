package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaList extends StObject {
  
  /**
    * The properties of the list.
    */
  var listProperties: js.UndefOr[SchemaListProperties] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested deletions of this list.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested insertion ID. If empty, then this is not a suggested insertion.
    */
  var suggestedInsertionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The suggested changes to the list properties, keyed by suggestion ID.
    */
  var suggestedListPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedListProperties] | Null] = js.undefined
}
object SchemaList {
  
  inline def apply(): SchemaList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaList]
  }
  
  extension [Self <: SchemaList](x: Self) {
    
    inline def setListProperties(value: SchemaListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
    
    inline def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsNull: Self = StObject.set(x, "suggestedDeletionIds", null)
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value*))
    
    inline def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdNull: Self = StObject.set(x, "suggestedInsertionId", null)
    
    inline def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    inline def setSuggestedListPropertiesChanges(value: StringDictionary[SchemaSuggestedListProperties]): Self = StObject.set(x, "suggestedListPropertiesChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedListPropertiesChangesNull: Self = StObject.set(x, "suggestedListPropertiesChanges", null)
    
    inline def setSuggestedListPropertiesChangesUndefined: Self = StObject.set(x, "suggestedListPropertiesChanges", js.undefined)
  }
}
