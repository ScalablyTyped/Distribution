package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWindowsUpdate extends StObject {
  
  /**
    * The list of categories to which the update belongs.
    */
  var categories: js.UndefOr[js.Array[SchemaCategory]] = js.undefined
  
  /**
    * The localized description of the update.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required - The unique identifier for the update.
    */
  var identity: js.UndefOr[SchemaIdentity] = js.undefined
  
  /**
    * The Microsoft Knowledge Base article IDs that are associated with the update.
    */
  var kbArticleIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The last published timestamp of the update.
    */
  var lastPublishedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hyperlink to the support information for the update.
    */
  var supportUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The localized title of the update.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaWindowsUpdate {
  
  inline def apply(): SchemaWindowsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsUpdate]
  }
  
  extension [Self <: SchemaWindowsUpdate](x: Self) {
    
    inline def setCategories(value: js.Array[SchemaCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: SchemaCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentity(value: SchemaIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setKbArticleIds(value: js.Array[String]): Self = StObject.set(x, "kbArticleIds", value.asInstanceOf[js.Any])
    
    inline def setKbArticleIdsNull: Self = StObject.set(x, "kbArticleIds", null)
    
    inline def setKbArticleIdsUndefined: Self = StObject.set(x, "kbArticleIds", js.undefined)
    
    inline def setKbArticleIdsVarargs(value: String*): Self = StObject.set(x, "kbArticleIds", js.Array(value*))
    
    inline def setLastPublishedTimestamp(value: String): Self = StObject.set(x, "lastPublishedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastPublishedTimestampNull: Self = StObject.set(x, "lastPublishedTimestamp", null)
    
    inline def setLastPublishedTimestampUndefined: Self = StObject.set(x, "lastPublishedTimestamp", js.undefined)
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlNull: Self = StObject.set(x, "supportUrl", null)
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
