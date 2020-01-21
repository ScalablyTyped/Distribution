package typings.jupyterlabServices.configMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigSection extends js.Object {
  /**
    * The data for this section.
    */
  val data: JSONObject
  /**
    * The server settings for the section.
    */
  val serverSettings: ISettings
  /**
    * Modify the stored config values.
    *
    * #### Notes
    * Updates the local data immediately, sends the change to the server,
    * and updates the local data with the response, and fulfils the promise
    * with that data.
    */
  def update(newdata: JSONObject): js.Promise[JSONObject]
}

object IConfigSection {
  @scala.inline
  def apply(data: JSONObject, serverSettings: ISettings, update: JSONObject => js.Promise[JSONObject]): IConfigSection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[IConfigSection]
  }
}

