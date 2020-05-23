package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var data: IMimeBundle
  var metadata: OutputMetadata
  var transient: js.UndefOr[Displayid] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, transient: Displayid = null): Metadata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

