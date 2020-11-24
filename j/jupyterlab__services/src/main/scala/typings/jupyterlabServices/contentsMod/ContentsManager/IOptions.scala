package typings.jupyterlabServices.contentsMod.ContentsManager

import typings.jupyterlabServices.contentsMod.Contents.IDrive
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a contents manager.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The default drive backend for the contents manager.
    */
  var defaultDrive: js.UndefOr[IDrive] = js.native
  
  /**
    * The server settings associated with the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
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
    def setDefaultDrive(value: IDrive): Self = this.set("defaultDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDrive: Self = this.set("defaultDrive", js.undefined)
    
    @scala.inline
    def setServerSettings(value: ISettings): Self = this.set("serverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSettings: Self = this.set("serverSettings", js.undefined)
  }
}
