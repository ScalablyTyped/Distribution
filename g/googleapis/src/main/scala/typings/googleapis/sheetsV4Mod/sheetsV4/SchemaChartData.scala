package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data included in a domain or series.
  */
@js.native
trait SchemaChartData extends js.Object {
  /**
    * The source ranges of the data.
    */
  var sourceRange: js.UndefOr[SchemaChartSourceRange] = js.native
}

object SchemaChartData {
  @scala.inline
  def apply(sourceRange: SchemaChartSourceRange = null): SchemaChartData = {
    val __obj = js.Dynamic.literal()
    if (sourceRange != null) __obj.updateDynamic("sourceRange")(sourceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChartData]
  }
}

