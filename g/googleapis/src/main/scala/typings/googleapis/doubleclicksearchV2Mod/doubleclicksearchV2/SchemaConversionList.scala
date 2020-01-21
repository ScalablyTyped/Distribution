package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of conversions.
  */
@js.native
trait SchemaConversionList extends js.Object {
  /**
    * The conversions being requested.
    */
  var conversion: js.UndefOr[js.Array[SchemaConversion]] = js.native
  /**
    * Identifies this as a ConversionList resource. Value: the fixed string
    * doubleclicksearch#conversionList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaConversionList {
  @scala.inline
  def apply(conversion: js.Array[SchemaConversion] = null, kind: String = null): SchemaConversionList = {
    val __obj = js.Dynamic.literal()
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConversionList]
  }
}

