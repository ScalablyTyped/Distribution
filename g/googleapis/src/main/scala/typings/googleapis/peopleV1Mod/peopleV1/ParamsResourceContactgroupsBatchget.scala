package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceContactgroupsBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A field mask to restrict which fields on the group are returned. Defaults to `metadata`, `groupType`, `memberCount`, and `name` if not set or set to empty. Valid fields are: * clientData * groupType * memberCount * metadata * name
    */
  var groupFields: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specifies the maximum number of members to return for each group. Defaults to 0 if not set, which will return zero members.
    */
  var maxMembers: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The resource names of the contact groups to get. There is a maximum of 200 resource names.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceContactgroupsBatchget {
  
  inline def apply(): ParamsResourceContactgroupsBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsBatchget]
  }
  
  extension [Self <: ParamsResourceContactgroupsBatchget](x: Self) {
    
    inline def setGroupFields(value: String): Self = StObject.set(x, "groupFields", value.asInstanceOf[js.Any])
    
    inline def setGroupFieldsUndefined: Self = StObject.set(x, "groupFields", js.undefined)
    
    inline def setMaxMembers(value: Double): Self = StObject.set(x, "maxMembers", value.asInstanceOf[js.Any])
    
    inline def setMaxMembersUndefined: Self = StObject.set(x, "maxMembers", js.undefined)
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
  }
}
