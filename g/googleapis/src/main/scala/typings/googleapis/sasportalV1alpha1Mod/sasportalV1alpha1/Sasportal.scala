package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Sasportal")
@js.native
open class Sasportal protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var customers: ResourceCustomers = js.native
  
  var deployments: ResourceDeployments = js.native
  
  var installer: ResourceInstaller = js.native
  
  var nodes: ResourceNodes = js.native
  
  var policies: ResourcePolicies = js.native
}
