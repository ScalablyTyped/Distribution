package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSharedDriveInfo extends StObject {
  
  /**
    * A list of shared drive IDs, as provided by the [Drive API](https://developers.google.com/drive).
    */
  var sharedDriveIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSharedDriveInfo {
  
  inline def apply(): SchemaSharedDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedDriveInfo]
  }
  
  extension [Self <: SchemaSharedDriveInfo](x: Self) {
    
    inline def setSharedDriveIds(value: js.Array[String]): Self = StObject.set(x, "sharedDriveIds", value.asInstanceOf[js.Any])
    
    inline def setSharedDriveIdsNull: Self = StObject.set(x, "sharedDriveIds", null)
    
    inline def setSharedDriveIdsUndefined: Self = StObject.set(x, "sharedDriveIds", js.undefined)
    
    inline def setSharedDriveIdsVarargs(value: String*): Self = StObject.set(x, "sharedDriveIds", js.Array(value*))
  }
}
