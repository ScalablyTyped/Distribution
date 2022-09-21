package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Admin")
@js.native
open class Admin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var applications: ResourceApplications = js.native
  
  var context: APIRequestContext = js.native
  
  var transfers: ResourceTransfers = js.native
}
