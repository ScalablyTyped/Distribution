package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/secretmanager/v1beta1", "secretmanager_v1beta1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var secrets: ResourceProjectsSecrets = js.native
}
