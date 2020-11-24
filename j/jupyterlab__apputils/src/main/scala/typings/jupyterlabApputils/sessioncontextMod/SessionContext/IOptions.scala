package typings.jupyterlabApputils.sessioncontextMod.SessionContext

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabServices.sessionSessionMod.IManager
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a context.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.native
  
  /**
    * The name of the session.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The initial path of the file.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * A session manager instance.
    */
  var sessionManager: IManager = js.native
  
  /**
    * A function to call when the session becomes busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
  
  /**
    * A kernel spec manager instance.
    */
  var specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager = js.native
  
  /**
    * The type of the session.
    */
  var `type`: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    sessionManager: IManager,
    specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager
  ): IOptions = {
    val __obj = js.Dynamic.literal(sessionManager = sessionManager.asInstanceOf[js.Any], specsManager = specsManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setSessionManager(value: IManager): Self = this.set("sessionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecsManager(value: typings.jupyterlabServices.kernelspecKernelspecMod.IManager): Self = this.set("specsManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelPreference(value: IKernelPreference): Self = this.set("kernelPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelPreference: Self = this.set("kernelPreference", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSetBusy(value: () => IDisposable): Self = this.set("setBusy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetBusy: Self = this.set("setBusy", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
