package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DerivedSource.
  */
@js.native
trait SchemaSourceSplitShard extends js.Object {
  /**
    * DEPRECATED
    */
  var derivationMode: js.UndefOr[String] = js.native
  /**
    * DEPRECATED
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceSplitShard {
  @scala.inline
  def apply(derivationMode: String = null, source: SchemaSource = null): SchemaSourceSplitShard = {
    val __obj = js.Dynamic.literal()
    if (derivationMode != null) __obj.updateDynamic("derivationMode")(derivationMode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceSplitShard]
  }
}

