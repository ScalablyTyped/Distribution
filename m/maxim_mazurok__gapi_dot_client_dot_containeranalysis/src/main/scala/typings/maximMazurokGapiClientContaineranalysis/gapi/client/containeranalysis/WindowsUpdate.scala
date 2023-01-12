package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdate extends StObject {
  
  /** The list of categories to which the update belongs. */
  var categories: js.UndefOr[js.Array[Category]] = js.undefined
  
  /** The localized description of the update. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required - The unique identifier for the update. */
  var identity: js.UndefOr[Identity] = js.undefined
  
  /** The Microsoft Knowledge Base article IDs that are associated with the update. */
  var kbArticleIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The last published timestamp of the update. */
  var lastPublishedTimestamp: js.UndefOr[String] = js.undefined
  
  /** The hyperlink to the support information for the update. */
  var supportUrl: js.UndefOr[String] = js.undefined
  
  /** The localized title of the update. */
  var title: js.UndefOr[String] = js.undefined
}
object WindowsUpdate {
  
  inline def apply(): WindowsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsUpdate] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setKbArticleIds(value: js.Array[String]): Self = StObject.set(x, "kbArticleIds", value.asInstanceOf[js.Any])
    
    inline def setKbArticleIdsUndefined: Self = StObject.set(x, "kbArticleIds", js.undefined)
    
    inline def setKbArticleIdsVarargs(value: String*): Self = StObject.set(x, "kbArticleIds", js.Array(value*))
    
    inline def setLastPublishedTimestamp(value: String): Self = StObject.set(x, "lastPublishedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastPublishedTimestampUndefined: Self = StObject.set(x, "lastPublishedTimestamp", js.undefined)
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
