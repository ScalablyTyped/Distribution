package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Jobs")
@js.native
open class Jobs protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var companies: ResourceCompanies = js.native
  
  var context: APIRequestContext = js.native
  
  var jobs: ResourceJobs = js.native
  
  var v2: ResourceV2 = js.native
}
