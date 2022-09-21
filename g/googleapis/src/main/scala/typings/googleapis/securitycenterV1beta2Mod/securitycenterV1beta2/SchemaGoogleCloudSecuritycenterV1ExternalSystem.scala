package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1ExternalSystem extends StObject {
  
  /**
    * References primary/secondary etc assignees in the external system.
    */
  var assignees: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The most recent time when the corresponding finding's ticket/tracker was updated in the external system.
    */
  var externalSystemUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier that's used to track the given finding in the external system.
    */
  var externalUid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * External System Name e.g. jira, demisto, etc. e.g.: `organizations/1234/sources/5678/findings/123456/externalSystems/jira` `folders/1234/sources/5678/findings/123456/externalSystems/jira` `projects/1234/sources/5678/findings/123456/externalSystems/jira`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Most recent status of the corresponding finding's ticket/tracker in the external system.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1ExternalSystem {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1ExternalSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1ExternalSystem]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1ExternalSystem](x: Self) {
    
    inline def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesNull: Self = StObject.set(x, "assignees", null)
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setExternalSystemUpdateTime(value: String): Self = StObject.set(x, "externalSystemUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setExternalSystemUpdateTimeNull: Self = StObject.set(x, "externalSystemUpdateTime", null)
    
    inline def setExternalSystemUpdateTimeUndefined: Self = StObject.set(x, "externalSystemUpdateTime", js.undefined)
    
    inline def setExternalUid(value: String): Self = StObject.set(x, "externalUid", value.asInstanceOf[js.Any])
    
    inline def setExternalUidNull: Self = StObject.set(x, "externalUid", null)
    
    inline def setExternalUidUndefined: Self = StObject.set(x, "externalUid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
