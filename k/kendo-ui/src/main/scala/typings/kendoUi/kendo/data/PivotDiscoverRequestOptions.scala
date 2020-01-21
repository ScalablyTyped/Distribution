package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDiscoverRequestOptions extends js.Object {
  var data: PivotDiscoverRequestDataOptions
}

object PivotDiscoverRequestOptions {
  @scala.inline
  def apply(data: PivotDiscoverRequestDataOptions): PivotDiscoverRequestOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PivotDiscoverRequestOptions]
  }
}

