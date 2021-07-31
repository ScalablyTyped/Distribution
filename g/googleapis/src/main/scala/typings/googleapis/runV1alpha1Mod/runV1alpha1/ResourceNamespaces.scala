package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Namespaces")
@js.native
class ResourceNamespaces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var authorizeddomains: ResourceNamespacesAuthorizeddomains = js.native
  
  var configurations: ResourceNamespacesConfigurations = js.native
  
  var context: APIRequestContext = js.native
  
  var domainmappings: ResourceNamespacesDomainmappings = js.native
  
  var revisions: ResourceNamespacesRevisions = js.native
  
  var routes: ResourceNamespacesRoutes = js.native
  
  var services: ResourceNamespacesServices = js.native
}
