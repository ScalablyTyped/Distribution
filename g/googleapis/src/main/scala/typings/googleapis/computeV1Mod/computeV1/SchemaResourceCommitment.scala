package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Commitment for a particular resource (a Commitment is composed of one or
  * more of these).
  */
@js.native
trait SchemaResourceCommitment extends js.Object {
  /**
    * The amount of the resource purchased (in a type-dependent unit, such as
    * bytes). For vCPUs, this can just be an integer. For memory, this must be
    * provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of
    * memory per every vCPU.
    */
  var amount: js.UndefOr[String] = js.native
  /**
    * Type of resource for which this commitment applies. Possible values are
    * VCPU and MEMORY
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaResourceCommitment {
  @scala.inline
  def apply(amount: String = null, `type`: String = null): SchemaResourceCommitment = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceCommitment]
  }
}

