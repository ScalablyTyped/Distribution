package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDiscoverRequestRestrictionOptions extends js.Object {
  var catalogName: java.lang.String
  var cubeName: java.lang.String
}

object PivotDiscoverRequestRestrictionOptions {
  @scala.inline
  def apply(catalogName: java.lang.String, cubeName: java.lang.String): PivotDiscoverRequestRestrictionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catalogName")(catalogName)
    __obj.updateDynamic("cubeName")(cubeName)
    __obj.asInstanceOf[PivotDiscoverRequestRestrictionOptions]
  }
}

