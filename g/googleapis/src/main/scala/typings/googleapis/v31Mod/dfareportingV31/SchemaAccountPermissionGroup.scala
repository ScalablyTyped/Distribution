package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AccountPermissionGroups contains a mapping of permission group IDs to
  * names. A permission group is a grouping of account permissions.
  */
@js.native
trait SchemaAccountPermissionGroup extends StObject {
  
  /**
    * ID of this account permission group.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this account permission group.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAccountPermissionGroup {
  
  @scala.inline
  def apply(): SchemaAccountPermissionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionGroup]
  }
  
  @scala.inline
  implicit class SchemaAccountPermissionGroupMutableBuilder[Self <: SchemaAccountPermissionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
