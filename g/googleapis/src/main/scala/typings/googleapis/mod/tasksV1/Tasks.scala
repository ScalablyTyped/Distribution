package typings.googleapis.mod.tasksV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tasks API
  *
  * Manages your tasks and task lists.
  *
  * @example
  * const {google} = require('googleapis');
  * const tasks = google.tasks('v1');
  *
  * @namespace tasks
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Tasks
  */
@JSImport("googleapis", "tasks_v1.Tasks")
@js.native
class Tasks protected ()
  extends typings.googleapis.tasksV1Mod.tasksV1.Tasks {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
