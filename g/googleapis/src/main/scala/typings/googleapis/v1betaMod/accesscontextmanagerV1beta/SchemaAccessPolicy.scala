package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `AccessPolicy` is a container for `AccessLevels` (which define the
  * necessary attributes to use GCP services) and `ServicePerimeters` (which
  * define regions of services able to freely pass data within a perimeter). An
  * access policy is globally visible within an organization, and the
  * restrictions it specifies apply to all projects within an organization.
  */
trait SchemaAccessPolicy extends StObject {
  
  /**
    * Output only. Time the `AccessPolicy` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Resource name of the `AccessPolicy`. Format:
    * `accessPolicies/{policy_id}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent of this `AccessPolicy` in the Cloud Resource
    * Hierarchy. Currently immutable once created. Format:
    * `organizations/{organization_id}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Human readable title. Does not affect behavior.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time the `AccessPolicy` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaAccessPolicy {
  
  @scala.inline
  def apply(): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
  
  @scala.inline
  implicit class SchemaAccessPolicyMutableBuilder[Self <: SchemaAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
