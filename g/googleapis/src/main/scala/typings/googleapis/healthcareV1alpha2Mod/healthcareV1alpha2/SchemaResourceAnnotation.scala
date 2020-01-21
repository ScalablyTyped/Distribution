package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource level annotation.
  */
@js.native
trait SchemaResourceAnnotation extends js.Object {
  var label: js.UndefOr[String] = js.native
}

object SchemaResourceAnnotation {
  @scala.inline
  def apply(label: String = null): SchemaResourceAnnotation = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceAnnotation]
  }
}

