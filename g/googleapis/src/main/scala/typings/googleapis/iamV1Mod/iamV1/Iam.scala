package typings.googleapis.iamV1Mod.iamV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Iam")
@js.native
open class Iam protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var iamPolicies: ResourceIampolicies = js.native
  
  var locations: ResourceLocations = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var permissions: ResourcePermissions = js.native
  
  var projects: ResourceProjects = js.native
  
  var roles: ResourceRoles = js.native
}
