package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactGroupMetadata extends StObject {
  
  /**
    * Output only. True if the contact group resource has been deleted. Populated only for [`ListContactGroups`](/people/api/rest/v1/contactgroups/list) requests that include a sync token.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The time the group was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaContactGroupMetadata {
  
  inline def apply(): SchemaContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupMetadata]
  }
  
  extension [Self <: SchemaContactGroupMetadata](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
