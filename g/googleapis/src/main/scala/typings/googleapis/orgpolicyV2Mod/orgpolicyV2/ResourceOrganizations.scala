package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/orgpolicy/v2", "orgpolicy_v2.Resource$Organizations")
@js.native
open class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var constraints: ResourceOrganizationsConstraints = js.native
  
  var context: APIRequestContext = js.native
  
  var customConstraints: ResourceOrganizationsCustomconstraints = js.native
  
  var policies: ResourceOrganizationsPolicies = js.native
}
