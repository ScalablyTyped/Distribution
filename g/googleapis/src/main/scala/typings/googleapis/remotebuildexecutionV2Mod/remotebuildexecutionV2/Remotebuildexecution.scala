package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remote Build Execution API
  *
  * Supplies a Remote Execution API service for tools such as bazel.
  *
  * @example
  * const {google} = require('googleapis');
  * const remotebuildexecution = google.remotebuildexecution('v2');
  *
  * @namespace remotebuildexecution
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Remotebuildexecution
  */
@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Remotebuildexecution")
@js.native
class Remotebuildexecution protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var actionResults: ResourceActionresults = js.native
  
  var actions: ResourceActions = js.native
  
  var blobs: ResourceBlobs = js.native
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var v2: ResourceV2 = js.native
}
