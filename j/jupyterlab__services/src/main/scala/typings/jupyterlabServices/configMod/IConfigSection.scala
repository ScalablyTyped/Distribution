package typings.jupyterlabServices.configMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfigSection extends js.Object {
  
  /**
    * The data for this section.
    */
  val data: JSONObject = js.native
  
  /**
    * The server settings for the section.
    */
  val serverSettings: ISettings = js.native
  
  /**
    * Modify the stored config values.
    *
    * #### Notes
    * Updates the local data immediately, sends the change to the server,
    * and updates the local data with the response, and fulfils the promise
    * with that data.
    */
  def update(newdata: JSONObject): js.Promise[JSONObject] = js.native
}
object IConfigSection {
  
  @scala.inline
  def apply(data: JSONObject, serverSettings: ISettings, update: JSONObject => js.Promise[JSONObject]): IConfigSection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[IConfigSection]
  }
  
  @scala.inline
  implicit class IConfigSectionOps[Self <: IConfigSection] (val x: Self) extends AnyVal {
    
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
    def setData(value: JSONObject): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSettings(value: ISettings): Self = this.set("serverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: JSONObject => js.Promise[JSONObject]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
