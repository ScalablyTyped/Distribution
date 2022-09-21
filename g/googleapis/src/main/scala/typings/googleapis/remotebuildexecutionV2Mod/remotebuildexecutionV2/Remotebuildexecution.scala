package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Remotebuildexecution")
@js.native
open class Remotebuildexecution protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var actionResults: ResourceActionresults = js.native
  
  var actions: ResourceActions = js.native
  
  var blobs: ResourceBlobs = js.native
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var v2: ResourceV2 = js.native
}
