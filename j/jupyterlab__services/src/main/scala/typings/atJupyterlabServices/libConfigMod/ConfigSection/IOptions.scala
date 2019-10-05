package typings.atJupyterlabServices.libConfigMod.ConfigSection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a config section.
  */
trait IOptions extends js.Object {
  /**
    * The section name.
    */
  var name: String
  /**
    * The optional server settings.
    */
  var serverSettings: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    name: String,
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    __obj.asInstanceOf[IOptions]
  }
}

