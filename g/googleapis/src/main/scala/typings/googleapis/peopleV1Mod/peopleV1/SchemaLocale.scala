package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s locale preference.
  */
@js.native
trait SchemaLocale extends js.Object {
  /**
    * Metadata about the locale.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language
    * tag representing the locale.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaLocale {
  @scala.inline
  def apply(metadata: SchemaFieldMetadata = null, value: String = null): SchemaLocale = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocale]
  }
}

