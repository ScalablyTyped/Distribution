package typings.atJupyterlabServices.libBuilderMod.BuildManagerNs

import typings.atJupyterlabServices.atJupyterlabServicesStrings.building
import typings.atJupyterlabServices.atJupyterlabServicesStrings.needed
import typings.atJupyterlabServices.atJupyterlabServicesStrings.stable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The build status response from the server.
  */
trait IStatus extends js.Object {
  /**
    * The message associated with the build status.
    */
  val message: String
  /**
    * Whether a build is needed.
    */
  val status: stable | needed | building
}

object IStatus {
  @scala.inline
  def apply(message: String, status: stable | needed | building): IStatus = {
    val __obj = js.Dynamic.literal(message = message, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStatus]
  }
}

