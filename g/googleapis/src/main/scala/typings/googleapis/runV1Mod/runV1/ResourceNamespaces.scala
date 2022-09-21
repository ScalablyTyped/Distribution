package typings.googleapis.runV1Mod.runV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Namespaces")
@js.native
open class ResourceNamespaces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var authorizeddomains: ResourceNamespacesAuthorizeddomains = js.native
  
  var configurations: ResourceNamespacesConfigurations = js.native
  
  var context: APIRequestContext = js.native
  
  var domainmappings: ResourceNamespacesDomainmappings = js.native
  
  var executions: ResourceNamespacesExecutions = js.native
  
  var jobs: ResourceNamespacesJobs = js.native
  
  var revisions: ResourceNamespacesRevisions = js.native
  
  var routes: ResourceNamespacesRoutes = js.native
  
  var services: ResourceNamespacesServices = js.native
  
  var tasks: ResourceNamespacesTasks = js.native
}
