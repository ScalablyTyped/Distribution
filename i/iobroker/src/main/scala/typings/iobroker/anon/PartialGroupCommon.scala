package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.GroupCommon> */
trait PartialGroupCommon extends StObject {
  
  var acl: js.UndefOr[OmitPermissionSetusergrou] = js.undefined
  
  var custom: Unit
  
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  var expert: js.UndefOr[`true`] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var members: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
}
object PartialGroupCommon {
  
  inline def apply(custom: Unit): PartialGroupCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGroupCommon]
  }
  
  extension [Self <: PartialGroupCommon](x: Self) {
    
    inline def setAcl(value: OmitPermissionSetusergrou): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    inline def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    inline def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    inline def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
