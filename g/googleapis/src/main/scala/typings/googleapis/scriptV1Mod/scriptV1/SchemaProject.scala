package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProject extends StObject {
  
  /**
    * When the script was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User who originally created the script.
    */
  var creator: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.undefined
  
  /**
    * User who last modified the script.
    */
  var lastModifyUser: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.undefined
  
  /**
    * The parent's Drive ID that the script will be attached to. This is usually the ID of a Google Document or Google Sheet. This filed is optional, and if not set, a stand-alone script will be created.
    */
  var parentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the script was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaProject {
  
  inline def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  
  extension [Self <: SchemaProject](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: SchemaGoogleAppsScriptTypeUser): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setLastModifyUser(value: SchemaGoogleAppsScriptTypeUser): Self = StObject.set(x, "lastModifyUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyUserUndefined: Self = StObject.set(x, "lastModifyUser", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdNull: Self = StObject.set(x, "parentId", null)
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdNull: Self = StObject.set(x, "scriptId", null)
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
