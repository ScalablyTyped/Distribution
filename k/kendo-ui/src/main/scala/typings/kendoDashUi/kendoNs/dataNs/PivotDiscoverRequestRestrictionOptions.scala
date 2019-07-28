package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDiscoverRequestRestrictionOptions extends js.Object {
  var catalogName: String
  var cubeName: String
}

object PivotDiscoverRequestRestrictionOptions {
  @scala.inline
  def apply(catalogName: String, cubeName: String): PivotDiscoverRequestRestrictionOptions = {
    val __obj = js.Dynamic.literal(catalogName = catalogName, cubeName = cubeName)
  
    __obj.asInstanceOf[PivotDiscoverRequestRestrictionOptions]
  }
}

