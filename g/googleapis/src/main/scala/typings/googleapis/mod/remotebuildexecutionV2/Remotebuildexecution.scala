package typings.googleapis.mod.remotebuildexecutionV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("googleapis", "remotebuildexecution_v2.Remotebuildexecution")
@js.native
class Remotebuildexecution protected ()
  extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

