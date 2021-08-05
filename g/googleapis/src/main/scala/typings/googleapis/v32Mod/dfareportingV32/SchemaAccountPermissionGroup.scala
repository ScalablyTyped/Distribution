package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AccountPermissionGroups contains a mapping of permission group IDs to
  * names. A permission group is a grouping of account permissions.
  */
trait SchemaAccountPermissionGroup extends StObject {
  
  /**
    * ID of this account permission group.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this account permission group.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaAccountPermissionGroup {
  
  inline def apply(): SchemaAccountPermissionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionGroup]
  }
  
  extension [Self <: SchemaAccountPermissionGroup](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
