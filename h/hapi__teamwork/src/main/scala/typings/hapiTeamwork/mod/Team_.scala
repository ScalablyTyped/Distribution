package typings.hapiTeamwork.mod

import typings.hapiTeamwork.mod.Team.ElementOf
import typings.hapiTeamwork.mod.Team.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/teamwork", "Team")
@js.native
/**
  * Start a new team work.
  *
  * @param options Configuration of the team work.
  */
class Team_[Results /* <: js.Any | js.Array[_] */] () extends js.Object {
  def this(options: Options) = this()
  
  /**
    * Attend a single meeting.
    *
    * @param note An optional note that will be included in the work's results. If an error is provided, the work will be immediately rejected with that error.
    */
  def attend(): Unit = js.native
  def attend(note: ElementOf[Results]): Unit = js.native
  def attend(note: Error): Unit = js.native
  
  /**
    * Wait for the current work to be done and start another team work.
    *
    * @param options New configuration of the team work.
    *
    * @returns a promise that resolves when the current work is done.
    */
  def regroup(): js.Promise[Unit] = js.native
  def regroup(options: Options): js.Promise[Unit] = js.native
  
  /**
    * Resulting work when all the meetings are done.
    */
  var work: js.Promise[Results] = js.native
}
