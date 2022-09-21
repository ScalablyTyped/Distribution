package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChildrenDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the child.
    */
  var childId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. If an item is not in a shared drive and its last parent is deleted but the item itself is not, the item will be placed under its owner's root.
    */
  var enforceSingleParent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var folderId: js.UndefOr[String] = js.undefined
}
object ParamsResourceChildrenDelete {
  
  inline def apply(): ParamsResourceChildrenDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChildrenDelete]
  }
  
  extension [Self <: ParamsResourceChildrenDelete](x: Self) {
    
    inline def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    inline def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
    
    inline def setEnforceSingleParent(value: Boolean): Self = StObject.set(x, "enforceSingleParent", value.asInstanceOf[js.Any])
    
    inline def setEnforceSingleParentUndefined: Self = StObject.set(x, "enforceSingleParent", js.undefined)
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
  }
}
