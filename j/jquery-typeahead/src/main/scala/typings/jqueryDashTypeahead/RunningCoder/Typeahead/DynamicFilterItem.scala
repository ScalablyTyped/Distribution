package typings.jqueryDashTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicFilterItem extends js.Object {
  var key: String
  var selector: String
}

object DynamicFilterItem {
  @scala.inline
  def apply(key: String, selector: String): DynamicFilterItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamicFilterItem]
  }
}

