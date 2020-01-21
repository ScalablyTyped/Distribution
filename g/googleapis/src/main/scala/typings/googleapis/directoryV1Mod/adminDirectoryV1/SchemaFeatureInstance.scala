package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a &quot;feature instance&quot;.
  */
@js.native
trait SchemaFeatureInstance extends js.Object {
  /**
    * The feature that this is an instance of. A calendar resource may have
    * multiple instances of a feature.
    */
  var feature: js.UndefOr[SchemaFeature] = js.native
}

object SchemaFeatureInstance {
  @scala.inline
  def apply(feature: SchemaFeature = null): SchemaFeatureInstance = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFeatureInstance]
  }
}

