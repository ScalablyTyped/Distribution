package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ID for a user or group as seen in Permission items.
  */
trait SchemaPermissionId extends StObject {
  
  /**
    * The permission ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#permissionId.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaPermissionId {
  
  @scala.inline
  def apply(): SchemaPermissionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionId]
  }
  
  @scala.inline
  implicit class SchemaPermissionIdMutableBuilder[Self <: SchemaPermissionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
