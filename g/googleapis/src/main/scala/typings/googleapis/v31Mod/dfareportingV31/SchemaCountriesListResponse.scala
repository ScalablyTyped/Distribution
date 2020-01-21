package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Country List Response
  */
@js.native
trait SchemaCountriesListResponse extends js.Object {
  /**
    * Country collection.
    */
  var countries: js.UndefOr[js.Array[SchemaCountry]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#countriesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCountriesListResponse {
  @scala.inline
  def apply(countries: js.Array[SchemaCountry] = null, kind: String = null): SchemaCountriesListResponse = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCountriesListResponse]
  }
}

