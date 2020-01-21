package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * City List Response
  */
@js.native
trait SchemaCitiesListResponse extends js.Object {
  /**
    * City collection.
    */
  var cities: js.UndefOr[js.Array[SchemaCity]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#citiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCitiesListResponse {
  @scala.inline
  def apply(cities: js.Array[SchemaCity] = null, kind: String = null): SchemaCitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (cities != null) __obj.updateDynamic("cities")(cities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCitiesListResponse]
  }
}

