package typings.jupyterlabServices

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetadata extends js.Object {
  var data: IMimeBundle
  var metadata: OutputMetadata
  var transient: js.UndefOr[AnonDisplayid] = js.undefined
}

object AnonMetadata {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, transient: AnonDisplayid = null): AnonMetadata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetadata]
  }
}

