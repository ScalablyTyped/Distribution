package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPermissionGroup extends StObject {
  
  /** ID of this account permission group. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroup". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this account permission group. */
  var name: js.UndefOr[String] = js.undefined
}
object AccountPermissionGroup {
  
  inline def apply(): AccountPermissionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountPermissionGroup] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
