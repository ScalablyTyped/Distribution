package typings
package atJupyterlabServicesLib.libBuilderMod.BuildManagerNs

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
  val message: java.lang.String
  /**
    * Whether a build is needed.
    */
  val status: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stable | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.needed | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.building
}

object IStatus {
  @scala.inline
  def apply(
    message: java.lang.String,
    status: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.stable | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.needed | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.building
  ): IStatus = {
    val __obj = js.Dynamic.literal(message = message, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStatus]
  }
}

