package typings.googleapis.osconfigV1Mod.osconfigV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1", "osconfig_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var patchDeployments: ResourceProjectsPatchdeployments = js.native
  
  var patchJobs: ResourceProjectsPatchjobs = js.native
}
