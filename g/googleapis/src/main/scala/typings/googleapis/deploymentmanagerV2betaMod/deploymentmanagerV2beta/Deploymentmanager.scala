package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/deploymentmanager/v2beta", "deploymentmanager_v2beta.Deploymentmanager")
@js.native
open class Deploymentmanager protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var compositeTypes: ResourceCompositetypes = js.native
  
  var context: APIRequestContext = js.native
  
  var deployments: ResourceDeployments = js.native
  
  var manifests: ResourceManifests = js.native
  
  var operations: ResourceOperations = js.native
  
  var resources: ResourceResources = js.native
  
  var typeProviders: ResourceTypeproviders = js.native
  
  var types: ResourceTypes = js.native
}
