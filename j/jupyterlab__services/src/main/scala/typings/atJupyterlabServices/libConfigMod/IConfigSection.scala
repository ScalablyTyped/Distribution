package typings.atJupyterlabServices.libConfigMod

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
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
  val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
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
  def apply(
    data: JSONObject,
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any,
    update: JSONObject => js.Promise[JSONObject]
  ): IConfigSection = {
    val __obj = js.Dynamic.literal(data = data, serverSettings = serverSettings, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[IConfigSection]
  }
}

