package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingBinding extends js.Object {
  var `binding-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
  var `binding-type`: js.UndefOr[BindingType] = js.undefined
}

object FinishingBinding {
  @scala.inline
  def apply(`binding-reference-edge`: ReferenceEdge = null, `binding-type`: BindingType = null): FinishingBinding = {
    val __obj = js.Dynamic.literal()
    if (`binding-reference-edge` != null) __obj.updateDynamic("binding-reference-edge")(`binding-reference-edge`.asInstanceOf[js.Any])
    if (`binding-type` != null) __obj.updateDynamic("binding-type")(`binding-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingBinding]
  }
}

