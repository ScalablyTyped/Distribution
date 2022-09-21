package typings.googleapis.testingV1Mod.testingV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Testing")
@js.native
open class Testing protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var applicationDetailService: ResourceApplicationdetailservice = js.native
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
  
  var testEnvironmentCatalog: ResourceTestenvironmentcatalog = js.native
}
