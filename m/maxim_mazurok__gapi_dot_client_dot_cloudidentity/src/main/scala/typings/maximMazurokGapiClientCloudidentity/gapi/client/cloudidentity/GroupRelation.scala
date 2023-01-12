package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupRelation extends StObject {
  
  /** Display name for this group. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Resource name for this group. */
  var group: js.UndefOr[String] = js.undefined
  
  /** Entity key has an id and a namespace. In case of discussion forums, the id will be an email address without a namespace. */
  var groupKey: js.UndefOr[EntityKey] = js.undefined
  
  /** Labels for Group resource. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The relation between the member and the transitive group. */
  var relationType: js.UndefOr[String] = js.undefined
  
  /** Membership roles of the member for the group. */
  var roles: js.UndefOr[js.Array[TransitiveMembershipRole]] = js.undefined
}
object GroupRelation {
  
  inline def apply(): GroupRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupRelation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupRelation] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupKey(value: EntityKey): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRelationType(value: String): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
    
    inline def setRelationTypeUndefined: Self = StObject.set(x, "relationType", js.undefined)
    
    inline def setRoles(value: js.Array[TransitiveMembershipRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: TransitiveMembershipRole*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
