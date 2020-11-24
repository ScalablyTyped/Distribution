package typings.jupyterlabServices.builderMod.BuildManager

import typings.jupyterlabServices.jupyterlabServicesStrings.building
import typings.jupyterlabServices.jupyterlabServicesStrings.needed
import typings.jupyterlabServices.jupyterlabServicesStrings.stable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The build status response from the server.
  */
@js.native
trait IStatus extends js.Object {
  
  /**
    * The message associated with the build status.
    */
  val message: String = js.native
  
  /**
    * Whether a build is needed.
    */
  val status: stable | needed | building = js.native
}
object IStatus {
  
  @scala.inline
  def apply(message: String, status: stable | needed | building): IStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatus]
  }
  
  @scala.inline
  implicit class IStatusOps[Self <: IStatus] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: stable | needed | building): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
