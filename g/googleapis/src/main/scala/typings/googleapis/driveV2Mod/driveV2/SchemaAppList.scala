package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of third-party applications which the user has installed or given
  * access to Google Drive.
  */
trait SchemaAppList extends StObject {
  
  /**
    * List of app IDs that the user has specified to use by default. The list
    * is in reverse-priority order (lowest to highest).
    */
  var defaultAppIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The list of apps.
    */
  var items: js.UndefOr[js.Array[SchemaApp]] = js.undefined
  
  /**
    * This is always drive#appList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaAppList {
  
  @scala.inline
  def apply(): SchemaAppList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppList]
  }
  
  @scala.inline
  implicit class SchemaAppListMutableBuilder[Self <: SchemaAppList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAppIds(value: js.Array[String]): Self = StObject.set(x, "defaultAppIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAppIdsUndefined: Self = StObject.set(x, "defaultAppIds", js.undefined)
    
    @scala.inline
    def setDefaultAppIdsVarargs(value: String*): Self = StObject.set(x, "defaultAppIds", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaApp]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaApp*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
