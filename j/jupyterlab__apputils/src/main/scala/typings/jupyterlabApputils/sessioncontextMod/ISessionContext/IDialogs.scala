package typings.jupyterlabApputils.sessioncontextMod.ISessionContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for a session context dialog provider.
  */
@js.native
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
  def restart(session: typings.jupyterlabApputils.sessioncontextMod.ISessionContext): js.Promise[Boolean] = js.native
  
  /**
    * Select a kernel for the session.
    */
  def selectKernel(session: typings.jupyterlabApputils.sessioncontextMod.ISessionContext): js.Promise[Unit] = js.native
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
  
  @scala.inline
  implicit class IDialogsOps[Self <: IDialogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRestart(value: typings.jupyterlabApputils.sessioncontextMod.ISessionContext => js.Promise[Boolean]): Self = this.set("restart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectKernel(value: typings.jupyterlabApputils.sessioncontextMod.ISessionContext => js.Promise[Unit]): Self = this.set("selectKernel", js.Any.fromFunction1(value))
  }
}
