package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a postal code that can be targeted by ads.
  */
@js.native
trait SchemaPostalCode extends js.Object {
  /**
    * Postal code. This is equivalent to the id field.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Country code of the country to which this postal code belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * DART ID of the country to which this postal code belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  /**
    * ID of this postal code.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#postalCode&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPostalCode {
  @scala.inline
  def apply(
    code: String = null,
    countryCode: String = null,
    countryDartId: String = null,
    id: String = null,
    kind: String = null
  ): SchemaPostalCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostalCode]
  }
}

