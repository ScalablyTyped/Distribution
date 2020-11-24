package typings.jupyterlabServices.sessionManagerMod.SessionManager

import typings.jupyterlabServices.kernelKernelMod.IManager
import typings.luminoPolling.pollMod.Poll.Standby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a SessionManager.
  */
@js.native
trait IOptions
  extends typings.jupyterlabServices.basemanagerMod.BaseManager.IOptions {
  
  /**
    * Kernel Manager
    */
  var kernelManager: IManager = js.native
  
  /**
    * When the manager stops polling the API. Defaults to `when-hidden`.
    */
  var standby: js.UndefOr[Standby] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(kernelManager: IManager): IOptions = {
    val __obj = js.Dynamic.literal(kernelManager = kernelManager.asInstanceOf[js.Any])
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
    def setKernelManager(value: IManager): Self = this.set("kernelManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandby(value: Standby): Self = this.set("standby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandby: Self = this.set("standby", js.undefined)
  }
}
