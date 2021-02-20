package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The script project resource.
  */
@js.native
trait SchemaProject extends StObject {
  
  /**
    * When the script was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * User who originally created the script.
    */
  var creator: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.native
  
  /**
    * User who last modified the script.
    */
  var lastModifyUser: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.native
  
  /**
    * The parent&#39;s Drive ID that the script will be attached to. This is
    * usually the ID of a Google Document or Google Sheet. This filed is
    * optional, and if not set, a stand-alone script will be created.
    */
  var parentId: js.UndefOr[String] = js.native
  
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * When the script was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaProject {
  
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  
  @scala.inline
  implicit class SchemaProjectMutableBuilder[Self <: SchemaProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCreator(value: SchemaGoogleAppsScriptTypeUser): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    @scala.inline
    def setLastModifyUser(value: SchemaGoogleAppsScriptTypeUser): Self = StObject.set(x, "lastModifyUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyUserUndefined: Self = StObject.set(x, "lastModifyUser", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
