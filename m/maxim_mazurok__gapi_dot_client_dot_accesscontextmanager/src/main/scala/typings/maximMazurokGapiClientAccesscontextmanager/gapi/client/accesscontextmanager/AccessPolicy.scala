package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPolicy extends StObject {
  
  /**
    * Output only. An opaque identifier for the current version of the `AccessPolicy`. This will always be a strongly validated etag, meaning that two Access Polices will be identical if
    * and only if their etags are identical. Clients should not expect this to be in any specific format.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of the `AccessPolicy`. Format: `accessPolicies/{policy_id}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently immutable once created. Format: `organizations/{organization_id}` */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Required. Human readable title. Does not affect behavior. */
  var title: js.UndefOr[String] = js.undefined
}
object AccessPolicy {
  
  inline def apply(): AccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPolicy]
  }
  
  extension [Self <: AccessPolicy](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
