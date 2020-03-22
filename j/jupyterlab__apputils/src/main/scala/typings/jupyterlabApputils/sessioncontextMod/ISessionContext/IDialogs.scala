package typings.jupyterlabApputils.sessioncontextMod.ISessionContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a session context dialog provider.
  */
trait IDialogs extends js.Object {
  /**
    * Restart the session context.
    *
    * @returns A promise that resolves with whether the kernel has restarted.
    *
    * #### Notes
    * If there is a running kernel, present a dialog.
    * If there is no kernel, we start a kernel with the last run
    * kernel name and resolves with `true`. If no kernel has been started,
    * this is a no-op, and resolves with `false`.
    */
  def restart(session: typings.jupyterlabApputils.sessioncontextMod.ISessionContext): js.Promise[Boolean]
  /**
    * Select a kernel for the session.
    */
  def selectKernel(session: typings.jupyterlabApputils.sessioncontextMod.ISessionContext): js.Promise[Unit]
}

object IDialogs {
  @scala.inline
  def apply(
    restart: typings.jupyterlabApputils.sessioncontextMod.ISessionContext => js.Promise[Boolean],
    selectKernel: typings.jupyterlabApputils.sessioncontextMod.ISessionContext => js.Promise[Unit]
  ): IDialogs = {
    val __obj = js.Dynamic.literal(restart = js.Any.fromFunction1(restart), selectKernel = js.Any.fromFunction1(selectKernel))
  
    __obj.asInstanceOf[IDialogs]
  }
}

