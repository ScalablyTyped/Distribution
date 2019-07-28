package typings.atJupyterlabServices

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IMimeBundle
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: IMimeBundle
  var metadata: OutputMetadata
  var transient: js.UndefOr[Anon_Displayid] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, transient: Anon_Displayid = null): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata)
    if (transient != null) __obj.updateDynamic("transient")(transient)
    __obj.asInstanceOf[Anon_Data]
  }
}

