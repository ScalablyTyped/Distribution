package typings
package atJupyterlabServicesLib.libContentsMod.ContentsManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a contents manager.
  */
trait IOptions extends js.Object {
  /**
    * The default drive backend for the contents manager.
    */
  var defaultDrive: js.UndefOr[atJupyterlabServicesLib.libContentsMod.ContentsNs.IDrive] = js.undefined
  /**
    * The server settings associated with the manager.
    */
  var serverSettings: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    defaultDrive: atJupyterlabServicesLib.libContentsMod.ContentsNs.IDrive = null,
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultDrive != null) __obj.updateDynamic("defaultDrive")(defaultDrive)
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    __obj.asInstanceOf[IOptions]
  }
}

