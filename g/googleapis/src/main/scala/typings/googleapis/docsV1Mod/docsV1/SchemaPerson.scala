package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerson extends StObject {
  
  /**
    * Output only. The unique ID of this link.
    */
  var personId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The properties of this Person. This field is always present.
    */
  var personProperties: js.UndefOr[SchemaPersonProperties] = js.undefined
  
  /**
    * IDs for suggestions that remove this person link from the document. A Person might have multiple deletion IDs if, for example, multiple users suggest to delete it. If empty, then this person link isn't suggested for deletion.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * IDs for suggestions that insert this person link into the document. A Person might have multiple insertion IDs if it is a nested suggested change (a suggestion within a suggestion made by a different user, for example). If empty, then this person link isn't a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The suggested text style changes to this Person, keyed by suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle] | Null] = js.undefined
  
  /**
    * The text style of this Person.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.undefined
}
object SchemaPerson {
  
  inline def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  
  extension [Self <: SchemaPerson](x: Self) {
    
    inline def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    
    inline def setPersonIdNull: Self = StObject.set(x, "personId", null)
    
    inline def setPersonIdUndefined: Self = StObject.set(x, "personId", js.undefined)
    
    inline def setPersonProperties(value: SchemaPersonProperties): Self = StObject.set(x, "personProperties", value.asInstanceOf[js.Any])
    
    inline def setPersonPropertiesUndefined: Self = StObject.set(x, "personProperties", js.undefined)
    
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
