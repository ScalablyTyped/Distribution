package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceContactgroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A field mask to restrict which fields on the group are returned. Defaults to `metadata`, `groupType`, `memberCount`, and `name` if not set or set to empty. Valid fields are: * clientData * groupType * memberCount * metadata * name
    */
  var groupFields: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specifies the maximum number of members to return. Defaults to 0 if not set, which will return zero members.
    */
  var maxMembers: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The resource name of the contact group to get.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceContactgroupsGet {
  
  inline def apply(): ParamsResourceContactgroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsGet]
  }
  
  extension [Self <: ParamsResourceContactgroupsGet](x: Self) {
    
    inline def setGroupFields(value: String): Self = StObject.set(x, "groupFields", value.asInstanceOf[js.Any])
    
    inline def setGroupFieldsUndefined: Self = StObject.set(x, "groupFields", js.undefined)
    
    inline def setMaxMembers(value: Double): Self = StObject.set(x, "maxMembers", value.asInstanceOf[js.Any])
    
    inline def setMaxMembersUndefined: Self = StObject.set(x, "maxMembers", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
