package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data describing the type and additional information of an action.
  */
trait SchemaActionDetail extends StObject {
  
  /**
    * A change about comments was made.
    */
  var comment: js.UndefOr[SchemaComment] = js.undefined
  
  /**
    * An object was created.
    */
  var create: js.UndefOr[SchemaCreate] = js.undefined
  
  /**
    * An object was deleted.
    */
  var delete: js.UndefOr[SchemaDelete] = js.undefined
  
  /**
    * A change happened in data leak prevention status.
    */
  var dlpChange: js.UndefOr[SchemaDataLeakPreventionChange] = js.undefined
  
  /**
    * An object was edited.
    */
  var edit: js.UndefOr[SchemaEdit] = js.undefined
  
  /**
    * An object was moved.
    */
  var move: js.UndefOr[SchemaMove] = js.undefined
  
  /**
    * The permission on an object was changed.
    */
  var permissionChange: js.UndefOr[SchemaPermissionChange] = js.undefined
  
  /**
    * An object was referenced in an application outside of Drive/Docs.
    */
  var reference: js.UndefOr[SchemaApplicationReference] = js.undefined
  
  /**
    * An object was renamed.
    */
  var rename: js.UndefOr[SchemaRename] = js.undefined
  
  /**
    * A deleted object was restored.
    */
  var restore: js.UndefOr[SchemaRestore] = js.undefined
  
  /**
    * Settings were changed.
    */
  var settingsChange: js.UndefOr[SchemaSettingsChange] = js.undefined
}
object SchemaActionDetail {
  
  inline def apply(): SchemaActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionDetail]
  }
  
  extension [Self <: SchemaActionDetail](x: Self) {
    
    inline def setComment(value: SchemaComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreate(value: SchemaCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDelete(value: SchemaDelete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDlpChange(value: SchemaDataLeakPreventionChange): Self = StObject.set(x, "dlpChange", value.asInstanceOf[js.Any])
    
    inline def setDlpChangeUndefined: Self = StObject.set(x, "dlpChange", js.undefined)
    
    inline def setEdit(value: SchemaEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setMove(value: SchemaMove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setPermissionChange(value: SchemaPermissionChange): Self = StObject.set(x, "permissionChange", value.asInstanceOf[js.Any])
    
    inline def setPermissionChangeUndefined: Self = StObject.set(x, "permissionChange", js.undefined)
    
    inline def setReference(value: SchemaApplicationReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRename(value: SchemaRename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setRestore(value: SchemaRestore): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    inline def setSettingsChange(value: SchemaSettingsChange): Self = StObject.set(x, "settingsChange", value.asInstanceOf[js.Any])
    
    inline def setSettingsChangeUndefined: Self = StObject.set(x, "settingsChange", js.undefined)
  }
}
