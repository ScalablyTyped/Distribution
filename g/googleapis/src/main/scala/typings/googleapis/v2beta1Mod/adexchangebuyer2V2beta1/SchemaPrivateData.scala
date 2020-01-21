package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Buyers are allowed to store certain types of private data in a
  * proposal/deal.
  */
@js.native
trait SchemaPrivateData extends js.Object {
  /**
    * A buyer or seller specified reference ID. This can be queried in the list
    * operations (max-length: 1024 unicode code units).
    */
  var referenceId: js.UndefOr[String] = js.native
}

object SchemaPrivateData {
  @scala.inline
  def apply(referenceId: String = null): SchemaPrivateData = {
    val __obj = js.Dynamic.literal()
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrivateData]
  }
}

