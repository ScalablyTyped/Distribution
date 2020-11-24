package typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions

import typings.jupyterlabServices.mod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a RunningSessions item.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A click handler for the item. By defult this is used
    * to activate the running sessions side panel.
    */
  def onClick(): Unit = js.native
  
  /**
    * The application service manager.
    */
  var serviceManager: ServiceManager = js.native
}
object IOptions {
  
  @scala.inline
  def apply(onClick: () => Unit, serviceManager: ServiceManager): IOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), serviceManager = serviceManager.asInstanceOf[js.Any])
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
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServiceManager(value: ServiceManager): Self = this.set("serviceManager", value.asInstanceOf[js.Any])
  }
}
