package typings.atJupyterlabServices

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IMimeBundle
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.OutputMetadata
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

