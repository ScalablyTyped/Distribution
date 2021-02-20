package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data describing the type and additional information of an action.
  */
@js.native
trait SchemaActionDetail extends StObject {
  
  /**
    * A change about comments was made.
    */
  var comment: js.UndefOr[SchemaComment] = js.native
  
  /**
    * An object was created.
    */
  var create: js.UndefOr[SchemaCreate] = js.native
  
  /**
    * An object was deleted.
    */
  var delete: js.UndefOr[SchemaDelete] = js.native
  
  /**
    * A change happened in data leak prevention status.
    */
  var dlpChange: js.UndefOr[SchemaDataLeakPreventionChange] = js.native
  
  /**
    * An object was edited.
    */
  var edit: js.UndefOr[SchemaEdit] = js.native
  
  /**
    * An object was moved.
    */
  var move: js.UndefOr[SchemaMove] = js.native
  
  /**
    * The permission on an object was changed.
    */
  var permissionChange: js.UndefOr[SchemaPermissionChange] = js.native
  
  /**
    * An object was referenced in an application outside of Drive/Docs.
    */
  var reference: js.UndefOr[SchemaApplicationReference] = js.native
  
  /**
    * An object was renamed.
    */
  var rename: js.UndefOr[SchemaRename] = js.native
  
  /**
    * A deleted object was restored.
    */
  var restore: js.UndefOr[SchemaRestore] = js.native
  
  /**
    * Settings were changed.
    */
  var settingsChange: js.UndefOr[SchemaSettingsChange] = js.native
}
object SchemaActionDetail {
  
  @scala.inline
  def apply(): SchemaActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionDetail]
  }
  
  @scala.inline
  implicit class SchemaActionDetailMutableBuilder[Self <: SchemaActionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: SchemaComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCreate(value: SchemaCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDelete(value: SchemaDelete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setDlpChange(value: SchemaDataLeakPreventionChange): Self = StObject.set(x, "dlpChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlpChangeUndefined: Self = StObject.set(x, "dlpChange", js.undefined)
    
    @scala.inline
    def setEdit(value: SchemaEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setMove(value: SchemaMove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setPermissionChange(value: SchemaPermissionChange): Self = StObject.set(x, "permissionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionChangeUndefined: Self = StObject.set(x, "permissionChange", js.undefined)
    
    @scala.inline
    def setReference(value: SchemaApplicationReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setRename(value: SchemaRename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    @scala.inline
    def setRestore(value: SchemaRestore): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    @scala.inline
    def setSettingsChange(value: SchemaSettingsChange): Self = StObject.set(x, "settingsChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsChangeUndefined: Self = StObject.set(x, "settingsChange", js.undefined)
  }
}
