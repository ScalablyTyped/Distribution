package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a mobile carrier that can be targeted by ads.
  */
@js.native
trait SchemaMobileCarrier extends js.Object {
  /**
    * Country code of the country to which this mobile carrier belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * DART ID of the country to which this mobile carrier belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  /**
    * ID of this mobile carrier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarrier&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this mobile carrier.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaMobileCarrier {
  @scala.inline
  def apply(
    countryCode: String = null,
    countryDartId: String = null,
    id: String = null,
    kind: String = null,
    name: String = null
  ): SchemaMobileCarrier = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileCarrier]
  }
}

