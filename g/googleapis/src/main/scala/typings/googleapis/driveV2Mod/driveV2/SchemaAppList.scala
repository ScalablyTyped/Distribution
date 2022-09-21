package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppList extends StObject {
  
  /**
    * List of app IDs that the user has specified to use by default. The list is in reverse-priority order (lowest to highest).
    */
  var defaultAppIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of apps.
    */
  var items: js.UndefOr[js.Array[SchemaApp]] = js.undefined
  
  /**
    * This is always drive#appList.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppList {
  
  inline def apply(): SchemaAppList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppList]
  }
  
  extension [Self <: SchemaAppList](x: Self) {
    
    inline def setDefaultAppIds(value: js.Array[String]): Self = StObject.set(x, "defaultAppIds", value.asInstanceOf[js.Any])
    
    inline def setDefaultAppIdsNull: Self = StObject.set(x, "defaultAppIds", null)
    
    inline def setDefaultAppIdsUndefined: Self = StObject.set(x, "defaultAppIds", js.undefined)
    
    inline def setDefaultAppIdsVarargs(value: String*): Self = StObject.set(x, "defaultAppIds", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaApp]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaApp*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
