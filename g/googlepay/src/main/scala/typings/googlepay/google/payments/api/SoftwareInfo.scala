package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The info of the software used by merchants to integrate with GPay.
  */
trait SoftwareInfo extends js.Object {
  /**
    * The identifier of the software used by merchants to integrate with
    * GPay.
    *
    * Partner's domain name can be used as the identifier.
    *
    * This field is optional.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The version of the software.
    *
    * GPay metrics are provided per version.
    *
    * This field is optional.
    */
  var version: js.UndefOr[String] = js.undefined
}

object SoftwareInfo {
  @scala.inline
  def apply(id: String = null, version: String = null): SoftwareInfo = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareInfo]
  }
}

