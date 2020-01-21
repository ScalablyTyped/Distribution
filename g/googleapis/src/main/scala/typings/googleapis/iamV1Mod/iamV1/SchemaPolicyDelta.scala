package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The difference delta between two policies.
  */
@js.native
trait SchemaPolicyDelta extends js.Object {
  /**
    * The delta for Bindings between two policies.
    */
  var bindingDeltas: js.UndefOr[js.Array[SchemaBindingDelta]] = js.native
}

object SchemaPolicyDelta {
  @scala.inline
  def apply(bindingDeltas: js.Array[SchemaBindingDelta] = null): SchemaPolicyDelta = {
    val __obj = js.Dynamic.literal()
    if (bindingDeltas != null) __obj.updateDynamic("bindingDeltas")(bindingDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPolicyDelta]
  }
}

