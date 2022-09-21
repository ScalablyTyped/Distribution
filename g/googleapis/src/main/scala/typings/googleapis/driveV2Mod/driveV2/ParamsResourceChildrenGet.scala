package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChildrenGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the child.
    */
  var childId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var folderId: js.UndefOr[String] = js.undefined
}
object ParamsResourceChildrenGet {
  
  inline def apply(): ParamsResourceChildrenGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChildrenGet]
  }
  
  extension [Self <: ParamsResourceChildrenGet](x: Self) {
    
    inline def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    inline def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
  }
}
