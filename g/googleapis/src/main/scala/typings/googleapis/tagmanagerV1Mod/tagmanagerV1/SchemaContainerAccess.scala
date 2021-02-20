package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the Google Tag Manager Container access permissions.
  */
@js.native
trait SchemaContainerAccess extends StObject {
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * List of Container permissions. Valid container permissions are: read,
    * edit, delete, publish.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
}
object SchemaContainerAccess {
  
  @scala.inline
  def apply(): SchemaContainerAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerAccess]
  }
  
  @scala.inline
  implicit class SchemaContainerAccessMutableBuilder[Self <: SchemaContainerAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setPermission(value: js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value :_*))
  }
}
