package typings.atJupyterlabLogconsole.libRegistryMod.LoggerRegistry

import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var defaultRendermime: IRenderMimeRegistry
  var maxLength: Double
}

object IOptions {
  @scala.inline
  def apply(defaultRendermime: IRenderMimeRegistry, maxLength: Double): IOptions = {
    val __obj = js.Dynamic.literal(defaultRendermime = defaultRendermime.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

