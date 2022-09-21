package typings.googleapis.runV1beta1Mod.runV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1beta1", "run_v1beta1.Run")
@js.native
open class Run protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var customresourcedefinitions: ResourceCustomresourcedefinitions = js.native
  
  var namespaces: ResourceNamespaces = js.native
  
  var projects: ResourceProjects = js.native
}
