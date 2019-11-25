package typings.kendoDashUi.kendo.data

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
    val __obj = js.Dynamic.literal(catalogName = catalogName.asInstanceOf[js.Any], cubeName = cubeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PivotDiscoverRequestRestrictionOptions]
  }
}

